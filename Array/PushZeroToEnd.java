package PracticeStart.Array;

import java.util.Arrays;

public class PushZeroToEnd {
    public static void main(String[] args) {
        int a[] = {1,0,0,2,6,0,0};
        push(a);
    }
    public static void push(int a[]){
        int n=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[n];
                a[n]=temp;
                n++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
