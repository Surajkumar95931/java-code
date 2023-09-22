package apna_college;

import java.sql.SQLOutput;
import java.util.*;

public class HASHMAP_SET {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        HashSet<String> hs = new HashSet<>();
        TreeSet<String> ts = new TreeSet<>();

        System.out.println("******LINKHASHSET******");
        lhs.add("kolkata");
        lhs.add("patna");
        lhs.add("chennai");

        System.out.println(lhs);

        System.out.println("******HASHSET******");
        hs.add("kolkata");
        hs.add("patna");
        hs.add("chennai");

        System.out.println(hs);

        System.out.println("******TREESET******");
        ts.add("kolkata");
        ts.add("patna");
        ts.add("chennai");

        System.out.println(ts);

        //print using iteartor
        System.out.println(":USING ITEARTOR");
        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("USING LOOP");
        for (String k : ts) {
            System.out.println(k);

        }
    }
}
