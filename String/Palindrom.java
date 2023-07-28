package PracticeStart.String;

public class Palindrom {
    public static void main(String[] args) {
        String s = "ctc";
        String a = checkPalin(s);
        System.out.println(a);
    }
    public static String checkPalin(String s){

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return "not palindrom";
            }
        }
        return "palindrome";
    }
}
