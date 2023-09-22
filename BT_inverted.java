package apna_college;

class mirror {
    int data;
    mirror left;
    mirror right;

    public mirror(int data) {
        this.data = data;
    }
}

public class BT_inverted {
    public static void main(String[] args) {
        mirror root = new mirror(1);
        root.left = new mirror(2);
        root.right = new mirror(3);
        root.left.left = new mirror(4);
        root.left.right = new mirror(5);
        root.right.left = new mirror(6);
        root.right.right = new mirror(7);

        System.out.print("Original Tree:");
        print(root);
        System.out.println("mirror tree");
        System.out.println(find(root).data);
        print(root);

    }

    public static mirror find(mirror root) {
        if (root == null) {
            return null;
        }
        mirror left = find(root.left);
        mirror right = find(root.right);

        root.left = right;
        root.right = left;
        return root;
    }
    public static void print(mirror root){
        if (root==null){
            return ;
        }
        System.out.print(root.data);
        print(root.left);
        print(root.right);
    }
}
