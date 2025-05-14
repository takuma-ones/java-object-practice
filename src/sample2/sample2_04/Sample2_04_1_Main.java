package sample2.sample2_04;

class Sample2_04_1_Main {
	public static void main (String[] args) {
		
		//シナリオ①：車を場に登場させる（Sample2_01_1_carクラスのインスタンス化）
		
		Sample2_04_1_Moco moco = new Sample2_04_1_Moco();
		
		
		//シナリオ②：「Sample2_04_1_Moco」クラスのメンバの使用
		System.out.println("▼シナリオ②：「Sample2_04_1_Moco」クラスのメンバの使用-----------------") ;
		
		System.out.println( moco.name ) ;
		moco.cuteStretch() ;
		
		
		//シナリオ②：「Sample2_04_1_Dog」クラスのメンバの使用
		System.out.println("▼シナリオ③：「Sample2_04_1_Dog」クラスのメンバの使用------------------") ;
		
		System.out.println( moco.type ) ;
		moco.bark() ;
		
		
		//シナリオ②：「Sample2_04_1_Mammals」クラスのメンバの使用
		System.out.println("▼シナリオ④：「Sample2_04_1_Mammals」クラスのメンバの使用--------------") ;
		
		System.out.println( moco.group ) ;
		moco.breatheLungs() ;
		
		
	}
}

