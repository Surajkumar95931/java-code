package apna_college;

import org.w3c.dom.ls.LSOutput;

public class inverted_pyramid {
    public static void main(String[] args) {
        int n=4;
        for(int line=1;line<=4;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
