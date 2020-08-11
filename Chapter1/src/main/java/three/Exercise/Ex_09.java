package three.Exercise;

import three.PushDownStack;

public class Ex_09 {
    public static void main(String[] args) {
        String input = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        System.out.println(addParentheses(input));
    }

    public static String addParentheses(String input) {
        PushDownStack<String> strings = new PushDownStack<>();
        PushDownStack<String> operator = new PushDownStack<>();
        char[] chars = input.trim().toCharArray();

        for (char c : chars) {
            if (Character.isDigit(c)) {
                strings.push(String.valueOf(c));
            }

            if ("+-*/".contains(String.valueOf(c))) {
                operator.push(String.valueOf(c));
            }

            if (c == ')') {
                String r = strings.pop();
                String l = strings.pop();
                String result = "(" + l + operator.pop() + r + ")";
                strings.push(result);
            }
        }

        return strings.pop();
    }
}
