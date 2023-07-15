//find the second largest and second smallest element from an array

public class second_smallest_second_largest {
    public static void main(String[] args) {

        int array[]={1,2,45,1,21,5,45,4,12,4};

        //sort the array
        int len=array.length;
        int temp=0;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }      
    

        //finding the second smallest no matter the index
        int f_small=array[0];
        int s_small=0;
        for(int i=0;i<array.length;i++)
        {
            if(f_small==array[i])
            {
                continue;
            }   
            else
            {
                s_small=array[i];
                break;
            }
        }
        System.out.println("Second smallest: "+s_small);




        //finding the second largest no matter the index
        int f_large=array[array.length-1];
        int s_large=0;
        for(int i=array.length-1;i>=0;i--)
        {
            if(f_large==array[i])
            {
                continue;
            }
            else
            {
                s_large=array[i];
                break;
            }
        }
        System.out.println("Second largest: "+s_large);
    }
}
