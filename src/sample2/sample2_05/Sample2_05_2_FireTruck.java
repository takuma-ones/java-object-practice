package sample2.sample2_05;

import sample2.sample2_05.sample2_05_2.Sample2_05_2_Car;

class Sample2_05_2_FireTruck extends Sample2_05_2_Car {
	
	//---フィールド------------------------------------------------------
	//※なし
	
	//---コンストラクタ--------------------------------------------------
	//※なし
	
	//---メソッド--------------------------------------------------------
	
	//paintメソッド（色を塗る）※セットできる塗装色は「RED」のみ
	public void paint( String cl ){
		if( cl.equals( "RED" ) ){
			super.color = cl ;
		}
	}
	
	//acceleratorメソッド（現在の速度を1km/h上げる）※80km/h以上にはならないよう制御
	public void accelerator(){
		if( super.getSpeed() < 80 ){
			super.setSpeed( super.getSpeed() + 1 ) ;
		}
	}
	
}
