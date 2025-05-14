package sample3.monster.character;

import sample3.monster.base.Monster3;

//検証用クラス
public class Fushigiyade  extends Monster3 {
	//------------コンストラクタ------------
	//コンストラクタ1[引数なし]
	public Fushigiyade(){
		//super()が暗黙的に実行されています
		super.setCharacter("フシギヤデ");
	}
	//コンストラクタ2[引数1:トレーナー, 引数2:なまえ]
	public Fushigiyade(String tr, String nm){
		super(tr,nm);
		super.setCharacter("フシギヤデ");
	}
	//コンストラクタ3[引数1:トレーナー, 引数2:なまえ, 引数3:レベル]
	public Fushigiyade(String tr, String nm, int lev){
		super(tr,nm,lev);
		super.setCharacter("フシギヤデ");
	}

	//------------メソッド------------
	//levelUpメソッド
	//[引数:レベル（int型）/戻り値:なし/機能:引数を元にフィールドの値を更新する]
	public void levelUp(int up){
		setLv(    getLv()    + 1   * up )  ;
		setHpMax( getHpMax() + 31  * up )  ;
		setAtk(   getAtk()   + 6   * up )  ;
		setDef(   getDef()   + 7   * up )  ;
		setSpd(   getSpd()   + 8   * up )  ;
		setHp(    getHpMax() )             ;
	}
}