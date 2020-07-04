import java.util.HashMap;

public class Hash_Map {

    public static void main(String args[]){

        int a = 10;
        int b = 3;
        int c = 88;

        HashMap<String,Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        System.out.println(happy);
        System.out.println(happy.get("c"));

        HashMap<String, String> fun = new HashMap();
        fun.put("Ashish", "asd");
        fun.put("Hellgaze", "fff");

        System.out.println(fun);

        fun.remove("Hellgaze");

        System.out.println(fun.containsKey("Hellgaze"));
        System.out.println(fun.replace("Ashish","ccc"));
        System.out.println(fun);

        System.out.println(fun.values());
        System.out.println(fun.keySet());
    }

}
