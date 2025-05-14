package sample2.sample2_05;

class Sample2_05_1_Main {
	public static void main (String[] args) {
		
		//シナリオ①：車を場に登場させる（Sample2_01_1_carクラスのインスタンス化）
		
		Sample2_05_1_ToyPoodle toyPoo1 = new Sample2_05_1_ToyPoodle();
		Sample2_05_1_ToyPoodle toyPoo2 = new Sample2_05_1_ToyPoodle("キャンキャン");
		Sample2_05_1_ToyPoodle moco    = new Sample2_05_1_ToyPoodle("MOCO" , "かわいくストレッチ！" , "ヒャンヒャン");
		
		
		//シナリオ②：「toyPoo1」インスタンスの確認
		System.out.println("▼シナリオ②：「toyPoo1」インスタンスの確認-----------------") ;
		System.out.println( toyPoo1.name ) ;
		toyPoo1.bark() ;
		toyPoo1.doSkill() ;
		
		//シナリオ③：「toyPoo2」インスタンスの確認
		System.out.println("▼シナリオ③：「toyPoo2」インスタンスの確認-----------------") ;
		System.out.println( toyPoo2.name ) ;
		toyPoo2.bark() ;
		toyPoo2.doSkill() ;
		
		//シナリオ④：「moco」インスタンスの確認
		System.out.println("▼シナリオ④：「moco」インスタンスの確認--------------------") ;
		System.out.println( moco.name ) ;
		moco.bark() ;
		moco.doSkill() ;
		
	}
}

