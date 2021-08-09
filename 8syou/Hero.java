// ヒーローclass定義
public class Hero {

    // TODO 属性定義
    String name;
    int hp;

    // 「眠る」操作
    public void sleep() {
        // 自分のhpフィールド（属性定義したやつ）に100を代入
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した!");
    }

    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }
    public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ！");
    }
    public void run() {
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
    }
}
