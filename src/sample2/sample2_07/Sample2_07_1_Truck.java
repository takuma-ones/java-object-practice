package sample2.sample2_07;
public class Sample2_07_1_Truck extends Sample2_07_1_AbstractTruck {
	
	//---フィールド------------------------------------------------------
	protected String color ;  //塗装色
	private   int    speed ;  //現在の速度
	
	//---コンストラクタ--------------------------------------------------
	
	//コンストラクタ（引数なし）
	public Sample2_07_1_Truck(){
		this.color = "未登録" ;  //塗装色
		this.speed = 0        ;  //現在の速度
	}
	
	//---メソッド------------------------------------------------
	
	//★抽象メソッドの実装
	//paintメソッド（色を塗る）※セットできる塗装色は「WHITE」「BLACK」「RED」
	public void paint( String cl ){
		if( cl.equals( "WHITE" ) || cl.equals( "BLACK" )|| cl.equals( "RED" ) ){
			this.color = cl ;
		}
	}
	
	//★抽象メソッドの実装
	//acceleratorメソッド（現在の速度を1km/h上げる）※180km/h以上にはならないよう制御
	public void accelerator(){
		if( this.speed < 180 ){
			this.speed++;
		}
	}
	
	//★抽象メソッドの実装
	//brakeメソッド（現在の速度を1km/h下げる）※0km/h以下にはならないよう制御
	public void brake(){
		if( this.speed > 0 ){
			this.speed--;
		}
	}
	
	//---getter/setter------------------------------------------------
	
	//colorのgetter
	public String getColor(){
		return this.color ;
	}
	
	//speedのgetter/setter
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int s) {
		this.speed = s ;
	}
	
}
