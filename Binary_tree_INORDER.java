package apna_college;



public class Binary_tree_INORDER {
    static class io {
        int data;
        io left;
        io right;

        public io(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Binary_tree_INORDER b = new Binary_tree_INORDER();
        io root = new io(1);
        root.left = new io(2);
        root.right = new io(3);
        root.left.left = new io(4);
        root.left.right = new io(5);
        root.right.left = new io(6);
        root.right.right = new io(7);
        b.inorder(root);
    }

    public void inorder(io root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
