class lowerTri {
    public static void main(String[] args) {
        int n=5;
        int m=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j<=i)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
