import java.util.TreeSet;

public class TreeSet1 {
     //allows homogenous
    //ud balance binary serach tree
    //duplication not allow
    //null can be inserted once
    //sorting order
    //inseration order nt preserve**********

    public static void main(String[] args) {
        TreeSet t=new TreeSet();
          t.add(10);
          t.add(30);
          t.add(20);
          t.add(10);
//          t.add(null);
        System.out.println(t);
        //same methods used in sorted set only in this it have ud and its class
    }
}
