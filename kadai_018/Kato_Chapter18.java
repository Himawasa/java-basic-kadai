package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName = "加藤"; // 姓を表す
	public String givenName = ""; // 名を表す
	public String address = "東京都中野区〇×"; // 住所を表す

	// 共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}

	// 個別の紹介を出力する抽象メソッド
	abstract public void eachIntroduce();

	// 紹介を実行するメソッド（共通 + 個別紹介）
	public void execIntroduce() {
		commonIntroduce(); // 共通の紹介
		eachIntroduce(); // 個別の紹介（サブクラスで実装）
	}
}
