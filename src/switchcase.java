public class switchcase {

    public static void main(String args[]){

        int day = 10;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Dont know bro");
                break;
        }

        String dog = "Shepard";

        switch (dog) {
            case "Shepard":
                System.out.println("Large");
                break;
            case "Chiwawa":
                System.out.println("Small");
            default:
                System.out.println("Dont know bro");
                break;
        }

    }
}
