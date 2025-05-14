package sample2.sample2_03;

public class Sample2_03_1_car {
	
	//---フィールド（クラス直下で定義された変数）-----------------------
	
	private String  carModel ;  //車種名
	private String  owner    ;  //オーナー
	private String  color    ;  //塗装色
	private int     speed    ;  //現在の速度
	private boolean right    ;  //ライト（true:点灯/false:消灯）
	
	
	//---コンストラクタ------------------------------------------------
	
	//コンストラクタ①（引数なし）
	public Sample2_03_1_car(){
		this.carModel = "未登録" ;  //車種名
		this.owner    = "未登録" ;  //オーナー
		this.color    = "未登録" ;  //塗装色
		this.speed    = 0        ;  //現在の速度
		this.right    = false    ;  //ライト（true:点灯/false:消灯）
	}
	
	//コンストラクタ②（引数あり）
	public Sample2_03_1_car(String cm , String on , String cl , int sp , boolean rt ){
		this();                    //コンストラクタ①（引数なし）の起動
		this.carModel = cm ;         //車種名
		this.owner    = on ;         //オーナー
		this.color    = cl ;         //塗装色
		this.speed    = sp ;         //現在の速度
		this.right    = rt ;         //ライト（true:点灯/false:消灯）
	}
	
	
	//---メソッド------------------------------------------------
	
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
	
	//rightOnメソッド（ライトを点灯させる）
	public void rightOn(){
		this.right = true ;
	}
	
	//rightOffメソッド（ライトを消灯する）
	public void rightOff(){
		this.right = false ;
	}
	//klaxonメソッド（クラクションを鳴らす）
	public void klaxon(){
		System.out.println(this.owner + "の車：「プップ～～～～～～～～～～ッ」") ;
	}
	
	//paintメソッド（色を塗る）※セットできる塗装色は「WHITE」「BLACK」「RED」
	public void paint( String cl ){
		if( checkColor(cl) ){
			this.color = cl ;
		}
	}
	
	
	//塗装色が正式なカラーバリエーション（「WHITE」「BLACK」「RED」）かをチェックする
	private boolean checkColor( String cl ){
		
		boolean checkResult = false ; //チェック結果（初期値：false）
		
		//正式なカラーバリエーション（「WHITE」「BLACK」「RED」）と一致していればcheckResultにtrueを設定
		if( cl.equals( "WHITE" ) || cl.equals( "BLACK" )|| cl.equals( "RED" ) ){
			checkResult = true ;
		}
		
		return checkResult ;
	}
	
	//---getter/setter------------------------------------------------
	
	//carModelのgetter/setter
	public String getCarModel() {
		return this.carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	//ownerのgetter/setter
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	//colorのgetter
	public String getColor(){
		return this.color ;
	}
	
	//speedのgetter
	public int getSpeed() {
		return this.speed;
	}
	
	//rightのgetter
	public boolean getRight() {
		return this.right;
	}
	
}
