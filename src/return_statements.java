public class return_statements {

    public static void main(String args[]){
        printMsg();
        int sum = Add(10,20);
        System.out.println(sum);

        String shouting = caps("no no no ");
        System.out.println(shouting);

        int[] awesomeArray = gimmeArrayFromInts(20,30,50);
        System.out.println(awesomeArray[0]);
    }

    public static void printMsg() {
        System.out.println("This is our first method");
    }

    //Return statements let you run a method and bring the results of that method into a variable
    public static int Add(int a, int b){
        return a + b;
    }

    public static String caps(String s) {
        return s.toUpperCase();
    }

    public static int[] gimmeArrayFromInts(int a, int b, int c){
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        return array;
    }
}
