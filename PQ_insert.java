package apna_college;

import java.util.ArrayList;

public class PQ_insert {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int ch = arr.size() - 1;//child indx
            int par = (ch - 1) / 2;//parent indx
            while (arr.get(ch) < arr.get(par)) {
                int temp = arr.get(ch);
                arr.set(ch, arr.get(par));
                arr.set(par, temp);
                ch = par;
                par = (ch - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minInx=i;
            if (left< arr.size()&&arr.get(minInx)>arr.get(left)){
                minInx=left;
            }
            if (right< arr.size()&&arr.get(minInx)>arr.get(right)){
                minInx=right;
            }
            if (minInx!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(minInx));
                arr.set(minInx,temp);
                heapify(minInx);
            }
        }
        public int remove(){
            int data=arr.get(0);
            //swap first to last and last to first
                int temp=arr.get(0);
                arr.set(0,arr.get(arr.size()-1));
                arr.set(arr.size()-1,temp);
                //delete last
            arr.remove(arr.size()-1);
            //step 3
            heapify(0);
            return data;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(5);
        h.add(9);
        h.add(7);
        h.add(3);
        while (!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
