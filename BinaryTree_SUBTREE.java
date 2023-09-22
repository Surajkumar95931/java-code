package apna_college;
class sub {
    int data;
    sub left;
    sub right;
    sub(int dist) {
        this.data = dist;
    }
}

public class BinaryTree_SUBTREE {
    public boolean isSubtree(sub root, sub subRoot) {
        if (root == null) {
            return false;
        }
        if (isSameTree(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(sub node, sub subRoot) {
        if (node == null && subRoot == null) {
            return true;
        }
        if (node == null || subRoot == null) {
            return false;
        }
        if (node.data != subRoot.data) {
            return false;
        }
        return isSameTree(node.left, subRoot.left) && isSameTree(node.right, subRoot.right);
    }

    public static void main(String[] args) {
        // Create the main tree (s)
        sub s = new sub(3);
        s.left = new sub(4);
        s.right = new sub(5);
        s.left.left = new sub(1);
        s.left.right = new sub(2);

        // Create the subtree (t)
        sub t = new sub(4);
        t.left = new sub(1);
        t.right = new sub(2);

        BinaryTree_SUBTREE checker = new BinaryTree_SUBTREE();
        boolean isSubtree = checker.isSubtree(s, t);

        if (isSubtree) {
            System.out.println("t is a subtree of s.");
        } else {
            System.out.println("t is not a subtree of s.");
        }
    }
}


