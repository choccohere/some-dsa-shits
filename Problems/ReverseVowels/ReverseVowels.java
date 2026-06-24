package Problems.ReverseVowels;

public class ReverseVowels {
    static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char [] c = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;

        while( l < r ){

            while(l < r && vowels.indexOf(c[l]) == -1){
                l++;
            }
            while(l < r && vowels.indexOf(c[r]) == -1){
                r--;
            }
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;

            l++; r--;
        }
        return new String(c);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        String rev = reverseVowels(s);
        System.out.println(rev);

    }

}
