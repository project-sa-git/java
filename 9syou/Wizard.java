// Wizardクラス
public class Wizard {
    String name;
    int hp;
    public void heal(Hero h) {
        h.hp += 10;
        System.out.println(this.name + "の魔法！");
        System.out.println(h.name + "は、10ポイント回復した。");
    }
    public Wizard(String name) {  // コンストラクタ①
        this.name = name;
        this.hp = 80;
    }
    public Wizard() {  // コンストラクタ②
        this("ダミーW");
    }
}
