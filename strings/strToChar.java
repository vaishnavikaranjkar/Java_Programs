//string to char array conversion
public class strToChar {
    public static void main(String[] args) {
        String str1="Hello World";
        char c[]=str1.toCharArray();
        for (char i : c) {
            System.out.println("Char array: "+i);
        }
        
    }
}
