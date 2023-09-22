package apna_college;
//write a java program to find duplicate value:--------------
public class Duplicate_array {
    public static void main(String[] args) {
        int harshal[] = {1, 2, 3, 3, 4, 5, 5,6,6};


        for (int i = 0; i <= harshal.length - 1; i++) {
            for (int j = i + 1; j < harshal.length; j++) {
                if ( harshal[i] == harshal[j]){
                    System.out.println("duplicate found  " + harshal[i] + " at " + i + " and " + j);

                }
            }

        }
    }
}



