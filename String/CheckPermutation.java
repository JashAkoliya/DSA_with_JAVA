package PracticeStart.String;

import java.util.Arrays;
import java.util.Locale;

public class CheckPermutation {
    public static void main(String[] args) {
        String s = "abc";
        String s1 = "bnca";
        boolean ans = check(s,s1);
        System.out.println(ans);
    }
    public static boolean check(String s,String s1){
        s = s.toLowerCase();
        s1 = s1.toLowerCase();

        if(s.length()==s1.length()){
            char c[] = s.toCharArray();
            char c1[] = s1.toCharArray();

            Arrays.sort(c);
            Arrays.sort(c1);

            if(Arrays.equals(c,c1)){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
