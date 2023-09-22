package apna_college;
class h{
    int data;
    h left;
    h right;

    public h(int data) {
        this.data = data;
    }
}
public class Binary_tree_HEIGHT {
    public static void main(String[] args) {
        h root=new h(1);
        root.left=new h(2);
        root.right=new h(3);
        root.left.left=new h(4);
        root.left.right=new h(5);
        root.right.left=new h(6);
        root.right.right=new h(7);
        int a=height(root);
        System.out.println("height of tree"+a);
        System.out.println("count the nodes");
        System.out.println(count(root));
    }
    public static int height(h root){
        if (root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;

    }
    public static int count(h root){
        if (root==null){
            return 0;
        }
        int lc=height(root.left);
        int rc=height(root.right);
        return lc+rc+1;

    }
}
