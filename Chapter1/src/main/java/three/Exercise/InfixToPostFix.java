package three.Exercise;

import three.PushDownStack;

public class InfixToPostFix {
    public static void main(String[] args) {
        String s = "a+b*c+(d*e+f)*g";
        System.out.println(convert(s.trim()));
    }

    public static String convert(String s) {
        char[] chars = s.toCharArray();
        PushDownStack<Character> stack = new PushDownStack<>();
        String out = "";
        for (char c : chars) {
            if (Character.isLetter(c)) {
                out = out + String.valueOf(c);
            }
            if ("+-*/(".contains(String.valueOf(c))) {
                if (stack.isEmpty() || c == '(' || stack.peek() == '(') {
                    stack.push(c);
                } else {
                    if (priority(c, stack.peek())) {
                        stack.push(c);
                    } else {
                        while (!stack.isEmpty()&&stack.peek() != '(') {
                            out += stack.pop();
                        }
                        stack.push(c);
                    }
                }
            }
            if (c == ')') {
                while (stack.peek() != '(') {
                    out+=stack.pop();
                }
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            out += stack.pop();
        }
        return out;
    }

    //优先级大，优先级小或者等于 左边比右边
    public static boolean priority(char left, char right) {
        if (left == '*' || left == '/') {
            if (right == '*' || left == '/') {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
