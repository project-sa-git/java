// 次にHeroクラスを定義する
public class Hero {
    String name;
    int hp;
    Sword sword;
    public void attack() {
      System.out.println(this.name + "は攻撃した！");
      System.out.println("敵に5ポイントのダメージをあたえた！");
    }
    public Hero(String name) {  // コンストラクタ①
        this.name = name; // new時に引数の値でnameフィールドを初期化
        this.hp = 100;
    }
    public Hero() {  // コンストラクタ②
        this.name = "ダミーH"; // new時に引数の値でnameフィールドを初期化
        this.hp = 100;
    }
  }
  