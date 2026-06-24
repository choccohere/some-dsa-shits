package Problems.ReplaceAllOccurance;

public class ReplaceAllOccurace2 {

    static String removeOccurrences(String s, String part) {
        while (true) {
            int idx = s.indexOf(part);

            if (idx == -1)
                break;

            s = s.substring(0, idx) + s.substring(idx + part.length());
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
