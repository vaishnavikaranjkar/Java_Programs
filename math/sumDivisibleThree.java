//first step, get first n even positive integers
//second step, add the numbers from the selected even numbers which are divisible by three and return the sum.
import java.util.Scanner;
public class sumDivisibleThree{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0; 
    for(int i=0;i<n*2;i++)
    {
    if(i%2==0 && i%3==0)
    {
        sum=sum+i;
    }
    }
    System.out.print(sum);
    sc.close();
    }
}
//0 2 4 6 8 10 12 14 16 18 