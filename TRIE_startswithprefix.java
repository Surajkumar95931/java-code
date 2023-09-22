package apna_college;

public class TRIE_startswithprefix {
    static class Node {
        Node[] child = new Node[26];
        boolean eow;//end of word;

        Node() {
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void main(String[] args) {
        String word[] = {"apple", "app", "mango"};
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        String prefix1 = "app";
        String prefix2 = "moon";
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int indx = key.charAt(level) - 'a';

            if (curr.child[indx] == null) {
                return false;
            }
            curr = curr.child[indx];
        }
        return curr.eow = true;
    }

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int indx = word.charAt(level) - 'a';

            if (curr.child[indx] == null) {
                curr.child[indx] = new Node();
            }
            curr = curr.child[indx];
        }
        curr.eow = true;
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int indx = prefix.charAt(i) - 'a';

            if (curr.child[indx] == null) {
                return false;
            }
            curr = curr.child[indx];
        }
        return true;
    }

}
