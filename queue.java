import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements (Enqueue)
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);

        // Peek (see front element)
        System.out.println("Front element: " + queue.peek());

        // Remove elements (Dequeue)
        String removed = queue.remove();
        System.out.println("Removed: " + removed);
        System.out.println("Queue after removal: " + queue);

        // Using poll() (removes and returns, or null if empty)
        queue.poll();
        System.out.println("After poll(): " + queue);

        // Check if empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}


