public class Main {
    public static void main(String[] args) {
      Sword s = new Sword();
      s.name = "炎の剣";
      s.damage = 10;
      Hero h = new Hero("Ken");
      h.hp = 100;
      h.attack();
        // ミナトは攻撃した！
        // 敵に5ポイントのダメージをあたえた！
      System.out.println(s);    // Sword@28a418fc
      System.out.println(h.sword);  // null
      h.sword = s;
      System.out.println("現在の武器は" + h.sword.name); //現在の武器は炎の剣
      Wizard w = new Wizard();
      System.out.println("現在のHPは" + h.hp); //現在の武器は炎の剣
      w.heal(h);
      System.out.println("現在のHPは" + h.hp); //現在の武器は炎の剣
    }
  }
  