import java.util.Scanner;

public class Strings {

    public static void main(String args[]){
        String a = "hello World!";
        System.out.println(a);
        String firstName = "Ashish";
        String lastName = "Dongol";
        System.out.println("Hello My name is " + firstName + " " + lastName);

        //Escape Characters
        System.out.println("These are double quotes\"\"");
        System.out.println("This is a backslash \\");
        System.out.println("This file is located at ~\\Desktop\\helloworld");
        System.out.println("This is a tab \t!");
        System.out.println("This \n is \n on \n multiple lines");

        //String User input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Pokemon 1");
        String pokemon1 = scanner.nextLine();
        System.out.println("Enter Pokemon 2");
        String pokemon2 = scanner.nextLine();
        System.out.println("Enter Pokemon 3");
        String pokemon3 = scanner.nextLine();
        System.out.println("Your Pokemon's are : ");
        System.out.println(pokemon1);
        System.out.println(pokemon2);
        System.out.println(pokemon3);

        //Converting String to Integer
        String s = "102";
        System.out.println(Integer.parseInt(s)+2);

        String v = "age: 47";
        v = v.replaceAll("\\D+","");
        System.out.println(Integer.parseInt(v));

        //Converting Integer to String
        int n = 103;
        System.out.println(Integer.toString(n));

        //String Methods
        String name = "Billy";

        System.out.println("Name: " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First Char: " + name.charAt(0));
        System.out.println("Length: " + name.length());
        System.out.println("Last Char: " + name.charAt(4));
        System.out.println("Substring: " + name.substring(0,2));
    }

}
