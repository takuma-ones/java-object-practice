package sample4;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Monster3 {

	//------------フィールド------------
	private String character     ;               //種族
	private String trainer       ;               //トレーナー
	private String name          ;               //なまえ
	private int    lv            ;               //レベル
	private int    hp            ;               //HP
	private int    atk           ;               //こうげき
	private int    def           ;               //ぼうぎょ
	private int    spd           ;               //すばやさ
	private int    hpMax         ;               //HP初期値
	private String wazaNm        ;               //わざ（なまえ）
	private String wazaDmgRate   ;               //わざ（ダメージ）
	//------------フィールド(定数)------------
	final String WAZA_DMG_RATE_REGEXP = "^[0-9]+\\.[0-9]$"  ;  //バリデーションチェックで使用する正規表現
	final String DMG_CORRECTION_120 = "120" ;                     //ダメージ計算の補正で使う数字
	final String DMG_CORRECTION_1   = "1"   ;                     //ダメージ計算の補正で使う数字

	//------------コンストラクタ------------
	//コンストラクタ1[引数なし]
	Monster3(){
		this.character   = "(unknown)"  ; //(初期化)種族
		this.trainer     = "(wild)"     ; //(初期化)トレーナー
		this.name        = "(noname)"   ; //(初期化)なまえ
		this.lv          = 1            ; //(初期化)レベル
		this.hp          = 80           ; //(初期化)HP
		this.atk         = 15           ; //(初期化)こうげき
		this.def         = 10           ; //(初期化)ぼうぎょ
		this.spd         = 10           ; //(初期化)すばやさ
		this.hpMax       = 80           ; //(初期化)HP初期値
		this.wazaNm      = "たいあたり" ; //(初期化)わざ（なまえ）
		this.wazaDmgRate = "1.0"        ; //(初期化)わざ（ダメージ）
	}
	//コンストラクタ2[引数1:トレーナー, 引数2:なまえ]
	Monster3(String tr, String nm){
		this();                          //コンストラクタ1の呼び出し
		this.trainer    = tr   ;         //(初期化)トレーナー
		this.name       = nm   ;         //(初期化)なまえ
	}
	//コンストラクタ3[引数1:トレーナー, 引数2:なまえ, 引数3:レベル]
	Monster3(String tr, String nm, int lev){
		this(tr, nm);                //コンストラクタ2の呼び出し
		//levelUpメソッドを用いて内部的にレベルと連動するステータスを引き上げる
		if(lev > 1){
			levelUp(lev - 1);
		}
	}

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
	public void levelUp(int up){
		lv    = lv    + 1  * up  ;
		hpMax = hpMax + 30 * up  ;
		atk   = atk   + 5  * up  ;
		def   = def   + 5  * up  ;
		spd   = spd   + 5  * up  ;
		hp    = hpMax ;
	}

	//setWazaメソッド
	//[引数1:わざ名（String型）,引数2:ダメージ（String型）/戻り値:なし/機能:わざ名とそのダメージを設定する]
	public void setWaza(String nm, String dmr){

		//バリデーションチェック：引数2が小数点数(小数第一位まで)で渡されたかをチェック
		if(dmr.matches(WAZA_DMG_RATE_REGEXP)){
			wazaNm  = nm;
			wazaDmgRate = dmr;
		}else{
			System.out.println("[ERROR]わざの設定に失敗しました");
		}
	}

	//getStatusメソッド
	//[引数:なし/戻り値:ステータス情報/機能:ステータス情報（一部フィールドの情報）を文字列で返す]
	public String getStatus(){

		//ステータス情報の整形	・・・ 【例】[ ピカ丸 lv20 HP500/688 ]
		String status = "[ " +  name  + " lv" + lv  + " HP" + hp + "/" + hpMax + " ]";

		return status;
	}

	//useWazaメソッド
	//[引数:なし/戻り値:相手に値渡しするダメージ（int型）/機能:相手に値渡しする理論上のダメージを計算して返す]
	public int useWaza(){

		//相手に値渡しするダメージの計算方法：こうげき×わざのダメージ倍率
		//BigDecimalで計算した値の小数点以下を切り捨て、BigDecimal型→int型へと変換
		BigDecimal bdAtk  = new BigDecimal(atk);
		BigDecimal bdDmrt = new BigDecimal(wazaDmgRate);
		int dmg = ( bdAtk.multiply(bdDmrt) ).intValue();

		return dmg;
	}

	//damagedメソッド
	//[引数:値渡しされたダメージ（int型）/戻り値:実際に受けるダメージ（int型）/機能:実際に受けるダメージを計算してHPから減算する]
	public int damaged(int orgDm){
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

	//------------getter,setter------------
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}
	public int getHpMax() {
		return hpMax;
	}
	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}
	public String getWazaNm() {
		return wazaNm;
	}
	public void setWazaNm(String wazaNm) {
		this.wazaNm = wazaNm;
	}
	public String getWazaDmgRate() {
		return wazaDmgRate;
	}
	public void setWazaDmgRate(String wazaDmgRate) {
		this.wazaDmgRate = wazaDmgRate;
	}
}