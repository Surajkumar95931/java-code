package apna_college;

public class Mobile {
    public static void main(String[] args) {
        Cellphone c=new Cellphone();

        c.ringing();
        c.vibrate();
   }
    static class Cellphone extends Mobile{
        public void vibrate(){
            System.out.println("phone is vibrarting");
        }
        public void ringing(){
            System.out.println("phone is ringing");
        }
    }
}
