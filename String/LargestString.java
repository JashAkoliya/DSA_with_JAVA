package PracticeStart.String;

public class LargestString {
    public static void main(String[] args) {
        String s[] = {"apple","mango","banana"};

        String l = s[0];
        for(int i=1;i<s.length;i++){
            if(s[i].compareTo(l)>0){
                l = s[i];
            }
        }
        System.out.println(l);
    }
}

//time complexity:- O(x*n);
//x for string largest length