import java.util.ArrayDeque;
import java.util.Deque;
// import java.util.LinkedList;

public class DequeueDemo {
    public static void main(String[] args) {
        // double-ended queue
        // allows insertion and removal of elements from both ends
        // Versatile than regular queues and stacks because they support all the operations of both

        
        // INSERTION METHODS

        // addFirst(E e): Inserts the specified element at the front
        // addLast(E e): Inserts the specified element at the end
        // offerFirst(E e): Inserts the specified element at the fron if possible
        // offerLast(E e): Inserts the specified element at the end if possible


        // REMOVAL METHODS

        // removeFirst(): Retrieves and removes the first element. throws exception if empty
        // removeLast(): Retrieves and removes the last element. throws exception if empty
        // pollFirst(): Retrieves and removes the first element, or returns null if empty.
        // pollLast(): Retrieves and removes the last element, or returns null if empty.


        // EXAMINATION METHODS

        // getFirst(): Retrieves, but does not remove, the first element. throws exception if emtpy
        // getLast(): Retrieves, but does not remove, the last element. throws excemtion if empty
        // peekFirst(): Retrieves, but does not remove, the first element, or returns null if empty.
        // peekLast(): Retrieves, but does not remove, the last element, or returns null if empty.


        // STACK METHODS

        // push(E e): Adds an element 

        Deque<Integer> dq = new ArrayDeque<>(); // Faster iteration, low memory, no null allowed
        // circular, head and tail
        // no need to shift elements, just shift head and tail
        dq.addFirst(10);
        dq.addLast(20);
        dq.offerFirst(5);
        dq.offerLast(25);
        // 5, 10, 20, 25
        System.out.println(dq);
        System.out.println("First Element: "+ dq.getFirst()); // output 5
        System.out.println("Last Element: " + dq.getLast());
        dq.removeFirst(); // Remove 5
        dq.pollLast(); // Remove 25
        // Current Deque: [10, 20]
        for(int num: dq){
            System.out.println(num);
        }
        // Deque<Integer> dq1 = new LinkedList<>(); // insertion, deletion somewhere in middle
        


    }
}
