package apna_college;
class l {
    int data;
    l left;
    l right;
    public l(int data) {
        this.data = data;
    }
}
public class Binarytree_lca {
    public static void main(String[] args) {
        l root = new l(1);
        root.left = new l(2);
        root.right = new l(3);
        root.left.left = new l(4);
        root.left.right = new l(5);
        root.right.left = new l(6);
        root.right.right = new l(7);

        int n1 = 4;
        int n2 = 5;

        l result = lca(root, n1, n2);

        if (result != null) {
            System.out.println("Lowest Common Ancestor of " + n1 + " and " + n2 + " is: " + result.data);
        } else {
            System.out.println("No common ancestor found for " + n1 + " and " + n2);
        }
    }
    public static l lca(l root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        l leftLCA = lca(root.left, n1, n2);
        l rightLCA = lca(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null) {
            return root;
        } else if (leftLCA != null) {
            return leftLCA;
        } else {
            return rightLCA;
        }
    }
}
