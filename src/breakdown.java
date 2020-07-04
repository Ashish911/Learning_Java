public class breakdown {

    public static void main(String args[]){

        int i = 0;

        int[] numbers = {10,20,30,40,50};

        while(i<3){
            System.out.println("Hi!");
            i++;
            break;
        }

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == 30){
                break;
            }
            System.out.println(numbers[j]);
        }

        int l = 2;
        switch (l) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("What is that");
                break;
        }

        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.println(j + ", " + k);
                break;
            }
        }

    }

}
