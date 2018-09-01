package staticvariables;

public class TestStatic {
    public static void main(String[] args) {

        StaticVariables s = new StaticVariables();
        s.age = 30;
        System.out.println(s.age);

        StaticVariables p = new StaticVariables();
        p.age = 40;
        System.out.println(p.age);

        System.out.println(s.age); //here the value is changed because static variable belongs to class and non-static variable belongs to object(s & p)

        //s.weight = 50; here we can't assign a value coz its final in the StaticVariables class
    }
}
