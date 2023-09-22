package apna_college;

class k_th_level {
    int data;
    levelll left;
    levelll right;
    public k_th_level(int data){
        this.data=data;
    }
}

public class Binary_tree_POSTORDER {
    public static void main(String[] args) {
    levelll root=new levelll(9);
    root.left=new levelll(1);
    root.right=new levelll(2);
    root.left.left=new levelll(3);
    root.left.right=new levelll(4);
    root.right.left=new levelll(5);
    root.right.right=new levelll(6);
    postorder(root);
    }
    public static void postorder(levelll root){
        if (root==null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+"");

    }
}
