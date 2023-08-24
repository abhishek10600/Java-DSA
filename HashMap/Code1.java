import java.util.*;

public class Code1 {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 120);
        hm.put("USA", 105);
        hm.put("China", 180);

        System.out.println(hm);

        if (hm.containsKey("USA")) {
            System.out.println("USA is present");
        } else {
            System.out.println("No such key found");
        }

        System.out.println(hm.get("India"));

        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        hm.remove("China");
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e.getValue());
        }

    }
}