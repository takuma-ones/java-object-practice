package sample2.sample2_04;

class Sample2_04_2_Moco extends Sample2_04_2_Dog {
	
	//---フィールド-------------------------------------
	
	String name = "MOCO" ; //名前
	
	//---メソッド---------------------------------------
	
	//かわいくストレッチ（UZUZの就活犬MOCOちゃんの特技）
	void cuteStretch(){
		System.out.println("かわいくストレッチ！") ;
	}
	
	//スーパークラスも含め、すべてのフィールドの情報を表示
	void printAllInfo(){
		System.out.println( "name:" + name + " / type:" + type + " / group:" + group ) ;
	}
	
	//スーパークラスも含め、すべてのメソッドを実行 ※printAllInfoメソッドは除く
	void executeAllAction(){
		cuteStretch() ;
		bark() ;
		breatheLungs() ;
	}
	
}
