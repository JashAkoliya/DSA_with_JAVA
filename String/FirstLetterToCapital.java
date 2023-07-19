package PracticeStart.String;

public class FirstLetterToCapital {
    public static void main(String[] args) {
        String s = "jash Akoliya Vijaybhai";
        System.out.println(upper(s));
    }

    public static String upper(String s){
        StringBuilder n= new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(i==0) {
                n.append(Character.toUpperCase(s.charAt(0)));
            }
            else  {
                if (s.charAt(i)==' ' && i<s.length()-1) {
                    n.append(' ');
                    i++;
                    n.append(Character.toUpperCase(s.charAt(i)));
                }
                else  {
                    n.append(s.charAt(i));
                }
            }
        }
        return n.toString();
    }
}
