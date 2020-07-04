import java.util.Scanner;

public class Numbers {

    public static void main(String args[]){
        String fullName = "Ashish Dongol";
        int age = 20;
        System.out.println("Hello my name is " + fullName + " and my age is " + age);
        int a =5;
        int b = 2;
        System.out.println(a+b);
        System.out.println(a/b);
        System.out.println(a-b);
        System.out.println(a*b);

        long l = 9999999999L;
        Float f = 2.5F;
        Double d = 222222222222222222.5;

        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        //Exponents in Java
        int ex = (int)Math.pow(10,4);
        double exp = Math.pow(2,10);
        System.out.println(ex);
        System.out.println(exp);
        System.out.println(Math.pow(5,2));
        System.out.println((int)Math.pow(5,2));

        //Modulus in Java
        System.out.println(5%12);
        System.out.println(5.3 % 1.3);

        int temp;
        boolean isPrime=true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        scanner.close();
        for (int i = 2; i <= num/2; i++)
        {
            temp = num%i;
            if (temp == 0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true){
            System.out.println(num + " is a prime number");
        } else
        {
            System.out.println(num + " is not a prime number");
        }
    }

}
