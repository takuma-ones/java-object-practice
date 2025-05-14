package sample2.sample2_07;
class Sample2_07_2_2 {
	public static void main (String[] args) {
		
		try{
			int x = Integer.parseInt(args[0]) ;            //コマンドライン引数1が数字でない→③
			int y = Integer.parseInt(args[1]) ;            //コマンドライン引数が1つ→②、コマンドライン引数2が数字でない→③
			
			System.out.println( x / y ) ;                  //コマンドライン引数2が0→①
			
		}catch(ArithmeticException e){                      //①ゼロ割が発生した場合の対処
			System.out.println("[ゼロ割]" + e + "が発生しました") ;
		}catch(ArrayIndexOutOfBoundsException e){           //②存在しない配列のインデックスが指定された場合の対処
			System.out.println("[インデックス範囲外指定]" + e + "が発生しました") ;
		}catch(NumberFormatException e){                    //③数字の形式でない文字列が入力された場合の対処
			System.out.println("[入力値不正（数字でない）]" + e + "が発生しました") ;
		}
		
		System.out.println("最後まで処理しました") ;
	}
}

