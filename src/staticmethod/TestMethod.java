package staticmethod;

public class TestMethod {
    public static void main(String[] args) {

        StaticMethod.displayName(); //without creating instance we can access the method
        Superage.displayName(); //overriden the method in superage class but when we put final in the superclass then we can't override it anymore
        StaticMethod.displayName2();
    }
}
