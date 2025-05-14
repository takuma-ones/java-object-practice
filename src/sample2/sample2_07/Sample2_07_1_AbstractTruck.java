package sample2.sample2_07;
abstract class Sample2_07_1_AbstractTruck {
	
	//---抽象メソッド------------------------------------------------
	
	//acceleratorメソッド（現在の速度を上げる）
	abstract void accelerator() ;
	
	//brakeメソッド（現在の速度を下げる）
	abstract void brake() ;
	
	//paintメソッド（色を塗る）
	abstract void paint( String cl ) ;
	
}
