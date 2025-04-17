package Collection;

import java.util.Stack;

public class StackEx {

    public static void main(String[] args) {
        
        Stack<Integer> list = new Stack<Integer>();
        
        list.add(10);
        list.push(22);
        list.add(99);
        list.push(45);
        list.add(null);
        list.add(80);
        
        System.out.println(list);          // Prints the stack
        System.out.println("Peek " + list.peek());   // Top element
        System.out.println(list);          // Still full stack
        System.out.println("Pop " + list.pop());    // Removes top element
        System.out.println(list);          // Stack after pop
    }
}
