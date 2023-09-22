package apna_college;

public class BST_Delete {
    static class dlt {
        int data;
        dlt left;
        dlt right;

        public dlt(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        dlt root = null;
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        deleteInBST(root, 11);
        System.out.println("\nafter deletetion of a number");
        inorder(root);
    }

    public static dlt insert(dlt root, int data) {
        if (root == null) {
            return new dlt(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static dlt deleteInBST(dlt root, int value) {
        if (root.data < value) {
            root.right = deleteInBST(root.right, value);
        } else if (root.data > value) {
            root.left = deleteInBST(root.left, value);
        } else {//case 1 for leaf node
            if (root.left == null && root.right == null) {
                return null;
            }//case 2 for single child
            if (root.left == null) {
                return root.right;
            }//case 3 for both children
            dlt IS = findIS(root.right);
            root.data = IS.data;
            root.right = deleteInBST(root.right, IS.data);

        }
        return root;
    }

    public static dlt findIS(dlt root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inorder(dlt root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }
}
