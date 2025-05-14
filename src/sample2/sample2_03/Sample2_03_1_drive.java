package sample2.sample2_03;

class Sample2_03_1_drive {
	public static void main (String[] args) {
		
		//シナリオ①：車を場に登場させる（Sample2_03_1_carクラスのインスタンス化）
		
		Sample2_03_1_car chocoCar = new Sample2_03_1_car();
		Sample2_03_1_car mocoCar  = new Sample2_03_1_car( "クーペ"   , "モコ" , "RED"   , 100 , true );
		Sample2_03_1_car pochiCar = new Sample2_03_1_car( "トラック" , "ポチ" , "WHITE" , 80  , true );
		
		
		//シナリオ②：各インスタンスのフィールドの状態を確認（インスタンス化直後）
		System.out.println("▼シナリオ②：各インスタンスのフィールドの状態を確認（インスタンス化直後）------") ;
				
		System.out.println("<chocoCar>") ;
		System.out.println("chocoCar.getCarModel()：" + chocoCar.getCarModel() ) ;
		System.out.println("chocoCar.getOwner()   ：" + chocoCar.getOwner()    ) ;
		System.out.println("chocoCar.getColor()   ：" + chocoCar.getColor()    ) ;
		System.out.println("chocoCar.getSpeed()   ：" + chocoCar.getSpeed()    ) ;
		System.out.println("chocoCar.getRight()   ：" + chocoCar.getRight()    ) ;
		System.out.println("<mocoCar>") ;
		System.out.println("mocoCar.getCarModel() ：" + mocoCar.getCarModel() ) ;
		System.out.println("mocoCar.getOwner()    ：" + mocoCar.getOwner()    ) ;
		System.out.println("mocoCar.getColor()    ：" + mocoCar.getColor()    ) ;
		System.out.println("mocoCar.getSpeed()    ：" + mocoCar.getSpeed()    ) ;
		System.out.println("mocoCar.getRight()    ：" + mocoCar.getRight()    ) ;
		System.out.println("<pochiCar>") ;
		System.out.println("pochiCar.getCarModel()：" + pochiCar.getCarModel() ) ;
		System.out.println("pochiCar.getOwner()   ：" + pochiCar.getOwner()    ) ;
		System.out.println("pochiCar.getColor()   ：" + pochiCar.getColor()    ) ;
		System.out.println("pochiCar.getSpeed()   ：" + pochiCar.getSpeed()    ) ;
		System.out.println("pochiCar.getRight()   ：" + pochiCar.getRight()    ) ;
		
		
		//シナリオ③：各インスタンスのメソッドを実行
		chocoCar.paint( "BLACK" ) ;        //chocoCar：paintメソッド起動（設定成功）
		mocoCar.paint(  "GOLD"  ) ;        //mocoCar ：paintメソッド起動（設定失敗）
		pochiCar.rightOn() ;               //pochiCar：rightOnメソッド起動（trueで設定）
		
		for(int i = 0 ; i < 100 ; i++){
			chocoCar.accelerator() ;       //chocoCar：acceleratorメソッド起動（速度が100km/h上昇）
			mocoCar.accelerator() ;        //mocoCar ：acceleratorメソッド起動（速度が最大値180km/hになる）
			pochiCar.brake() ;             //pochiCar：brakeメソッド起動（速度が最小値0km/hになる）
		}
		
		//シナリオ④：各インスタンスのフィールドの状態を確認（メソッド実行後）
		System.out.println("▼シナリオ④：各インスタンスのフィールドの状態を確認（メソッド実行後）------") ;
				
		System.out.println("<chocoCar>") ;
		System.out.println("chocoCar.getCarModel()：" + chocoCar.getCarModel() ) ;
		System.out.println("chocoCar.getOwner()   ：" + chocoCar.getOwner()    ) ;
		System.out.println("chocoCar.getColor()   ：" + chocoCar.getColor()    ) ;
		System.out.println("chocoCar.getSpeed()   ：" + chocoCar.getSpeed()    ) ;
		System.out.println("chocoCar.getRight()   ：" + chocoCar.getRight()    ) ;
		System.out.println("<mocoCar>") ;
		System.out.println("mocoCar.getCarModel() ：" + mocoCar.getCarModel() ) ;
		System.out.println("mocoCar.getOwner()    ：" + mocoCar.getOwner()    ) ;
		System.out.println("mocoCar.getColor()    ：" + mocoCar.getColor()    ) ;
		System.out.println("mocoCar.getSpeed()    ：" + mocoCar.getSpeed()    ) ;
		System.out.println("mocoCar.getRight()    ：" + mocoCar.getRight()    ) ;
		System.out.println("<pochiCar>") ;
		System.out.println("pochiCar.getCarModel()：" + pochiCar.getCarModel() ) ;
		System.out.println("pochiCar.getOwner()   ：" + pochiCar.getOwner()    ) ;
		System.out.println("pochiCar.getColor()   ：" + pochiCar.getColor()    ) ;
		System.out.println("pochiCar.getSpeed()   ：" + pochiCar.getSpeed()    ) ;
		System.out.println("pochiCar.getRight()   ：" + pochiCar.getRight()    ) ;
		
	}
}
