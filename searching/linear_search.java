public class linear_search
{
    public int lsearch(int []a, int size, int key)
    {
        int index=0;
        while(index<size)
        {
            if(a[index]==key)
            {
                return index;
            }
            index++;
        }
        return -1;
    }
    public static void main(String[] args) {
        linear_search ls=new linear_search();

        int []array = {4,5,6,3,8,9};
        int sz=array.length;
        int key=9;

        int found_index=(ls.lsearch(array,sz,key))+1;

        System.out.println("The element "+key+" is found at index "+found_index);
    }
}