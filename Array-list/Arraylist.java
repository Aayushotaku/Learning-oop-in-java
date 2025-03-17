import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        // defining Array list 
        ArrayList<Integer> list= new ArrayList<>();
        //adding element on list
        list.add(32);
        list.add(44);
        list.add(11);
        list.add(1);
        list.add(2);
        System.out.println(list);

        //Getting an specific elements
        int requiredelement= list.get(3);// pasds index of the element
        System.out.println(requiredelement);

        // to add element in between
        list.add(2, 222);
        System.out.println(list);

        //set element or change the value of an element
        list.set(4, 11);
        System.out.println(list);

        //to delete an element
        list.remove(2);
        System.out.println(list);
        //to find size
        int size=list.size();
        System.out.println(size);

        //loop in array list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }
        //to sort 
         Collections.sort(list);
         System.out.println(list);
    }
}
