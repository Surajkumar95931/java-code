package apna_college;

class bst {
    int data;
    bst left;
    bst right;

    public bst(int data) {
        this.data = data;
    }
}

public class BST_build_bst {
    public static void main(String[] args) {
        int values[] = {12, 3, 4, 2, 9};
        bst root = null;
       for (int i=0;i< values.length;i++){
           root=insert(root,values[i]);

       }
        System.out.println("if tree is sorted then you understand that you build a successfull BST");
        inorder(root);
    }
    public static bst insert(bst root,int val){
        if (root==null){
            root=new bst(val);
            return root;
        }
        if (root.data>val){
           root.left= insert(root.left,val);
        }else{
            root.right= insert(root.right,val);
        }
        return root;
    }
    public static void inorder(bst root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);

    }
}
