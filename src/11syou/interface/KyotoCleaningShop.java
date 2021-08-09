
public class KyotoCleaningShop implements
    CleaningService {
        String owenerName;
        String address;
        String phone;

        // インターフェースのメソッドは全てオーバーライドしないといけない
        public Shirt washShirt (Shirt s) {
            return s;
        }
        public Towl washTowl (Towl t) {
            return t;
        }
        public Coat washCoat (Coat c) {
            return c;
        }
    }