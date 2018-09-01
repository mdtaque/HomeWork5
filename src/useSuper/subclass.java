package useSuper;

public class subclass extends UseofSuper {

    int i = 10;
    public void getvalue() {
        System.out.println(super.i);
    }

    public subclass(){
        System.out.println("from subclass default constructor");
    }

    public subclass(String b){
        super(b);
        System.out.println("from subclass parameterized constructor");
    }


    public void show(){
        super.show();
            System.out.println("this is from sub class");
        }
    }
