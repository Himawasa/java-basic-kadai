package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    // HashMapの宣言と初期化（キー: 英単語, 値: 意味）
    private HashMap<String, String> dictionary = new HashMap<>();

    // 辞書に単語を追加
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

    // フロー図のメソッド
    public String searchWord(String word) {
        if (dictionary.containsKey(word)) {
            return word + "の意味は" + dictionary.get(word);
        } else {
            return word + "は辞書に存在しません";
        }
    }
}
