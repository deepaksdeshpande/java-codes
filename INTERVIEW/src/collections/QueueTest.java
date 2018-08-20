package collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String args[]) {
        Queue<Integer> q = new PriorityQueue<Integer>();
        q.add(1);
        System.out.println(q);
        q.add(3);
        System.out.println(q);
        q.add(2);
        System.out.println(q);
        
        Iterator<Integer> it = q.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        System.out.print(q.poll() + " ");
        System.out.print(q.peek() + " ");
        System.out.print(q.peek());
    }
}
