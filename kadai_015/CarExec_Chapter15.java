package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// 車オブジェクトを作成
        Car_Chapter15 car = new Car_Chapter15(1, 10);

        // ギアを5に変更
        car.gearChange(3);

        // ギアチェンジ後の速度を表示
        car.run();
    }
}