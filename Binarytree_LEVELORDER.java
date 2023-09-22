package apna_college;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class lo {
    int data;
    lo left;
    lo right;

    public lo(int data) {
        this.data = data;
    }
}

public class Binarytree_LEVELORDER {
    public static void main(String[] args) {
        lo root = new lo(1);
        root.left = new lo(2);
        root.right = new lo(3);
        root.left.left = new lo(4);
        root.left.right = new lo(5);
        root.right.left = new lo(6);
        root.right.right = new lo(7);
        levelorder(root);


    }
    public static void levelorder(lo root){
        if (root==null){
            return;
        }
        Queue<lo> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            lo current=q.remove();
            if (current==null){
                if (!q.isEmpty()){
                    q.add(null);
                    System.out.println();
                }

            }
            else {
                System.out.print(current.data+" ");
                if (current.left!=null){
                    q.add(current.left);
                }if (current.right!=null){
                    q.add(current.right);
                }
            }
        }
    }
}