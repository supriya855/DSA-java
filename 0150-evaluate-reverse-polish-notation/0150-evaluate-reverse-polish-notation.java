class Solution {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("*") && !tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/")) {
                int num = Integer.parseInt(tokens[i]);
                st.push(num);
            } else {
                if (st.size() < 2) {
                    throw new IllegalArgumentException("Invalid input: not enough numbers in stack");
                }
                int n1 = st.pop();
                int n2 = st.pop();
                if (tokens[i].equals("*")) {
                    st.push(n2 * n1);
                } else if (tokens[i].equals("+")) {
                    st.push(n2 + n1);
                } else if (tokens[i].equals("-")) {
                    st.push(n2 - n1);
                } else if (tokens[i].equals("/")) {
                    st.push(n2 / n1);
                }
            }
        }
        if (st.size() != 1) {
            throw new IllegalArgumentException("Invalid input: more than one element in stack after evaluation");
        }
        return st.pop();
    }
}
