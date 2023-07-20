package PracticeStart.String;

import java.util.Arrays;

public class HighestOccuringCharacter {
    public static void main(String[] args) {
        String  s = "aabbbbac";

        int a[] = new int[255];
        int i=0;

        while(i<s.length()){
            char c = s.charAt(i);
            a[c]++;
            i++;
        }
        int max=0;
        for(int j=1;j<a.length;j++){
            if(a[max]<a[j]){
                max=j;
            }
        }
        char c = (char) max;
        System.out.println(c);
    }
}
