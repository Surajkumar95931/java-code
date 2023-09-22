package apna_college;

public class BinaryTree_TRAVERSALS {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Binary {
        static int indx = -1;

        public static Node Buildtree(int Nodes[]) {
            indx++;
            if (Nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(Nodes[indx]);
            newNode.left = Buildtree(Nodes);
            newNode.right = Buildtree(Nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Binary tree = new Binary();
        Node root = tree.Buildtree(nodes);
        System.out.println(root.data);
    }
}
