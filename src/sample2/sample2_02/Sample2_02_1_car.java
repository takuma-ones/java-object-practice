package sample2.sample2_02;


class Sample2_02_1_car {
	
	//---フィールド（クラス直下で定義された変数）----------------
	
	String  carModel ;  //車種名
	String  owner    ;  //オーナー
	String  color    ;  //塗装色
	int     speed    ;  //現在の速度
	boolean right    ;  //ライト（true:点灯/false:消灯）
	
	//---コンストラクタ------------------------------------------------
	
	//コンストラクタ①（引数なし）
	Sample2_02_1_car(){
		System.out.println("　　▼コンストラクタ①（引数なし）-------------------------") ;
		carModel = "未登録" ;  //車種名
		owner    = "未登録" ;  //オーナー
		color    = "未登録" ;  //塗装色
		speed    = 0        ;  //現在の速度
		right    = false    ;  //ライト（true:点灯/false:消灯）
		System.out.println("　　▲-----------------------------------------------------") ;
	}
	
	//コンストラクタ②（引数あり）
	Sample2_02_1_car(String cm , String on , String cl , int sp , boolean rt ){
		System.out.println("　　▼コンストラクタ②（引数あり）-------------------------") ;
		carModel = cm ;        //車種名
		owner    = on ;        //オーナー
		color    = cl ;        //塗装色
		speed    = sp ;        //現在の速度
		right    = rt ;        //ライト（true:点灯/false:消灯）
		System.out.println("　　▲-----------------------------------------------------") ;
	}
	
	//---メソッド------------------------------------------------
	
	//acceleratorメソッド（現在の速度を1km/h上げる）
	void accelerator(){
		speed++ ;
		System.out.println(owner + "の車：（少し速くなった）") ;
	}
	
	//brakeメソッド（現在の速度を1km/h下げる）
	void brake(){
		speed-- ;
		System.out.println(owner + "の車：（少し遅くなった）") ;
	}
	
	//rightOnメソッド（ライトを点灯させる）
	void rightOn(){
		right = true ;
		System.out.println(owner + "の車：（周囲が明るくなった）") ;
	}
	
	//rightOffメソッド（ライトを消灯する）
	void rightOff(){
		right = false ;
		System.out.println(owner + "の車：（周囲が暗くなった）") ;
	}
	//klaxonメソッド（クラクションを鳴らす）
	void klaxon(){
		System.out.println(owner + "の車：「プップ～～～～～～～～～～ッ」") ;
	}
}
