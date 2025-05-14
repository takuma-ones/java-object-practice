package sample2.sample2_03.sample2_ex3;

class Ex2_03_1_Player {
	
	//---定数----------------------------------------------------------
	private final String HAND_G = "グー" ;     //ジャンケンの手（グー）
	private final String HAND_C = "チョキ" ;   //ジャンケンの手（チョキ）
	private final String HAND_P = "パー" ;     //ジャンケンの手（パー）
	
	
	//---フィールド----------------------------------------------------
	private String name       ;   //名前
	private String handStatus ;   //ジャンケンの手
	
	
	//---コンストラクタ------------------------------------------------
	public Ex2_03_1_Player(String nm){
		this.name       = nm ;                   //名前
	}
	
	
	//---メソッド------------------------------------------------------
	
	//フィールドhandStatusに「グー」「チョキ」「パー」のいずれかをランダムに設定
	public void makeHandStatus(){
		
		int random1to3 = 1 + (int)( Math.random() * 3.0 );    //1～3のランダムな値を取得
		
		//取得したランダムな数値に応じてフィールドhandStatusを更新（1：グー、2：チョキ、3：パー）
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
	
	
	//---getter/setter-------------------------------------------------
	
	//フィールドnameのgetter
	public String getName(){
		return this.name ;
	}
	//フィールドhandStatusのgetter
	public String getHandStatus(){
		return this.handStatus ;
	}
	
}
