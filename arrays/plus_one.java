//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].
public class plus_one {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
    public static void main(String[] args) {
        plus_one p=new plus_one();
        int a[]={5,4,8,9};
        int res[]=p.plusOne(a);
        for (int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }
}
