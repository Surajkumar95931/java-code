package apna_college;

public class Array_sum_of_element {
    public static void main(String[] args) {
        int arr[]={1,5,6,2,6};
        int sum=0;
//        for (int i=0;i< arr.length;i++){
//            sum=sum+arr[i];
//        }
//        System.out.println("sum of element is "+sum);
        for (int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
    public static int add (int a,int b){
        return a+b;
   }
}
