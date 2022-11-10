
package ArrayListDemoProgram;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author nayeem
 */
public class ArrayListDemoProgram {
    public static void main(String[]args)
    {
        //here arraylist name is myList and myList type is integer type.
    ArrayList<Integer>myList=new ArrayList<Integer>();
    //aikhane index wise value deya hoyese.
    myList.add(10);//index no-->(0)
    myList.add(1);//index no-->(1)
    myList.add(99);//index no-->(2)
    myList.add(88);//index no-->(3)
//here index no-->(4) and value is 101.aikhane amra position onujaye value dilam.
    myList.add(4,101);
    
//to remove index value no->(2)
    myList.remove(2);
    
//if we want to sort  MyList then we have to use the class collections.
    Collections.reverse(myList);
    
    System.out.println(myList);
    
    
    
    
    
    
    
    }
    
}
