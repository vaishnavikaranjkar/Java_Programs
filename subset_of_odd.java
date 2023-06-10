//create a subset array of all odd numbers in an array
public class subset_of_odd {
    public static void main(String[] args) {


        int arr1[]={12,445,4,54,23,6,9,5,7,41,2};

        int count_odd=0;

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]%2!=0)
            {
                count_odd++;
            }
        }
        
        int arr2[]=new int[count_odd];
        int itr=0;

        for (int j = 0; j < arr1.length; j++) {
            if(arr1[j]%2!=0)
            {
                arr2[itr]=arr1[j];
                itr++;
            }
        }
        for (int k = 0; k < arr2.length; k++) {
            System.out.println(arr2[k]);
        }

    }
}
