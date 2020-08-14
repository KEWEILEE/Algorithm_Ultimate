package three.Exercise;

import three.PushDownStack;

public class PeekStack {
    public static void main(String[] args) {
        PushDownStack<String> stack = new PushDownStack<>();
        stack.push("1");
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
