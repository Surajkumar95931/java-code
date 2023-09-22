package apna_college;

import java.util.Arrays;
import java.util.Collections;

public class SORT_Inbuilt {
    public static void main(String[] args) {
        Integer arr[]={5,3,2,1,66};
        Arrays.sort(arr);
       print(arr);

        System.out.println("Now reverse the array");
        Arrays.sort(arr, Collections.reverseOrder());
        print(arr);
    }
    public static void print(Integer arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
