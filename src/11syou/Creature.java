
// インターフェース：内容的にはクラスの仲間の「抽象クラスの親玉」

public interface Creature {

    // インターフェースに宣言されたメソッドは全て抽象メソッド(abstract)
    public abstract void run();

    // 省略もおｋ
    void dash();

    // public static finalのフィールド（定数）は宣言できる
    double PI = 3.141592;
}