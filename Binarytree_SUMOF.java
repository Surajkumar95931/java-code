package apna_college;

class sum {
    int data;
    sum left;
    sum right;

    public sum(int data) {
        this.data = data;
    }
}
public class Binarytree_SUMOF {
    public static void main(String[] args) {
        sum root = new sum(1);
        root.left = new sum(2);
        root.right = new sum(3);
        root.left.left = new sum(4);
        root.left.right = new sum(5);
        root.right.left = new sum(6);
        root.right.right = new sum(7);
        int s = sumof(root);
        System.out.println("Sum of all nodes in the binary tree: " + s);
    }

    public static int sumof(sum root) {
        if (root == null) {
            return 0;
        }
        int leftsum = sumof(root.left);
        int rightsum = sumof(root.right);
        return leftsum + rightsum + root.data;
    }
}
