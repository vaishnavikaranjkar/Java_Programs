public class upperdiag {
    public static void main(String[] args) {
        int n=4,m=n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("* ");
            }
            m=m-1;
            System.out.println();
        }
    }
}
