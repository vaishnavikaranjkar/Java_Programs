//sort an array using simple for loop
public class sort_manually {
    public static void main(String[] args) {
        int array[]={1,5,2,0,2};
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
    }
}
