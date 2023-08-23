package stack;
import java.util.*;

public class valid_parentheses {
    static boolean parentheses(String s)
    {
        boolean flag=true;
        Stack<Character> stack = new Stack<>();
        List<Character> openBrackets=new ArrayList<>();
        openBrackets.add('(');
        openBrackets.add('{');
        openBrackets.add('[');
        List<Character> closedBrackets=new ArrayList<>();
        closedBrackets.add(')');
        closedBrackets.add('}');
        closedBrackets.add(']');
        // ((([])))
        
        for(int i=0;i<s.length();i++)
        {
            if(closedBrackets.contains(s.charAt(i)))
            {
                if(stack.size()==0)
                {
                    flag=false;
                    break;
                }
                else
                {
                    Character temp=openBrackets.get(closedBrackets.indexOf(s.charAt(i)));
                    if(stack.lastElement()==temp)
                    {
                        stack.pop();
                        flag=true;
                        continue;
                    }
                    else
                    {
                        flag=false;
                        break;
                    }
                }
            }
            else if(openBrackets.contains(s.charAt(i)))
            {   
                stack.add(s.charAt(i));
            }
        }
        if(stack.size()>0)
        {
            flag=false;
        }
        return flag;
    }
    public static void main(String[] args) {
        String str="((([))))";
        boolean res=parentheses(str);
        System.out.println(res);
    }
}
