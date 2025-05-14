package sample2.sample2_01.sample2_ex1;

class Ex2_02_1_Janken{
	public static void main( String[] args ){
		
		//---定数----------------------------------------------------------
		final String HAND_G = "グー" ;     //ジャンケンの手（グー）
		final String HAND_C = "チョキ" ;   //ジャンケンの手（チョキ）
		final String HAND_P = "パー" ;     //ジャンケンの手（パー）
		
		/*<シナリオ①>
		**コマンドライン引数より2つの文字列を受け取る
		**（ジャンケンを行う2名のプレイヤーの名前として利用）
		*/
		String nameP1 = args[0] ; //ジャンケンを行うプレイヤー1の名前
		String nameP2 = args[1] ; //ジャンケンを行うプレイヤー2の名前
		
		
		/*<シナリオ②>
		**2名のプレイヤーを場に登場させる（インスタンス化する）
		*/
		Ex2_02_1_Player p1 = new Ex2_02_1_Player( nameP1 ) ;   //プレイヤー1をインスタンス化
		Ex2_02_1_Player p2 = new Ex2_02_1_Player( nameP2 ) ;   //プレイヤー2をインスタンス化
		
		
		/*<シナリオ③>
		**それぞれのプレイヤーに手を握らせる
		*/
		//握らせる前に「じゃんけん・・・ぽん！！！！！」というメッセージを画面に表示する
		System.out.println( "じゃんけん・・・ぽん！！！！！" );
		
		//それぞれのプレイヤーに手を握らせる
		p1.makeHandStatus();
		p2.makeHandStatus();
		
		//それぞれのプレイヤーがどんな手を出したかを確認する
		System.out.println( p1.name + "さんの手 : " + p1.handStatus );
		System.out.println( p2.name + "さんの手 : " + p2.handStatus );
		
		
		/*<シナリオ④>
		**勝敗の結果を画面に表示する
		*/
		//はじめに「結果は・・・」というメッセージを画面に表示する
		System.out.println( "結果は・・・" );
		
		
		//結果を判定し、結果に応じたメッセージを表示する
		if( (p1.handStatus).equals( p2.handStatus ) ){
			
			//あいこの場合
			System.out.println("あいこ！勝負つかず！");
			
		}else if(     (p1.handStatus.equals( HAND_G ) && p2.handStatus.equals( HAND_C ))
		           || (p1.handStatus.equals( HAND_C ) && p2.handStatus.equals( HAND_P ))
		           || (p1.handStatus.equals( HAND_P ) && p2.handStatus.equals( HAND_G ))  ) {
			
			//プレイヤー1が勝利した場合
			System.out.println(p1.name + "さんの勝利！");
			
		}else if(     (p2.handStatus.equals( HAND_G ) && p1.handStatus.equals( HAND_C ))
		           || (p2.handStatus.equals( HAND_C ) && p1.handStatus.equals( HAND_P ))
		           || (p2.handStatus.equals( HAND_P ) && p1.handStatus.equals( HAND_G ))  ) {
			
			//プレイヤー2が勝利した場合
			System.out.println(p2.name + "さんの勝利！");
			
		}else{
			
			//不正な場合はエラーメッセージを出力
			System.out.println("[ERROR]ジャンケンの判定が不正です。");
			
		}
		
		
	}
}