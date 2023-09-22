package apna_college;

import java.util.ArrayList;

class rtl {
    int data;
    rtl left;
    rtl right;

    public rtl(int data) {
        this.data = data;
    }
}

public class BST_ROOT2LEAF {
    public static void main(String[] args) {
        rtl root = null;
        int values[] = {4, 9, 6, 7, 12, 57, 62, 10};
        //
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println("\nAll possible paths");
        printRoot2Leaf(root,new ArrayList<>());
    }

    public static rtl insert(rtl root, int value) {
        if (root == null) {
            root = new rtl(value);
            return root;
        }
        if (root.data > value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }
    public static void inorder(rtl root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void printRoot2Leaf(rtl root, ArrayList<Integer> path){
        if (root==null){
            return;
        }
        path.add(root.data);
        if (root.left==null&&root.right==null){
            printpath(path);
        }
        printRoot2Leaf(root.left,path);
        printRoot2Leaf(root.right,path);
        path.remove(path.size()-1);
    }
    public static void printpath(ArrayList<Integer> path){
        for (int i=0;i< path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println("Null");
    }
}
