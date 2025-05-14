package sample2.sample2_07;
class Sample2_07_2_1 {
	public static void main (String[] args) {
		
		int x = Integer.parseInt(args[0]) ;            //コマンドライン引数1が数字でない→入力値不正（数字でない）
		int y = Integer.parseInt(args[1]) ;            //コマンドライン引数が1つ→インデックス範囲外指定、コマンドライン引数2が数字でない→入力値不正（数字でない）
		
		System.out.println( x / y ) ;                  //コマンドライン引数2が0→ゼロ割
		
		System.out.println("最後まで処理しました") ;
	}
}

