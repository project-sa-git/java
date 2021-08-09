
// スーパー（親）クラス

public class Hero {
    String name = "ミナト";
    int hp = 100;

    // 戦う
    public void attack(Matango m) {
      System.out.println(this.name + "の攻撃！");
      m.hp -= 5;
      System.out.println("5ポイントのダメージをあたえた！");
    }
    
    // 逃げる
    public void run() {
      System.out.println(this.name + "は逃げ出した！");
    }
    
    // 転ぶ（オーバーライド不可に）
    public final void slip() {
      this.hp -= 5;
      System.out.println(this.name + "は転んだ");
      System.out.println("5ポイントのダメージ！");
    }

    public Hero() {
      System.out.println("Heroのコンストラクタ");
  }
}
  