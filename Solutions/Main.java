/**
 * A25
 * @author Mr. King
 * @version 11/15/2021
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(gcContent("CCACCCTCGTGGTATGGCTAGGCATTCA"));
        System.out.println(gcContent("TAGCCAGAACCGTTTCTCTGA"));

        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));
        System.out.println(bobThere("b"));
    }

    public static String gcContent(String strand) {
        int n = 0;
        for(int i = 0; i < strand.length(); i++) {
            if(strand.substring(i, i+1).equals("G") || 
                    strand.substring(i, i+1).equals("C")) {

                n++;
            }
        }

        double perc = 100.0 * n / strand.length();

        return perc + "%";
    }

    public static boolean bobThere(String str) {
        for(int i = 0; i < str.length() - 2; i++)
        {
            if(str.substring(i, i+1).equals("b") && 
                    str.substring(i+2, i+3).equals("b")) {
                
                return true;
            }
        }
        return false;
    }
}

