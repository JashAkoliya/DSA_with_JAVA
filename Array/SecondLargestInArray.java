package PracticeStart.Array;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int a[] = {5,5,5,5};
        int n = second(a);
        System.out.println(n);
    }
    public static int second(int a[]){
        if(a.length==0){
            return Integer.MIN_VALUE;
        }
        int l,s;
        l=s=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            l=Math.max(l,a[i]);
        }

        for(int i=0;i<a.length;i++){
            if(a[i]!=l){
                s=Math.max(s,a[i]);
            }
        }
        return s;
    }
}
