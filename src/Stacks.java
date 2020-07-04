import java.util.Stack;

public class Stacks {

    public static void main(String args[]){

        Stack<String> games = new Stack();
        games.add("Super Mario Bros");
        games.add("Guitar hero 3");
        games.add("Witcher");

        System.out.println(games);
        System.out.println(games.pop());
        System.out.println(games.peek());

        Stack<Character> legos = new Stack<>();
        legos.add('R');
        legos.add('B');
        legos.add('Y');

        System.out.println(legos.peek());
        System.out.println(legos.contains('P'));
        System.out.println(legos.empty());
        System.out.println(legos.get(1));

        System.out.println(legos.set(1,'P'));
        System.out.println(legos);
        System.out.println(legos.size());
    }
}
