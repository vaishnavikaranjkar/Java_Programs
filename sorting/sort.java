import java.util.*;

//SORTING ARRAYLIST

//sort arraylist using the Collections class and sort method - ascending order
//descending order - collections class and reverse method

//SORT ARRAY
//use Arrays class and sort method
public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        arr1.add(6);
        arr1.add(2);
        arr1.add(3);
        arr1.add(5);


        //ascending
        Collections.sort(arr1);
        for (Integer integer : arr1) {
            System.out.println(integer);
        }


        //descending
        Collections.reverse(arr1);
        for (Integer integer : arr1) {
            System.out.println(integer);
        }


        //sort an array
        int a1[]={4,7,5,1,2,4,4};
        Arrays.sort(a1);
        for (Integer integer : a1) {
            System.out.println(integer);
        }

    }
}
