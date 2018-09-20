import javax.print.attribute.HashAttributeSet;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    //underlying data structure is hash table
    //duplication not allow
    //efficient for searching
    //heterogenous can hold because key and value should different(internally hashset implemets hashmap)
    //null allow once
    //default capacity 16
    //default load factor 0.75:no of stored element/size of hash table


    public static void main(String[] args) {
        HashSet h1 = new HashSet();
        HashSet h2 = new HashSet();
        HashSet h = new HashSet(12, 0.78f);
        h.add(1);
        h.add("s");
        h.add(2);
        h.add("a");
        h.add(0);
        System.out.println("Size is :"h.size());
        System.out.println(h);
        Iterator iterator = h.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        h.remove("s");
        System.out.println(h);
    }
}
