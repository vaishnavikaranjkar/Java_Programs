public class upperTri {
    public static void main(String[] args) {
        int n=4,m=4;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i<=j)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
