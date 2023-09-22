package apna_college;
class Animal{
    void eat(){
        System.out.println("i am cow");
    }
}
class dog extends Animal{
    void eat(){
        System.out.println("i am dog and i am running from monday");
    }
}
public class INheri {
    public static void main(String[] args) {
        Animal a=new Animal();

        Animal b=new dog();
        //b.eat();
        a.eat();
    }
}
