package apna_college;

class levelll {
    int data;
    levelll left;
    levelll right;

    public levelll(int data) {
        this.data = data;
    }
}

public class BT_kth_level {
    public static void main(String[] args) {
        levelll root = new levelll(1);
        root.left = new levelll(1);
        root.right = new levelll(2);
        root.left.left = new levelll(3);
        root.left.right = new levelll(4);
        root.right.left = new levelll(5);
        root.right.right = new levelll(6);
        int k = 3;
        klvel(root, 1, k);
    }

    public static void klvel(levelll root, int level, int k) {
        if (root == null) {
            return; // Exit the function if the node is null
        }

        if (level == k) {
            System.out.println("Value at k-th level: " + root.data);
            return;
        }

        klvel(root.left, level + 1, k); // Recursive call for left subtree
        klvel(root.right, level + 1, k); // Recursive call for right subtree
    }
}
