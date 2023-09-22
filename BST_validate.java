package apna_college;

class vd {
    int data;
    vd left;
    vd right;

    public vd(int data) {
        this.data = data;
    }
}

public class BST_validate {
    public static void main(String[] args) {
        vd root = new vd(5);
        root.left = new vd(4);
        root.right = new vd(7);
        root.left.left = new vd(3);
        root.left.right = new vd(5);
        root.right.right = new vd(7);
        root.right.right.right = new vd(8);

        boolean isValidBST = isValidate(root, null, null);
        System.out.println("please check this tree is valid or not " + isValidBST);
    }

    public static boolean isValidate(vd root, vd min, vd max) {
        if (root == null) {
            return true;
        }
        if ((min != null && root.data <= min.data) || (max != null && root.data >= max.data)) {
            return false;
        }
        return isValidate(root.left, min, root) && isValidate(root.right, root, max);
    }
}
