package apna_college;

public class BST_largest_in_BT {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }
    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;
        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static void main(String[] args) {
        /*
         * Construct a sample Binary Tree:
         *       10
         *      / \
         *     5  15
         *    / \   \
         *   1  8   7
         */
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(1);
        root.left.right = new Node(8);
        root.right.right = new Node(7);

        Info result = largestBSTinBT(root);
        System.out.println("Size of largest BST in BT: " + result.size);
    }

    public static Info largestBSTinBT(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBSTinBT(root.left);
        Info rightInfo = largestBSTinBT(root.right);

        int size;
        int min, max;

        if (leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.max && root.data < rightInfo.min) {
            size = leftInfo.size + rightInfo.size + 1;
            min = Math.min(root.data, leftInfo.min);
            max = Math.max(root.data, rightInfo.max);
        } else {
            size = Math.max(leftInfo.size, rightInfo.size);
            min = Integer.MIN_VALUE;
            max = Integer.MAX_VALUE;
        }

        return new Info(leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.max && root.data < rightInfo.min,
                size, min, max);
    }
}
