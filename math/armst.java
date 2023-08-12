import java.util.Scanner;
public class armst{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        int temp=n;
        int rem=0;
        while(temp!=0)
        {
            rem=temp%10;
            result=result+(rem*rem*rem);
            temp=temp/10;
        }
        if(result==n)
        {
        System.out.print(1);
        }
        else
        {
        System.out.print(0);
        }
        sc.close();
    }
}