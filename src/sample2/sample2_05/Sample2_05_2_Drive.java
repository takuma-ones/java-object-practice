package sample2.sample2_05;

import sample2.sample2_05.sample2_05_2.Sample2_05_2_Car;

class Sample2_05_2_Drive {
	public static void main (String[] args) {
		
		//シナリオ①：車を場に登場させる（Sample2_05_2_Carクラスのインスタンス化）
		
		Sample2_05_2_Car       car1       = new Sample2_05_2_Car() ;
		Sample2_05_2_FireTruck fireTruck1 = new Sample2_05_2_FireTruck() ;
		
		
		//シナリオ②：paintメソッドの起動
		
		car1.paint( "BLACK" );
		fireTruck1.paint( "BLACK" );
		
		
		//シナリオ③：paintメソッドの起動
		
		//時速200km/hまで加速
		for(int i = 0 ; i < 200 ; i++){
			
			car1.accelerator();
			fireTruck1.accelerator();
			
		}
		
		
		//シナリオ④：各フィールドの確認
		System.out.println("▼シナリオ④：各フィールドの確認------") ;
		
		System.out.println("car1.color       ："       + car1.getColor() ) ;
		System.out.println("car1.speed       ："       + car1.getSpeed() ) ;
		System.out.println("fireTruck1.color ：" + fireTruck1.getColor() ) ;
		System.out.println("fireTruck1.speed ：" + fireTruck1.getSpeed() ) ;
		
	}
}
