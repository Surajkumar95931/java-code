package apna_college;

public class TRIE_SUFFIX_UNIQUE_SUBSTRING {
    static class Node {
      Node[]child=new Node[26];
        boolean eow;//end of word;
        Node() {
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
        }
    }
    public static Node root=new Node();
    public static void main(String[] args) {
        String str="ababa";
        //find suffix
        for (int i=0;i<str.length();i++){
            String suffix=str.substring(i);
            insert(suffix);
        }
        System.out.println(countOfNode(root));
    }
    public static int countOfNode(Node root){
        if (root==null){
            return 0;
        }
        int count=0;
        for (int i=0;i<26;i++){
            count+=countOfNode(root.child[i]);
        }
        return count+1;
    }
    public static void insert(String word) {
       Node curr=root;
        for (int level = 0; level < word.length(); level++) {
            int indx = word.charAt(level) - 'a';

            if (curr.child[indx] == null) {
                curr.child[indx]=new Node();
            }
            curr = curr.child[indx];
        }
        curr.eow = true;
    }
}
