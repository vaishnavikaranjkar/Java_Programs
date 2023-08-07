public class leap {
    public static void main(String[] args) {
        int yr=1700;
        if((yr%400==0) || (yr%4==0) && (yr%100!=0))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
