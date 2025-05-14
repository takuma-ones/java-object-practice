package sample2.sample2_07;
class Sample2_07_1_Main {
	public static void main (String[] args) {
		
		//シナリオ①：インスタンス化
		Sample2_07_1_Truck truck1  = new Sample2_07_1_Truck();  //消防車のインスタンス化
		System.out.println("インスタンス化成功（Sample2_07_1_Truck）");
		
		//▼エラー（抽象クラスのインスタンス化）
		//Sample2_07_1_AbstractTruck absTruck1  = new Sample2_07_1_AbstractTruck();
		//System.out.println("インスタンス化成功（Sample2_07_1_AbstractTruck）"); //※出力されることのないメッセージ
	}
}
