public class OverLoad{
  // mainメソッド  
  
  public static int add(int x, int y) {
    return x + y;
  }

  public static String add(String x, String y) {
    return x + y;
  }
  
  public static void main(String[] args){
      System.out.println(add(10, 20));
      System.out.println(add("heku", "hoge"));
    }

}