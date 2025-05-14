package sample2.sample2_05.sample2_05_2;

public class Sample2_05_2_Car {
	
	//---フィールド------------------------------------------------------
	protected String color ;  //塗装色
	private   int    speed ;  //現在の速度
	
	//---コンストラクタ--------------------------------------------------
	
	//コンストラクタ①（引数なし）
	public Sample2_05_2_Car(){
		this.color = "未登録" ;  //塗装色
		this.speed = 0        ;  //現在の速度
	}
	
	//---メソッド------------------------------------------------
	
	//paintメソッド（色を塗る）※セットできる塗装色は「WHITE」「BLACK」「RED」
	public void paint( String cl ){
		if( cl.equals( "WHITE" ) || cl.equals( "BLACK" )|| cl.equals( "RED" ) ){
			this.color = cl ;
		}
	}
	
	//acceleratorメソッド（現在の速度を1km/h上げる）※180km/h以上にはならないよう制御
	public void accelerator(){
		if( this.speed < 180 ){
			this.speed++;
		}
	}
	
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
