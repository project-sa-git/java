public class Account {
    String owner;     // 口座名義人
    int zandaka;      // 口座残高
    public Account(String owner, int zandaka) {
      this.owner = owner;
      this.zandaka = zandaka;
    }
    public void transfer(Account dest, int amount) {
      dest.zandaka += amount;
      zandaka -= amount;
    }
  }
  