import java.util.ArrayList;

public class Arrays {

    public static void main(String args[]){

        String backpack[] = {"Shotgun", "Knife", "Rifle", "Sniper"};
        String zombies[] = {"Close-range", "Mid-range", "Long-range"};
        int numbers[] = {4,90,70};

        System.out.println(backpack[0]);
        System.out.println(zombies[0]);

        //2d Arrays
        int[][] lotteryCard = { {20,15,7},
                {8,7,19},
                {7,13,49}};

        int[][] lotteryCard2 = new int[3][3];
        lotteryCard2[0][0] = 20;
        lotteryCard2[0][1] = 15;
        lotteryCard2[0][2] = 7;

        System.out.println(lotteryCard[0][0]);

        for (int i = 0; i < lotteryCard.length ; i++) {
            System.out.println(lotteryCard[i][i]);
        }

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(lotteryCard[i][j]);
            }
        }

//        String[] fruits = new String[3];
//        fruits[0] = "Mango";
//        fruits[1] = "Apple";
//        fruits[2] = "Strawberry";
//        fruits[3] = "Watemelon";


        //ArrayLists. These are very flexible in comparison to arrays.
        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("watermelon");

        fruitList.remove("Strawberry");
        fruitList.clear();
        System.out.println(fruitList.contains("Raspberry"));

        System.out.println(fruitList);
        System.out.println(fruitList.indexOf("Apple"));
    }

}
