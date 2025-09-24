public class WordDictionary {
    private static class Node {
        Node[] c = new Node[26];
        boolean end = false;
    }
    private Node root = new Node();
    public void addWord(String word) {
        Node cur = root;
        for (char ch: word.toCharArray()) {
            int i = ch - 'a';
            if (cur.c[i]==null) cur.c[i]=new Node();
            cur = cur.c[i];
        }
        cur.end = true;
    }
    public boolean search(String word) {
        return dfs(word, 0, root);
    }
    private boolean dfs(String w, int idx, Node node) {
        if (node==null) return false;
        if (idx==w.length()) return node.end;
        char ch = w.charAt(idx);
        if (ch == '.') {
            for (Node nxt: node.c) if (nxt != null && dfs(w, idx+1, nxt)) return true;
            return false;
        } else {
            return dfs(w, idx+1, node.c[ch-'a']);
        }
    }
}
