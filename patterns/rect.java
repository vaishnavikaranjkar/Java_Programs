/* rect with 4 rows and 7 cols
 * *******
 * *     *
 * *     *
 * *******
 */

 /*
 when i==0 or i==max, j==0, j==max
  i  j -> 0 1 2 3 4 5 6
  |
  0       * * * * * * *
  1       *
  2       *
  3       *

  */
public class rect {
    public static void main(String[] args) {
        int n=4;
        int m=7;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if( i==0 || j==0 || i==n-1 || j==m-1 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
