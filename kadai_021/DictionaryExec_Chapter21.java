package kadai_021;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {
        // 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べる英単語を配列にセット
        String[] wordsToSearch = {"apple", "banana", "grape", "orange"};

        // 配列内の単語を順に辞書クラスで調べる
        for (String word : wordsToSearch) {
            String result = dictionary.searchWord(word);

            // 出力設定
            if (result != null) {
                System.out.println(word + "の意味は" + result);
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}
