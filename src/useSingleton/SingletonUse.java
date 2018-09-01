package useSingleton;

public class SingletonUse {

    private SingletonUse(){}

    private static SingletonUse su = new SingletonUse();

    public static SingletonUse getName(){
        return su;
    }

    public void HouseName(){
        System.out.println("the house name is Blue House");
    }
    public void HouseName2(){
        System.out.println("the house name is Red House");
    }
}
