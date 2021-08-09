package src.11syou;

// 抽象クラス　→　newによるインスタンス不可

public abstract class Character {
    String name;
    int hp;

    // 逃げる
    public void run() {
      System.out.println(this.name + "は逃げ出した");
    }

    // 戦う： 抽象メソッド 　→　メソッドの中身空の場合「{}」無しでおｋ
    public abstract void attack(Matango m);
  }
