import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {
    //it's interface so haven't underlying datastructure
    //inserted element in sorted order
    //doesn't preserve inserted order
    //homogenous
    //it uses comparable interface and compareTo() method to sort string values
    //string class implements comprable interface
    //comparator():-user defined soring  (+,-,0)
    //comparable:-default sorting order
    public static void main(String[] args) {
        SortedSet<String> s = new TreeSet<>(); //sorted set is  interface
        s.add("a");
        s.add("c");
        s.add("b");
        s.add("d");
        System.out.println(s);
        System.out.println(s.last());
        System.out.println(s.first());
        SortedSet<Integer> s1 = new TreeSet<>();

        s1.add(50);
        s1.add(100);
        s1.add(150);
        s1.add(200);
        s1.add(250);
        System.out.println(s1);
        System.out.println("headset(less than 150): " + s1.headSet(150));
        System.out.println("tailset(greater than or equal to 100): " + s1.tailSet(100));
        System.out.println(s1.subSet(50, 250)); //exclude last


    }
}










