package exercise1;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        BracketStack stack = new BracketStack();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            }
            else if (current == ')' || current == ']' || current == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (!isMatchingPair(topChar, current)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        if (opening == '(' && closing == ')') return true;
        if (opening == '[' && closing == ']') return true;
        if (opening == '{' && closing == '}') return true;

        return false;
    }
}