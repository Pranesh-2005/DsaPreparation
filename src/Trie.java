public class Trie {
    private static class Node {
        Node[] children = new Node[26];
        boolean end = false;
    }
    private Node root = new Node();
    public void insert(String word) {
        Node cur = root;
        for (char c: word.toCharArray()) {
            int i = c - 'a';
            if (cur.children[i] == null) cur.children[i] = new Node();
            cur = cur.children[i];
        }
        cur.end = true;
    }
    public boolean search(String word) {
        Node cur = root;
        for (char c: word.toCharArray()) {
            cur = cur.children[c-'a'];
            if (cur == null) return false;
        }
        return cur.end;
    }
    public boolean startsWith(String prefix) {
        Node cur = root;
        for (char c: prefix.toCharArray()) {
            cur = cur.children[c-'a'];
            if (cur == null) return false;
        }
        return true;
    }
}
