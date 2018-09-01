package useString;

public class UseofString {
    public static void main(String[] args) {

        String st = "I am Md Rifat Taque";
        String st1 = "I am Md Rifat Taque";
        String st2 = "I am Human";
        String st3 = "      I am-Muslim";

        String st4 = st1.toUpperCase();

        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());
        System.out.println(st.charAt(5));
        System.out.println(st.indexOf('m'));
        System.out.println(st.concat(" " + "& " + st2));
        System.out.println(st.contains("Ri"));
        System.out.println(st.equals(st2));
        System.out.println(st.equalsIgnoreCase(st4));
        if(st.isEmpty()){
            System.out.println("yes its empty");
        }else {
            System.out.println("no its not empty");
        }
        if(st1.startsWith("I")){
            System.out.println("yes st1 starts with I");
        }else{
            System.out.println("no it doesn't start with I");
        }
        if(st1.endsWith("taque")){
            System.out.println("yes it ends with taque");
        }else{
            System.out.println("no it does not end with taque");
        }
        System.out.println(st2.substring(5));
        System.out.println(st2.substring(2, 4));
        System.out.println(st2.replace('I','U'));
        System.out.println(st3.trim());
        System.out.println(st2.length());
        String[] x = st2.split(" ");
        for(String word : x){
            System.out.println(word);
        }
        System.out.println(st2.hashCode());

    }
}
