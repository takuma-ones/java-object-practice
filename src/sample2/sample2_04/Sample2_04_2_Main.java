package sample2.sample2_04;

class Sample2_04_2_Main {
	public static void main (String[] args) {
		
		//シナリオ①：車を場に登場させる（Sample2_01_1_carクラスのインスタンス化）
		Sample2_04_2_Moco moco = new Sample2_04_2_Moco();
		
		
		//シナリオ②：「Sample2_04_2_Dog」クラスのメソッド（printAllInfo、executeAllAction）の実行
		System.out.println("▼シナリオ②：「Sample2_04_2_Moco」クラスのメンバの使用-----------------") ;
		moco.printAllInfo() ;
		moco.executeAllAction() ;
		
		
	}
}
