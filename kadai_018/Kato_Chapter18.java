package kadai_018;

// 抽象クラスとして定義
public abstract class Kato_Chapter18 {
	// フィールド
	public String familyName = ""; // 姓を表す
	public String givenName = ""; // 名を表す
	public String address = ""; // 住所を表す

	// 共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("私は" + familyName + givenName + "です。");
		System.out.println("住所は" + address + "です。");
	}

	// 個別の紹介を出力する抽象メソッド（サブクラスで実装）
	abstract public void eachIntroduce();

	// 紹介を実行するメソッド
	public void execIntroduce() {
		commonIntroduce(); // 共通の紹介
		eachIntroduce(); // 個別の紹介（サブクラスで実装）
	}
}
