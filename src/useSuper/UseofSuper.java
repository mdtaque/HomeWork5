package useSuper;

public class UseofSuper {

    String a;
    int i = 5;

    public UseofSuper(){
        System.out.println("from superclass default constructor");
    }

    public UseofSuper(String a){
        this.a = a;
        System.out.println("from superclass parameterized constructor");
    }


    public void show(){
        System.out.println("this is from super class");
    }
}
