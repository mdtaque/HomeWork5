package nestedclass;

public class TestClass {
    public static void main(String[] args) {

        OuterClass oc = new OuterClass();
        oc.outerMethodA();
        oc.outerMethodB();
        oc.ic.innerMethodB(); //innermethodA is called in outermethodB
    }
}
