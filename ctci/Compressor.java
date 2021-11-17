import java.util.*;

public class Compressor {
    public static StringBuilder appendCharCount(StringBuilder sb, char c, int count) {
        sb.append(c);
        sb.append(count);
        return sb;
    }

    public static String compress(String str) {
        // Grab the string's length first.
        int inLength = str.length();
        // Now we'll go through the compression process
        StringBuilder cstr = new StringBuilder();
        char prev = ' ';
        int charRepetitions = 1;
        boolean first = true;
        for (int i = 0; i < inLength; i++) {
            char curr = str.charAt(i);

            // if the character is new, append the length
            // of the previous sequence to the string.
            if (prev != curr) {
                if (charRepetitions == 0) {
                    prev = curr;
                    continue;
                }

                if (prev == ' ') {
                    prev = curr;
                    continue;
                }

                cstr = appendCharCount(cstr, prev, charRepetitions);
                charRepetitions = 1;
                prev = curr;
                continue;
            }

            charRepetitions += 1;
            prev = curr;
        }

        // Flush out the remainder
        cstr = appendCharCount(cstr, prev, charRepetitions);

        // Finally, make sure we're still smaller.
        if (cstr.toString().length() <= inLength)
            return cstr.toString();

        return str;
    }
    public static void main(String[] args) {
        System.out.println(compress("aaabbc")); // == "a3b2c1");
        System.out.println(compress("abc")); // == "abc");
        System.out.println(compress("jjjjkkkkklllll")); // == "j4k5l5");
    }
}