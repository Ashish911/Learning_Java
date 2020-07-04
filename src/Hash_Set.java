import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

    public static void main(String args[]){
        HashSet<String> h = new HashSet<String>();
        h.add("Lemur");
        h.add("orangatang");
        h.add("spider monkey");
        h.add("silverback gorilla");

        h.remove("Lemur");
        h.clear();
        System.out.println(h.size());
        System.out.println(h.contains("orangatang"));
        System.out.println(h.isEmpty());

        System.out.println(h);

        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add(24);
        hashSet.add(30);

        Object[] c = hashSet.toArray();

        System.out.println(c[2]);
        System.out.println(hashSet.hashCode());

        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
