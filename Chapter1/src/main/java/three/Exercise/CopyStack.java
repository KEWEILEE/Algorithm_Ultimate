package three.Exercise;

import three.PushDownStack;

/*
copy the stack using iterator
 */
public class CopyStack {

    public static void main(String[] args) {
        PushDownStack<String> stack =  new PushDownStack<>();
        stack.push("First");
        stack.push("second");
        stack.push("third");

        PushDownStack<String> copyStack = new PushDownStack<>();
        for (Object s: stack){
            copyStack.push((String) s);
        }

        for (Object s: copyStack){
            System.out.println(s);
        }
    }
}
