package apna_college;
class minDist {
    int data;
    minDist left;
    minDist right;
    minDist(int data) {
        this.data = data;
    }
}
public class Binary_tree_MINIMUM_DIST_Bw_TwoNode {
    public static minDist lca(minDist root, minDist p, minDist q) {
        if (root == null || root.data == p.data || root.data == q.data) {
            return root;
        }
        minDist leftLCA = lca(root.left, p, q);
        minDist rightLCA = lca(root.right, p, q);

        if (leftLCA != null && rightLCA != null) {
            return root;
        } else if (leftLCA != null) {
            return leftLCA;
        } else {
            return rightLCA;
        }
    }

    public static int findDist(minDist root, minDist target, int distance) {
        if (root == null) {
            return -1;
        }
        if (root.data == target.data) {
            return distance;
        }
        int leftDist = findDist(root.left, target, distance + 1);
        int rightDist = findDist(root.right, target, distance + 1);

        if (leftDist != -1) {
            return leftDist;
        }
        return rightDist;
    }

    public static int minDistanceBetweenNodes(minDist root, minDist p, minDist q) {
        minDist lca = lca(root, p, q);

        int distanceP = findDist(lca, p, 0);
        int distanceQ = findDist(lca, q, 0);

        return distanceP + distanceQ;
    }

    public static void main(String[] args) {
        minDist root = new minDist(1);
        root.left = new minDist(2);
        root.right = new minDist(3);
        root.left.left = new minDist(4);
        root.left.right = new minDist(5);
        root.right.left = new minDist(6);
        root.right.right = new minDist(7);

        minDist node4 = root.left.left;
        minDist node7 = root.right.left;

        int distance = minDistanceBetweenNodes(root, node4, node7);

        System.out.println("Minimum distance between nodes " + node4.data + " and " + node7.data + " is: " + distance);
    }
}
