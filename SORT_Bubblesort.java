package apna_college;

public class SORT_Bubblesort {
    static class Bubble {
        public static void printArr(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        }


        public static void bubblesort(int arr[]){
            for (int i=0;i< arr.length-1;i++){
                for (int j=0;j< arr.length-i-1;j++){
                    if (arr[j]>arr[j+1]){
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {55, 43, 12, 34, 22};
        Bubble b = new Bubble();
        System.out.println("original Array");
        b.printArr(arr);

        b.bubblesort(arr);

        System.out.println("sorted Array");
        b.printArr(arr);

    }

}
