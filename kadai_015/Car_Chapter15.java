package kadai_015;

public class Car_Chapter15 {
	private int gear 		= 1	;	 //1速から5速のギアを表す
	private int speed 	= 10	;	//ギアチェンジ後の速度を表す
	
	//コンストラクタ(初期化処理)
	public Car_Chapter15( int gear, int speed ) {
		this.gear = gear ;
		this.speed = speed ;
	}
	
	//ギアチェンジメソッド
	public void gearChange( int afterGear ) {
		// ギア変更メッセージを表示
        System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
        
        //ギアを変更
        gear = afterGear;
        
        //ギアに応じた速度を設定
		switch( gear ) {
        	case 1  -> this.speed = 10 ;
        	case 2  -> this.speed = 20 ;
        	case 3  -> this.speed = 30 ;
        	case 4  -> this.speed = 40 ;
        	case 5  -> this.speed = 50 ;
        	default -> this.speed = 10 ;
		}
	 }	
	
	//
	 public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	 }
		
}
