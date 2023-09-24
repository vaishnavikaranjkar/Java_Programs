//to find separate digits in a number
import java.util.*;
public class digits
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        while(num>0)
        {
            System.out.println(num%10);
            num=num/10;
        }
        s.close();
    }
}