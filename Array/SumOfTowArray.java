package PracticeStart.Array;

import java.util.Arrays;

public class SumOfTowArray {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {4,5,6};
        int output[] = new int[1+Math.max(a.length,b.length)];

        sumOfTwoArrays(a,b,output);
        System.out.println(Arrays.toString(output));
    }
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=Math.max(arr1.length,arr2.length);
        int carry=0;

        while(i>=0 && j>=0){
            int sum = arr1[i]+arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;

            i--;
            j--;
            k--;
        }

        while(i>=0){
            int sum=arr1[i]+carry;
            output[k]=sum%10;
            carry=sum/10;

            i--;
            k--;
        }

        while(j>=0){
            int sum=arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;

            i--;
            k--;
        }
        output[0]=carry;
    }
}
