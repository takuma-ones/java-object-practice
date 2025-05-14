package sample2.sample2_02;


class Sample2_02_2_drive {
	public static void main (String[] args) {
		
		//シナリオ①：車を場に登場させる（Sample2_02_2_carクラスのインスタンス化）
		System.out.println("▼シナリオ①：車を場に登場させる------------------") ;
		
		Sample2_02_2_car chocoCar = new Sample2_02_2_car();
		Sample2_02_2_car mocoCar  = new Sample2_02_2_car( "クーペ"   , "モコ" , "RED"   , 100 , true );
		Sample2_02_2_car pochiCar = new Sample2_02_2_car( "トラック" , "ポチ" , "WHITE" , 80  , true );
		
		System.out.println("▲------------------------------------------------") ;
		
		
		//シナリオ②：車の情報（初期）の確認（mocoCarインスタンスのフィールドの確認）
		System.out.println("▼シナリオ②：車の情報（初期）の確認--------------") ;
		
		System.out.println("<chocoCar>") ;
		System.out.println("chocoCar.carModel：" + chocoCar.carModel ) ;
		System.out.println("chocoCar.owner   ：" + chocoCar.owner    ) ;
		System.out.println("chocoCar.color   ：" + chocoCar.color    ) ;
		System.out.println("chocoCar.speed   ：" + chocoCar.speed    ) ;
		System.out.println("chocoCar.right   ：" + chocoCar.right    ) ;
		System.out.println("<mocoCar>") ;
		System.out.println("mocoCar.carModel ：" + mocoCar.carModel  ) ;
		System.out.println("mocoCar.owner    ：" + mocoCar.owner     ) ;
		System.out.println("mocoCar.color    ：" + mocoCar.color     ) ;
		System.out.println("mocoCar.speed    ：" + mocoCar.speed     ) ;
		System.out.println("mocoCar.right    ：" + mocoCar.right     ) ;
		System.out.println("<pochiCar>") ;
		System.out.println("pochiCar.carModel：" + pochiCar.carModel ) ;
		System.out.println("pochiCar.owner   ：" + pochiCar.owner    ) ;
		System.out.println("pochiCar.color   ：" + pochiCar.color    ) ;
		System.out.println("pochiCar.speed   ：" + pochiCar.speed    ) ;
		System.out.println("pochiCar.right   ：" + pochiCar.right    ) ;
		
		System.out.println("▲------------------------------------------------") ;
		
		
		//シナリオ③：メソッドの起動&確認
		System.out.println("▼シナリオ③：メソッドの起動&確認------") ;
		
		chocoCar.accelerator() ;    //chocoCarはacceleratorメソッド起動
		mocoCar.rightOff() ;        //mocoCarはrightOffメソッド起動
		pochiCar.brake() ;          //pochiCarはbrakeメソッド起動
		
		System.out.println("<chocoCar>") ;
		System.out.println("chocoCar.carModel：" + chocoCar.carModel ) ;
		System.out.println("chocoCar.owner   ：" + chocoCar.owner    ) ;
		System.out.println("chocoCar.color   ：" + chocoCar.color    ) ;
		System.out.println("chocoCar.speed   ：" + chocoCar.speed    ) ;
		System.out.println("chocoCar.right   ：" + chocoCar.right    ) ;
		System.out.println("<mocoCar>") ;
		System.out.println("mocoCar.carModel ：" + mocoCar.carModel  ) ;
		System.out.println("mocoCar.owner    ：" + mocoCar.owner     ) ;
		System.out.println("mocoCar.color    ：" + mocoCar.color     ) ;
		System.out.println("mocoCar.speed    ：" + mocoCar.speed     ) ;
		System.out.println("mocoCar.right    ：" + mocoCar.right     ) ;
		System.out.println("<pochiCar>") ;
		System.out.println("pochiCar.carModel：" + pochiCar.carModel ) ;
		System.out.println("pochiCar.owner   ：" + pochiCar.owner    ) ;
		System.out.println("pochiCar.color   ：" + pochiCar.color    ) ;
		System.out.println("pochiCar.speed   ：" + pochiCar.speed    ) ;
		System.out.println("pochiCar.right   ：" + pochiCar.right    ) ;
		
		System.out.println("▲------------------------------------------------") ;
		
	}
}
