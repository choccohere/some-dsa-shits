package Problems.ReplaceAllOccurance;

public class ReplaceAllOccurance3 {

    static String removeOccurrences(String s, String part) {
        StringBuilder result = new StringBuilder(s);

        int idx = result.indexOf(part);

        while(idx != -1){
            result.delete(idx, idx + part.length());
            idx = result.indexOf(part);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(s);

        s = removeOccurrences(s, part);

        System.out.println(s);
    }
    
}
