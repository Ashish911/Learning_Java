import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {

    public static void main(String args[]){

        try {
            int[] a = {4,5,1};
            System.out.println(a[3]);
        }
        catch (Exception e){
            System.out.println("An exception happened");
        }

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Whats your favourite number");

            int n = scanner.nextInt();
            System.out.println(n);
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number");
        }

        try{
            int[] a = {1};
            System.out.println(a[1]);
        }
        catch (NullPointerException e){
            System.out.println("Sorry but there is no value in the array");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("There is no value in that particular index");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This is finally and it always get run");
            System.out.println("Hola Amigo");
        }

        //finally is used to close objects that needs to be closed so there is no memory leaks.

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println(scanner.next());
        } catch (Exception e){
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }

}
