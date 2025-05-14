package sample2.sample2_07;
class Sample2_07_2_3_Calc {
	void calc (int x , int y) {
		
		try{
			
			System.out.println( x / y ) ;                  //コマンドライン引数2が0→①
			
		}catch(ArithmeticException e){                      //ゼロ割が発生した場合の対処
			System.out.println("[ERROR]例外を検知しました") ;
			e.printStackTrace();
		}catch(NumberFormatException e){                    //数字の形式でない文字列が入力された場合の対処
			System.out.println("[ERROR]例外を検知しました") ;
			e.printStackTrace();
		}finally{
			System.out.println("★finally（Sample2_07_2_3_Calcクラス）") ;
		}
		
	}
}

