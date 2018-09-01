package useSingleton;

public class TestSingleton {
    public static void main(String[] args) {

        SingletonUse x = SingletonUse.getName();
        x.HouseName();

        SingletonUse x2 = SingletonUse.getName();
        x2.HouseName2();

        System.out.println(x.hashCode());
        System.out.println(x.hashCode());

    }
}
