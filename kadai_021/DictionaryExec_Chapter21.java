package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンスを作成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

		// 検索対象の英単語を配列にセット
		String[] targetWord = new String[] { "apple", "banana", "grape", "orange" };

		// 辞書クラスに処理を依頼
		dictionary.searchWord(targetWord);
	}
}
