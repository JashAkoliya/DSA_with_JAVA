package PracticeStart.String;
// find the shortest path to reach destination
public class Direction {
    public static void main(String[] args) {
        String s = "wneenesennne";
        System.out.println(find(s));
    }
    public static float find(String s1){
        int x=0,y=0;
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(c=='s'){
                y--;
            }
            else if(c=='n'){
                y++;
            }
            else if(c=='e'){
                x++;
            }
            else {
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);
    }
}

//