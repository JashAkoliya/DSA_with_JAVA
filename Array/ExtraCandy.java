package PracticeStart.Array;

import java.util.Arrays;

public class ExtraCandy {
    public static void main(String[] args) {
        int a[] = {6,1,1,8,10,7};
        int b[] = {4,8,10,10,10,7};
        int range=a.length;
        int limit=12;
        passCandy(a,b,range,limit);
    }

    public static void passCandy(int a[],int b[],int range,int limit){
        int c[] = new int[range];
        int carry=0;

        for(int i=0;i<range;i++){
            int total = a[i]+b[i]+carry;

            if(total<=limit){
                c[i]=total;
                carry=0;
            }
            else {
                carry=total-limit;
                c[i]=limit;
            }
        }

        System.out.println(Arrays.toString(c));
    }
}
