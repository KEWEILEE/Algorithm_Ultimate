package three.Exercise;

import org.junit.Test;
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
        boolean flag = true;
        for (char c : chars) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']') {
                flag = '[' == stack.pop();
            } else if (c == ')') {
                flag = '(' == stack.pop();
            } else if (c == '}') {
                flag = '{' == stack.pop();
            }
            if (!flag) {
                return flag;
            }
        }

        return flag;
    }
}
