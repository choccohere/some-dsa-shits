package DataStructures.Strings;
import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        char[] str = {'1', '2', '3', '4', '5'};
        
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
        for(char c : str){
            System.out.println(c);
        }


        String s = "SatyamPanwar";
        s = s.replace("Sat", "yam");
        System.out.println(s);
        
        String s1 = "SatyamPanwar";
        String ss = s1.substring(2,5);
        System.out.println(ss);


        in.close();
    }

    
}
