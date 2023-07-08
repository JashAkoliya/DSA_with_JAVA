package PracticeStart.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter step:-");
        int x = sc.nextInt();
        System.out.println("Enter direction:-");
        String d = sc.next();
        int a[] = {};

        rotateArray(a,a.length,x,d);
    }
    public static void rotateArray(int a[],int n,int x,String d){
        x=x%n;

        if(x>0 && d.equals("LEFT")){
            rotateLeft(a,n,x);
        }
        else if (x > 0 && d.equals("RIGHT")) {
            rotateRight(a,n,x);
        }

        System.out.println(Arrays.toString(a));
    }

    public static void rotateLeft(int a[],int n,int x){
        rotate(a,0,n);  // reverse all array
        rotate(a,0,n-x);  // reverse 0 to n-x
        rotate(a,n-x,n);  // reverse n-x to n
    }
    public static void rotateRight(int a[],int n,int x){
        rotate(a,0,n);
        rotate(a,0,x);
        rotate(a,x,n);
    }

    public static void rotate(int a[],int l,int r){
        r--;
        int len = (r-l)/2;
        for(int i=0;i<=len;i++){
            swap(a,l,r);
            l++;
            r--;
        }
    }

    public static void swap(int a[],int l,int r){
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }
}
