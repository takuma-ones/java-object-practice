package sample2.sample2_07;
class Sample2_07_2_3_Main {
	public static void main (String[] args) {
		
		System.out.println("[INFO]処理開始") ;
		
		try{
			int x = Integer.parseInt(args[0]) ;
			int y = Integer.parseInt(args[1]) ;
			
			Sample2_07_2_3_Calc calcInstance = new Sample2_07_2_3_Calc();
			
			calcInstance.calc( x , y ) ;
			
		}catch(ArrayIndexOutOfBoundsException e){           //存在しない配列のインデックスが指定された場合の対処
			System.out.println("[ERROR]例外を検知しました") ;
			e.printStackTrace();
		}catch(NumberFormatException e){                    //数字の形式でない文字列が入力された場合の対処
			System.out.println("[ERROR]例外を検知しました") ;
			e.printStackTrace();
		}finally{
			System.out.println("★finally（Sample2_07_2_3_Mainクラス）") ;
		}
		
		System.out.println("[INFO]正常終了") ;
	}
}

