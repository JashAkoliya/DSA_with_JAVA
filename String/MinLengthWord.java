package PracticeStart.String;

import java.util.ArrayList;

public class MinLengthWord {
    public static void main(String[] args) {
        String s = " ";
        String ans = minLengthWord(s);
        System.out.println(ans);
    }
    public static String minLengthWord(String input){
        String s1[] = input.split(" ");
        if(input.length()==0){
            return "";
        }

        int min=s1[0].length();
        String ans="";
        for(int i=0;i<s1.length;i++){
            int c=0;
            for(int j=0;j<s1[i].length();j++){
                c++;
            }
            if(min>=c ){
                min=c;
                ans=s1[i];
                if(min==1){
                    return ans;
                }
            }
        }
        return ans;
    }
}
