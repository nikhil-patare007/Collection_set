import java.util.NavigableSet;
import java.util.TreeSet;
//NavigableSet interface can navigate the set in reverse order
// compared to the order defined in SortedSet.


public class NavigableSet1 {
    public static void main(String[] args) {
        NavigableSet ns =new TreeSet();
        ns.add(10);
        ns.add(11);
        ns.add(12);
        ns.add(13);
        ns.add(14);
        ns.add(15);
        System.out.println(ns);
        System.out.println("Lower is :" + ns.lower(12));
        System.out.println("floor is :"+ns.floor(12));
        System.out.println("ceiling is :"+ns.ceiling(12));
        System.out.println("higher is :"+ns.higher(12));
        System.out.println("poll first is :"+ns.pollFirst());
        System.out.println("poll last is :"+ns.pollLast());




    }
}
