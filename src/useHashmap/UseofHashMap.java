package useHashmap;

import java.util.*;

public class UseofHashMap {
    public static void main(String[] args) {

        List<String> cityofBD = new ArrayList<>();
        cityofBD.add("SYL");
        cityofBD.add("DHK");
        cityofBD.add("CTG");

        List<String> cityofUSA = new ArrayList<>();
        cityofUSA.add("NY");
        cityofUSA.add("NJ");
        cityofUSA.add("FL");

        List<String> cityofUK = new ArrayList<>();
        cityofUK.add("LONDON");
        cityofUK.add("MANCHESTER");
        cityofUK.add("CHELSEA");

        Map<String, List<String>> KeyNValue = new LinkedHashMap<String, List<String>>();
        KeyNValue.put("BD", cityofBD);
        KeyNValue.put("USA", cityofUSA);
        KeyNValue.put("UK", cityofUK);

        for(Map.Entry<String, List<String>> x : KeyNValue.entrySet()){
            System.out.println(x.getKey() + ">>> " + x.getValue());
        }
    }
}
