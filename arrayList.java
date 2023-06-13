/*
array list- it is a part of java collections framework. it is a class found in util package

1. resizable array
2. can contain duplicates
3. maintains insertion order internally

two types-
non-generic (with multiple data types)
generic (with specific data type)

methods - 
1. add() - add(index,element):inserts an element in given index and shifts existing element(if any) in next index.
2. size() - instead of .lenth
3. isEmpty() - gives boolean value
4. remove() - remove("c"), remove(index_of_element)
5. get() - access element in arraylist, get(index)
6. set() - update a value, set(index, value)
*/

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {


        //non-generic
        ArrayList a = new ArrayList();
        a.add(45);
        a.add("meow");
        a.add(1,2);

        for (var object : a) {
            System.out.println(object);
        }



        //generic
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        arr1.add(12);
        arr1.add(45);
        arr1.add(1,55);
        for (Integer integer : arr1) {
            System.out.println(integer);
        }
    }
}
