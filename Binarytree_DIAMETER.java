package apna_college;
class dia {
    int data;
    dia left;
    dia right;
    public dia(int data) {
        this.data = data;
    }
}
public class Binarytree_DIAMETER {
    public static void main(String[] args) {
        dia root = new dia(1);
        root.left = new dia(2);
        root.right = new dia(3);
        root.left.left = new dia(4);
        root.left.right = new dia(5);
        root.right.left = new dia(6);
        root.right.right = new dia(7);
        int find = diameter(root);
        System.out.println("the diameter of tree is " + find);
    }
    public static int diameter(dia root) {
        if (root == null) {
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);
        int selfDiam = leftHt + rightHt + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }
    public static int height(dia root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;

    }
}
