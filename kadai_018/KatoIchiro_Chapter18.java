package kadai_018;

//加藤一郎を表すクラス
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	public KatoIchiro_Chapter18() {
		this.familyName = "加藤";
		this.givenName = "一郎";
		this.address = "東京都中野区〇×";
	}

	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}