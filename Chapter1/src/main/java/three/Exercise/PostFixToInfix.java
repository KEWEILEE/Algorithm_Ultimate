package three.Exercise;

import three.PushDownStack;

/**
 * post fix back to infix
 */
public class PostFixToInfix {

    public static void main(String[] args) {
        String s = "a+b*c+(d*e+f)*g";
        String postfix = InfixToPostFix.convert(s);
        System.out.println(postToInfix(postfix));
    }

    public static String postToInfix(String s) {
        char[] chars = s.toCharArray();
        PushDownStack<String> stack = new PushDownStack<>();
        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                stack.push(String.valueOf(c)); //if character put it into stack
            }
            if (c == '*' || c == '/') {
                String upper = addParentheses(stack.pop());
                String lower = addParentheses(stack.pop());
                stack.push(lower + c + upper);
            }

            if (c == '+' || c == '-') {
                String upper = stack.pop();
                String lower = stack.pop();
                stack.push(lower + c + upper);
            }
        }
        return stack.pop();
    }

    public static String addParentheses(String s) {
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-'){
                s = "(" + s + ")";
                break;
            }
        }
        return s;
    }
}
