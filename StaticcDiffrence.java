package apna_college;

public class StaticcDiffrence {
    void ring() {
        System.out.println("ringing");
    }

    static void alert() {
        System.out.println("alerting");
    }

    public static void main(String[] args) {
        StaticcDiffrence s=new StaticcDiffrence();
        s.ring();
        alert();
    }

}
