package sample2.sample2_02.sample2_ex2;
class Ex2_02_2_Player {
	
	//---定数----------------------------------------------------------
	final String HAND_G = "グー" ;     //ジャンケンの手（グー）
	final String HAND_C = "チョキ" ;   //ジャンケンの手（チョキ）
	final String HAND_P = "パー" ;     //ジャンケンの手（パー）
	
	
	//---フィールド----------------------------------------------------
	String name       ;   //名前
	String handStatus ;   //ジャンケンの手
	
	
	//---コンストラクタ------------------------------------------------
	Ex2_02_2_Player(String nm){
		this.name       = nm ;                   //名前
	}
	
	
	//---メソッド------------------------------------------------------
	
	//フィールドhandStatusに「グー」「チョキ」「パー」のいずれかをランダムに設定
	void makeHandStatus(){
		
		int random1to3 = 1 + (int)( Math.random() * 3.0 );    //1～3のランダムな値を取得
		
		switch(random1to3){
			case 1:
				this.handStatus = HAND_G ;
				break;
			
			case 2:
				this.handStatus = HAND_C ;
				break;
			
			case 3:
				this.handStatus = HAND_P ;
				break;
		}
	}
}
