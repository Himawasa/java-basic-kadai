package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	// HashMapの宣言と初期化（キー: 英単語, 値: 意味）
	private HashMap<String, String> dictionary = new HashMap<>();

	// コンストラクタで辞書に単語を追加
	public Dictionary_Chapter21() {
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "もも");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}

	// 配列全体を受け取り、繰り返し処理して結果を出力するメソッド
	public void searchWord(String[] targetWord) {
		for (int i = 0; i < targetWord.length; i++) {
			System.out.println(findWord(targetWord[i]));
		}
	}

	// 単語を検索し、結果を返すメソッド
	public String findWord(String word) {
		if (dictionary.containsKey(word)) {
			return word + "の意味は" + dictionary.get(word);
		} else {
			return word + "は辞書に存在しません";
		}
	}
}