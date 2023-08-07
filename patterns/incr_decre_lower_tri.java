/*
1
3*2
4*5*6
10*9*8*7
 */
public class incr_decre_lower_tri {
    public static void main(String[] args) {
        int n=4;
        int temp=0;
        int even_counter=1;
        int odd_counter=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<i*2;j++)
                {
                    if(j%2!=0)
                    {
                        System.out.print("*");
                    }
                    System.out.print(even_counter++);
                }
                odd_counter=even_counter;
            }
            else
            {
                for(int j=0;j<i*2;j--)
                {
                    if(j%2!=0)
                    {
                        System.out.print("*");
                    }
                    System.out.print(odd_counter);
                    even_counter=odd_counter;

                }
            }
            System.out.println();
        }


        // for(int i=0;i<n;i++)
        // {
        //     if(i%2==0)
        //     {
        //         for(int j=0;j<i*temp+1;j++)
        //         {
        //             if(j%2!=0)
        //             {
        //                 System.out.print("*");
        //             }
        //             System.out.print(even_counter++);
        //         }
        //         odd_counter=even_counter;
        //     }
        //     else
        //     {
        //         for(int j=i;j>=0;j--)
        //         {
        //             if(j%2!=0)
        //             {
        //                 System.out.print("*");
        //             }
        //             System.out.print(odd_counter);
        //             even_counter=odd_counter

        //         }
        //     }
        //     System.out.println();
        // }

        
    }
}
