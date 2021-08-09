public interface Human extends Creature{

    // HumanインターフェースはCreatureインターフェースに
    // 下三つの抽象メソッドを追加してる
    
    void talk();
    void watch();
    void hear();
}
