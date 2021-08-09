
// Heroクラスを継承(extends)した、SuperHeroクラス（Heroができることは全部できる）
// 　→　こっちはサブクラス

public class SuperHero extends Hero {
    boolean flying;

    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった！");
    }
    
    public void load() {
        this.flying = false;
        System.out.println("着地した！");
    }

    // runメソッドの中身を変えたい
    // 　→　オーバーライド（上書き）
    // オーバーロードは単に同じメソッドの読み取り順を言ってるだけで別
    public void run() {
        System.out.println(this.name + "は撤退した。");
        System.out.println(this.name + "は撤退した。");
    }

    public void attack(Matango m) {
        // 親クラスのHeroからattackを呼出し
        super.attack(m);
        
        // 空にいる場合２回攻撃
        if(this.flying) {
            super.attack(m);
        }
    }
    
    public SuperHero() {

        // 引数なしで親コンストラクタの呼出（自動挿入される）
        // 引数ありしかないとエラーが起きるので注意！！
        super();

        System.out.println("SuperHeroのコンストラクタ");
    }

}
