public abstract class Monster {
    int hp;
    public void run(){
      System.out.println("モンスターは逃げ出した。");
    }

    public String toString() {
      return this.hp;
    }
  }
  