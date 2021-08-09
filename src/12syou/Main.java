public class Main {
    public static void main(String[] args) {
      Monster[] monsters = new Monster[3];
      monsters[0] = new Slime();
      monsters[1] = new Goblin();
      monsters[2] = new DeathBat();
      System.out.println(monsters);
      System.out.println(monsters.toString());
      for (Monster m : monsters) {
        m.run();
      }
    }
  }
  