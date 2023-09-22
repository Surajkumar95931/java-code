package apna_college;

public class TRIE_INSERT_search {
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
        String[] word = {"the", "a", "there", "their", "any", "thee"};
        String key = "theanya";
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        System.out.println(search("any"));
        System.out.println(wordBreak(key));
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

    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }
}

