import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String args[]){

        Queue<String> bbqLine = new LinkedList<String>();

        bbqLine.add("Jackson");
        bbqLine.add("Tyreek");
        bbqLine.add("Susan");

        bbqLine.poll();
        System.out.println(bbqLine.peek());

        System.out.println(bbqLine);

        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        queue.poll();
        queue.peek();
        System.out.println(queue.size());
        System.out.println(queue.contains("V"));

        System.out.println(queue.toArray()[1]);


    }

}
