package kadai_018;

//加藤太郎を表すクラス
public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	public KatoTaro_Chapter18() {
		this.familyName = "加藤";
		this.givenName = "太郎";
		this.address = "東京都中野区〇×";
	}

	@Override
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
}