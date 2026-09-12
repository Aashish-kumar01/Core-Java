import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        System.out.println(q.size());
        
        // System.out.println(q.remove()); // throws exception if empty
        System.out.println(q.poll()); // gives null output if empty

        // System.out.println(q.element()); // throws exception if empty
        System.out.println(q.peek()); // gives null output if empty


        Queue<Integer> q1 = new ArrayBlockingQueue<>(2);
        System.out.println(q1.add(1));
        System.out.println(q1.add(2));
        
        // System.out.println(q1.add(4)); // throws exception
        System.out.println(q1.offer(3));
    }
}
