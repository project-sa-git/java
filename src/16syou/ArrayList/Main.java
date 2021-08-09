import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 変数pointsに、Integer型でArrayListでインスタンス宣言
        ArrayList<Integer> points = new ArrayList<Integer>();
        points.add(30);
        points.add(12);
        for (int i : points){
            System.out.println(i);
        }
        

        // イテレータ
        Iterator<Integer> it = points.iterator();
        System.out.println("\r\nイテレータ取り出し形式");
            // hasNext()　→　次の要素を取り出せるか判定
        while (it.hasNext()) {
            Integer e = it.next();
            System.out.println(e);
        }
    }
}

// 30
// 12

// イテレータ取り出し形式
// 30
// 12