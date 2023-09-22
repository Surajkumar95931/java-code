package apna_college;

class Nod {
    int data;
    Nod left;
    Nod right;

    public Nod(int data) {
        this.data = data;
    }
}

public class BST_search {
    public static void main(String[] args) {
        Nod root = new Nod(4);
        root.left = new Nod(2);
        root.right = new Nod(6);
        root.left.left = new Nod(1);
        root.left.right = new Nod(3);
        root.right.left = new Nod(5);
        root.right.right = new Nod(7);
        int key = 8;
        Nod result = searchBST(root, key);
        if (result != null) {
            System.out.println("key " + key + " found in your BST");
        } else {
            System.out.println("sorry not found");
        }
    }

    public static Nod searchBST(Nod root,int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return searchBST(root.left, key);
        } else {
            return searchBST(root.right, key);
        }
    }
}

