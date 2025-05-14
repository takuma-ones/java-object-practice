package sample2.sample2_05;

class Sample2_05_1_Dog {
	
	//---フィールド-------------------------------------
	
	String voice ; //鳴き声
	
	//---コンストラクタ---------------------------------
	
	Sample2_05_1_Dog(){
		this.voice = "ワンワン" ;
	}
	
	Sample2_05_1_Dog(String v){
		this.voice = v ;
	}
	
	//---メソッド---------------------------------------
	
	//吠える
	void bark(){
		System.out.println( voice ) ;
	}
}
