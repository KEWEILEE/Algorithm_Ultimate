package three.Exercise;

import three.PushDownStack;

public class Parentheses {
    public static void main(String[] args) {
        String s1 = "[()]{}{[()()]()}";
        String s2 = "[(])";
        System.out.println(Test(s1));
        System.out.println(Test(s2));

    }

    public static boolean Test(String s) {
        PushDownStack<Character> stack = new PushDownStack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else {
                if (!pair(c, stack.pop())){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean pair(char l, char r) {
        switch (l) {
            case '}':
                return r == '{';
            case ']':
                return r == '[';
            case ')':
                return r == '(';
            default:
                return false;
        }
    }
}
