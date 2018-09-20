import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    //ud is hashtable and linkedlist
    //used for cache memory operation
    //insertion order preserve**********
    //allow null insertion once cause duplication not allowed
    //haven't capacity
    public static void main(String[] args) {
        LinkedHashSet l=new LinkedHashSet();
        l.add(10);
        l.add(50);
        System.out.println(l.clone());
        //remove,clear,size
        System.out.println(l);

    }
}
