package apna_college;
public class BST_practice {
    static class node {
        int data;
        node left;
        node right;
        public node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        node root = new node(8);
        root.left = new node(5);
        root.right = new node(11);
        root.left.left = new node(3);
        root.left.right = new node(6);
        root.right.right = new node(20);
    }
}
