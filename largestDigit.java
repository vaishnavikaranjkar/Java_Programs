import java.util.Scanner;

public class largestDigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        int max=0;
        while(num>0)
        {
            if(max<(num%10))
            {
                max=num%10;
            }
            num=num/10;
        }
        System.out.println("The largest digit is: "+max);
        s.close();
    }
}
