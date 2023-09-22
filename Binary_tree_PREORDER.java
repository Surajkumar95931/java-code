package apna_college;
class po {
    int val;   po left;  po right;
    public po(int val) {
        this.val = val;
    }
}
public class Binary_tree_PREORDER {
    public static void main(String[] args) {
        po root = new po(1);
        root.left = new po(2);
        root.right = new po(3);
        root.left.left = new po(4);
        root.left.right = new po(5);
       // root.right.left = new po(12);
        root.right.right = new po(6);
       // Binary_tree_PREORDER b=new Binary_tree_PREORDER();
        System.out.println("your preorder tree is ");
        preorder(root);
    }
    //static method called directly while non-static method called through object of class
    public  static void preorder(po root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

