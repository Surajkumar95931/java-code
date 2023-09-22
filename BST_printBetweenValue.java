package apna_college;

class pwv {//pwv means print between value
    int data;
    pwv left;
    pwv right;

    public pwv(int data) {
        this.data = data;
    }
}

public class BST_printBetweenValue {
    public static void main(String[] args) {
        pwv root = null;
        int num[]={8, 5, 3, 1, 4, 6, 10, 11, 14};
        int range1st=4;
        int range2nd=10;
        for (int i = 0; i < num.length; i++) {
            root = insert(root, num[i]);
        }
        //inorder(root);
        System.out.println("\nrange bw "+range1st+" & "+range2nd+" is");
        printInRange(root,range1st,range2nd);

    }
    public static pwv insert(pwv root, int data) {
        if (root == null) {
            return new pwv(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void printInRange(pwv root, int range1st, int range2nd) {
        if (root == null) {
            return;
        }
        if (root.data >= range1st && root.data <= range2nd) {
            printInRange(root.left, range1st, range2nd);
            System.out.println(root.data);
            printInRange(root.right, range1st, range2nd);
        } else if (root.data < range1st) {
            printInRange(root.left, range1st, range2nd);
        } else {
            printInRange(root.right, range1st, range2nd);
        }

    }
}

