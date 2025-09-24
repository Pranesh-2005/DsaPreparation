public class ValidParentheses {
    public boolean isValid(String s) {
        java.util.Deque<Character> st = new java.util.ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (c == '{') st.push('}');
            else if (c == '[') st.push(']');
            else {
                if (st.isEmpty() || st.pop() != c) return false;
            }
        }
        return st.isEmpty();
    }
}
