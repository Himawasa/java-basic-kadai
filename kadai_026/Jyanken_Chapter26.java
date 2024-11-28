package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

    // 自分のじゃんけんの手を入力する
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        return scanner.nextLine();
    }

    // 対戦相手のじゃんけんの手をランダムで選ぶ
    public String getYourChoice() {
        double randomValue = Math.random() * 3; // 0.0以上3.0未満の乱数を生成
        int randomChoice = (int) Math.floor(randomValue); // 小数点以下を切り捨てて0, 1, 2を生成

        String choice;
        switch (randomChoice) {
            case 0 -> choice = "r"; // グー
            case 1 -> choice = "s"; // チョキ
            case 2 -> choice = "p"; // パー
            default -> choice = ""; // 念の為
        }
        return choice;
    }

    // じゃんけんを行う
    public void playGame() {
        // 自分の手
        String myChoice = getMyChoice();
        // 対戦相手の手
        String yourChoice = getYourChoice();

        // HashMapでじゃんけんの手を定義
        HashMap<String, String> hands = new HashMap<>();
        hands.put("r", "グー");
        hands.put("s", "チョキ");
        hands.put("p", "パー");

        // 手を表示
        System.out.println("自分の手は" + hands.get(myChoice) + "，対戦相手の手は" + hands.get(yourChoice));

        // 勝敗を判定
        if (myChoice.equals(yourChoice)) {
            System.out.println("あいこです");
        } else if ((myChoice.equals("r") && yourChoice.equals("s")) || // グー vs チョキ
                (myChoice.equals("s") && yourChoice.equals("p")) || // チョキ vs パー
                (myChoice.equals("p") && yourChoice.equals("r")) // パー vs グー
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
