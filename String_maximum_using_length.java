package apna_college;

public class String_maximum_using_length {
    public static void main(String[] args) {
        String fruit[]={"mango","orange","banana"};
        String largest=fruit[0];
;        for (int i=0;i< fruit.length;i++){
            if (largest.compareTo(fruit[i]) < 0)
                largest=fruit[i];
            }
        System.out.println("the largest lenth of the fruit is "+largest);
        }
    }

