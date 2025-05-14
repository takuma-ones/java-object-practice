package sample2.sample2_05;

class Sample2_05_3_ToyPoodle {
	
	//---フィールド-------------------------------------
	
	String name  ; //名前
	String skill ; //特技
	
	//---コンストラクタ---------------------------------
	
	Sample2_05_3_ToyPoodle(String nm , String sk ){
		this.name  = nm ;
		this.skill = sk ;
	}
	
	//---メソッド---------------------------------------
	
	//toStringメソッド（オーバーライド）
	public String toString(){
		return "ToyPoodle ( name:" + this.name + " / " + "skill:" + this.skill + " )";
	}
	
}
