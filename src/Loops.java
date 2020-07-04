import java.util.ArrayList;
import java.util.Scanner;

public class Loops {

    public static void main(String args[]){
        //While Loop
        int a = 0;

        while (a < 10){
            System.out.println(a);
            a++;
        }

        String sentence = "flapjacks are awesome!";
        Scanner scanner = new Scanner(sentence);
        ArrayList<String> words = new ArrayList<String>();

        while(scanner.hasNext()){
            words.add(scanner.next());
        }

        System.out.println(words);
        //do while loop
        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while (b<10);

        //For Loops
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("Mami");
        }

        int[] grades = {98, 100, 80, 76};

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        //Nested For Loops
        for (int i = 0; i < 5 ; i++) {
            System.out.println("It is freaking cold outside");
        }

        String[] colors = {"Red","Blue","Green"};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        String[][] fancycolors = {{"Red","Blue","Green"},
                {"Violet","Light Blue","Maroon"}};

        for (int i = 0; i < fancycolors.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(fancycolors[i][j]);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i : " + i + ", j : " + j);
            }
        }

        //For Each Loops
        String[] cars = {"BMW M2", "GALLARDO", "GTR 350Z"};

        for (String car : cars){
            System.out.println(car);
        }

        ArrayList<Integer> numbers = new ArrayList();

        numbers.add(3);
        numbers.add(7);
        numbers.add(10);

        for (Integer i: numbers) {
            System.out.println(i);
        }
    }

}
