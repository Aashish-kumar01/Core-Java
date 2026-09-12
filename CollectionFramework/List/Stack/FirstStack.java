import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class FirstStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());


        // ye add karega element ko niche se 0-based indexing
        stack.add(1,7);
        System.out.println(stack);


        // ye output dega ki top se ye element kitna niche hai 1-based indexing
        System.out.println(stack.search(7));

        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.getLast();
        list.removeLast();
        list.size();
        list.isEmpty();


        // ArrayList as stack but its complicated
        ArrayList<Integer> arr = new ArrayList<>();
        // push
        arr.add(1);
        // peek
        arr.get(arr.size()-1);
        // pop
        arr.remove(arr.size()-1);
    }
}
