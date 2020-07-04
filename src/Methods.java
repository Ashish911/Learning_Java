public class Methods {

    public static void main(String args[]){
        Welcome();
        Multiplication(5,7);
        Multiplication(10,50);
        Divide(10,2);
    }

    public static void Welcome() {
        System.out.println("Welcome to our calendar");
    }

    public static void Multiplication(int a, int b){
        System.out.println(a*b);
    }

    public static void Divide(int a, int b){
        System.out.println(a/b);
    }

}
