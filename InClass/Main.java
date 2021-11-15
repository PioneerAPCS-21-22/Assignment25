
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("String then character: ");
        String s = in.next();
        String c = in.next();
        System.out.println(numOc(s, c));
        
    }
    
    public static int numOc(String str, String let)
    {
        int n = 0;
        
        for(int i = 0; i < str.length(); i++)
        {
            if(str.substring(i, i+1).equals(let))
            {
                n++;
            }
        }
        
        return n;
    }
    
    public static int lastIndex(String str, String let)
    {
        for(int i = str.length() - 1; i >= 0; i--)
        {
            if(str.substring(i, i+1).equals(let))
            {
                return i;
            }
        }
        
        return -1;
    }
    
    // true if all periods are followed by a space (period at end is fine)
    // false otherwise
    public static boolean findSpaces(String str)
    {
        for(int i = 0; i < str.length() - 1; i++)
        {
            // check if index i is a period, if so, check for space after
            if(str.substring(i, i+1).equals(".") && !str.substring(i+1, i+2).equals(" "))
            {
                return false;
            }
        }
        
        return true;
    }
}










