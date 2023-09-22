package apna_college;

import org.w3c.dom.ls.LSOutput;

public class String_letter {
    public static void main(String[] args) {
        String name="harshal";

       letter(name);
    }
    public static void letter(String s){
        for (int i=0;i<s.length();i++){
            System.out.println(i+" "+s.charAt(i));
        }
//        System.out.println();
    }

}
