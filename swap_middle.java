//swap the elements in an arraylist starting from middle 
import java.util.*;

public class swap_middle{
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        array.add(12); //0
        array.add(45); //1
        array.add(47); //2
        array.add(41); //3
        array.add(10); //4
        array.add(2);  //5
        array.add(22); //6
        array.add(00); //7
        //0th index would be swapped by -> 4th
        //1 -> 5, 2 -> 6, 3 -> 7
        //in case of odd length, keep the middle element where it is and start swapping from the next element

        int len=array.size(); //8
        int var=len/2; //4

        for (int i = 0; i < len; i++) {
            System.out.println(array.get(i));
        }

        //loop would run only length/2 times
        for (int i = 0; i < var; i++) {
            if(len%2==0)
            {
                Collections.swap(array, i, var+i);
            }
            else
            {
                Collections.swap(array, i, var+i+1);
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(array.get(i));
        }
    }
}