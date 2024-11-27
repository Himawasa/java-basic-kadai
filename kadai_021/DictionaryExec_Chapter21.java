package kadai_021;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {
        // 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べる英単語を配列にセット
        String[] wordsToSearch = new String[] {"apple", "banana", "grape", "orange"};

        // 配列を使って辞書を検索
        for (int i = 0; i < wordsToSearch.length; i++) {
            System.out.println(dictionary.searchWord(wordsToSearch[i]));
        }
    }
}