public class fibbonacci {
    public static void main(String[] args) {
        int n1=0, n2=1;
        int count=10;
        int sum=0;
        System.out.println(n1+" "+n2);
        for(int i=0;i<count-2;i++)
        {
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
    }
}
