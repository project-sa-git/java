// 各キャラとは別の神さまポジclassの定義
public class Main {
    public static void main(String[] args) {
        // ヒーロー生成
        // Hero型変数h に、Heroclassからインスタンス生成して代入
        Hero h = new Hero();

        // フィールド（classブロック内に定義した変数）に初期値代入
        h.name = "ミナト";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出した。");

        // ヒーローのメソッド呼出
        h.sit(5);
        h.slip();
        h.sit(5);
        h.run();
    }
}
