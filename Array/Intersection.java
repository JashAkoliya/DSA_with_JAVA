package PracticeStart.Array;

import java.util.Arrays;

public class Intersection {

    public static void intersect(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        merge(a,b);
    }

    public static void merge(int a[],int b[]){
        int i=0,j=0;

        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {2,6,8 ,5, 4, 3};
        int b[] = {2,3,4,7};
        intersect(a,b);
    }
}
