import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingFrameworkLL{
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
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
