/**
 * ReverseChArray
 */
public class ReverseChArray {

    public void reverseString(char[] s) {

        if (s == null || s.length == 0) {
            return;
        }

        for (int i = 0; i < (s.length) / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

}