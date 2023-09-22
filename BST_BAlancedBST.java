package apna_college;
import javax.swing.*;
class bt {
    int data;
    bt left;
    bt right;

    public bt(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BST_BAlancedBST {
    public static void main(String[] args) {
        int value[] = {3, 5, 6, 8, 10, 11, 12};
        bt root=createBst(value,0,value.length-1);
        preorder(root);
    }
    public static bt createBst(int arr[],int start,int end){
        if (start>end){
            return null;
        }
        int mid=(start+end)/2;
            bt root=new bt(arr[mid]);
            root.left=createBst(arr,start,mid-1);
            root.right=createBst(arr,mid+1,end);
            return root;
    }
    public static void preorder(bt root){
        if (root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
}
