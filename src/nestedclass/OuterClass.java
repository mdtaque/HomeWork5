package nestedclass;

public class OuterClass {

    InnerClass ic = new InnerClass();

    public void outerMethodA(){
        System.out.println("this is from outer methodA");

    }

    public void outerMethodB(){
        System.out.println("this is from outer methodB");
        ic.innerMethodA();
    }

    public class InnerClass {

        public void innerMethodA(){
            System.out.println("this is from inner methodA");
        }

        public void innerMethodB(){
            System.out.println("this is from inner methodB");
        }
    }
}
