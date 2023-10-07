//variable number of arguments
public class varargs {
    static int sum(int ... array)
    //here passed arguments are packed as an array -> triple dot is used
    {
        int res=0; 
        for (int i : array) {
            res=res+i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,5,3,4,5));
    }
}
