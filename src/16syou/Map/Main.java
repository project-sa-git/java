import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        prefs.put("東京", 300);
        prefs.put("神奈川", 79);
        prefs.put("千葉", 59);

        System.out.println("HashMapで千葉の値表示");
        System.out.println(prefs.get("千葉"));
        
        System.out.println("\r\nHashMapのforで一つずつ表示");
        for (String key : prefs.keySet()) {
            int value = prefs.get(key);
            System.out.println(value);
        }
    }
}

// HashMapで千葉の値表示
// 59

// HashMapのforで一つずつ表示
// 79
// 300
// 59