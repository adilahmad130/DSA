import java.util.ArrayDeque;
import java.util.Queue;

public class QueueUsingFrameworkAD{
    public static void main(String args[]) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Queue: ");

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
