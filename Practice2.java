package apna_college;

public class Practice2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        pair(arr);
    // print(arr);

    }
    public static void pair(int arr[]){
        for (int i=0;i< arr.length;i++){
            int current=arr[i];
            for (int j=i+1;j< arr.length;j++){
                int sum=arr[i]+arr[j];
                System.out.print("("+current+","+arr[j]+")"+"="+sum);
            }
            System.out.println();
        }

    }
    public static void print(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
