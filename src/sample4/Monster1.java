package sample4;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Monster1 {

	//------------フィールド------------
	String character     = "(unknown)"  ;       //種族
	String trainer       = "(wild)"     ;       //トレーナー
	String name          = "(noname)"   ;       //なまえ
	int    lv            = 1            ;       //レベル
	int    hp            = 80           ;       //HP
	int    atk           = 15           ;       //こうげき
	int    def           = 10           ;       //ぼうぎょ
	int    spd           = 10           ;       //すばやさ
	int    hpMax         = 80           ;       //HP初期値
	String wazaNm        = "たいあたり" ;       //わざ（なまえ）
	String wazaDmgRate   = "1.0"        ;       //わざ（ダメージ倍率）
	//------------フィールド(定数)------------
	final String WAZA_DMG_RATE_REGEXP = "^[0-9]+\\.[0-9]$"  ;  //バリデーションチェックで使用する正規表現
	final String DMG_CORRECTION_120 = "120" ;                     //ダメージ計算の補正で使う数字
	final String DMG_CORRECTION_1   = "1"   ;                     //ダメージ計算の補正で使う数字

	//------------toStringメソッド------------
	//すべてのフィールドの値を返す ※あくまでプログラマーの確認用として使用する
	public String toString(){
		String status = "[ " +  name  + " lv" + lv  + " HP" + hp + "/" + hpMax
		                + " ] (status) character:" + character + " trainer:" + trainer
		                + " atk:" + atk + " def:" + def + " spd:" + spd + " wazaNm:"
		                + wazaNm + " wazaDmgRate:" + wazaDmgRate ;
		return status;
	}
	//------------メソッド------------
	//levelUpメソッド
	//[引数:レベル（int型）/戻り値:なし/機能:引数を元にフィールドの値を更新する]
	void levelUp(int up){
		lv    = lv    + 1  * up  ;
		hpMax = hpMax + 30 * up  ;
		atk   = atk   + 5  * up  ;
		def   = def   + 5  * up  ;
		spd   = spd   + 5  * up  ;
		hp    = hpMax ;
	}

	//setWazaメソッド
	//[引数1:わざ名（String型）,引数2:ダメージ（String型）/戻り値:なし/機能:わざ名とそのダメージを設定する]
	void setWaza(String nm, String dmr){

		//バリデーションチェック：引数2が「X.X(Xは0～9の数字のいずれか)」形式で渡されたかをチェック
		if(dmr.matches(WAZA_DMG_RATE_REGEXP)){
			wazaNm  = nm;
			wazaDmgRate = dmr;
		}else{
			System.out.println("[ERROR]わざの設定に失敗しました");
		}
	}

	//getStatusメソッド
	//[引数:なし/戻り値:ステータス情報/機能:ステータス情報（一部フィールドの情報）を文字列で返す]
	String getStatus(){

		//ステータス情報の整形	・・・ 【例】[ ピカ丸 lv20 HP500/688 ]
		String status = "[ " +  name  + " lv" + lv  + " HP" + hp + "/" + hpMax + " ]";

		return status;
	}

	//useWazaメソッド
	//[引数:なし/戻り値:相手に値渡しするダメージ（int型）/機能:相手に値渡しする理論上のダメージを計算して返す]
	int useWaza(){

		//相手に値渡しするダメージの計算方法：こうげき×わざのダメージ倍率
		//BigDecimalで計算した値の小数点以下を切り捨て、BigDecimal型→int型へと変換
		BigDecimal bdAtk  = new BigDecimal(atk);
		BigDecimal bdDmrt = new BigDecimal(wazaDmgRate);
		int dmg = ( bdAtk.multiply(bdDmrt) ).intValue();

		return dmg;
	}

	//damagedメソッド
	//[引数:値渡しされたダメージ（int型）/戻り値:実際に受けるダメージ（int型）/機能:実際に受けるダメージを計算してHPから減算する]
	int damaged(int orgDm){
		BigDecimal bdOrgDm   = new BigDecimal(orgDm);
		BigDecimal bdDmCr120 = new BigDecimal(DMG_CORRECTION_120);
		BigDecimal bdDmCr1   = new BigDecimal(DMG_CORRECTION_1);
		BigDecimal bdDef     = new BigDecimal(def);

		//ダメージ減算率：1 / (1＋ぼうぎょ÷120)  ※小数第３位切り捨て
		BigDecimal dmRate = bdDmCr1.divide( bdDmCr1.add( bdDef.divide(bdDmCr120, 2, RoundingMode.DOWN) ), 2, RoundingMode.DOWN );

		//BigDecimalで計算した値の小数点以下を切り捨て、BigDecimal型→int型へと変換
		//実際に受けるダメージ計算：受け取ったダメージ値×ダメージ減算率
		int dmg  = ( bdOrgDm.multiply( dmRate ) ).intValue();

		//実際に受けるダメージがHPよりも大きい場合は残HPを0とする
		if(hp > dmg){
			hp = hp - dmg ;
		}else{
			hp = 0 ;
		}
		return dmg;   //実際に受けるダメージの値を返す
	}
}
