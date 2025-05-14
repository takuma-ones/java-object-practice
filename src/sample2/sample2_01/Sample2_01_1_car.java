package sample2.sample2_01;

class Sample2_01_1_car {
	
	//---フィールド（クラス直下で定義された変数）----------------
	
	String  carModel = "クーペ" ;  //車種名
	String  owner    = "モコ"   ;  //オーナー
	String  color    = "RED"    ;  //塗装色
	int     speed    = 0        ;  //現在の速度
	boolean right    = false    ;  //ライト（true:点灯/false:消灯）
	
	//---メソッド------------------------------------------------
	
	//acceleratorメソッド（現在の速度を1km/h上げる）
	void accelerator(){
		speed++ ;
		System.out.println("（少し速くなった）") ;
	}
	
	//brakeメソッド（現在の速度を1km/h下げる）
	void brake(){
		speed-- ;
		System.out.println("（少し遅くなった）") ;
	}
	
	//rightOnメソッド（ライトを点灯させる）
	void rightOn(){
		right = true ;
		System.out.println("（周囲が明るくなった）") ;
	}
	
	//rightOffメソッド（ライトを消灯する）
	void rightOff(){
		right = false ;
		System.out.println("（周囲が暗くなった）") ;
	}
	//klaxonメソッド（クラクションを鳴らす）
	void klaxon(){
		System.out.println("「プップ～～～～～～～～～～ッ」") ;
	}
}
