package Problems.ReplaceAllOccurance;

public class ReplaceAllOccurance1 {
    static String removeOccurrences(String s, String part) {
        while(s.contains(part) ){
            s = s.replaceFirst(part,"");

        }
        return s;
    }
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(s);

        s = removeOccurrences(s, part);

        System.out.println(s);
    }
}

