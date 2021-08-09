public class ModoriAtai {
    public static void main(String[] args) {
        System.out.println(calShikaku(10.0));
    }

    // ここに入るのは、 double(× void) メソッド名
    public static double calShikaku(double radius) {
        double area = radius * radius * Math.PI;
        return area;
    }
}
