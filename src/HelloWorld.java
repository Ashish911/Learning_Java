public class HelloWorld {

    public static void main(String args[]){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World! /n asdasdf");

        SayHi();

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.Saysomething("Madre");
    }

    static void SayHi(){
        System.out.println("Hi!");
    }

    void Saysomething(String S){
        System.out.println(S);
    }
}
