package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		// 加藤太郎のインスタンスを作成し、紹介を実行
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		taro.execIntroduce();
		System.out.println();

		// 加藤一郎のインスタンスを作成し、紹介を実行
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		ichiro.execIntroduce();
		System.out.println();

		// 加藤花子のインスタンスを作成し、紹介を実行
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.execIntroduce();
	}
}