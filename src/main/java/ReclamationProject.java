/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * Contains a function that tells you the longest shared substring between two strings.
 *
 */

public class ReclamationProject {
    /** Takes in two strings and returns the longest shared element between the two.
     *  @param string1 holds the first string
     *  @param string2 holds the second string
     *
     *  @return returns the longest shared element between the two strings
     *
     * */
    static String doit(final String string1, final String string2) {
        String shorterString; // a
        String longerString; // b
        if (string1.length() > string2.length()) {
            shorterString = string2;
            longerString = string1;
        } else {
            longerString = string2;
            shorterString = string1;
        }
        String r = "";

        for (int i = 0; i < shorterString.length(); i++) {
            for (int j = shorterString.length() - i; j > 0; j--) {
                for (int k = 0; k < longerString.length() - j; k++) {
                    if (shorterString.regionMatches(i, longerString, k, j) && j > r.length()) {
                        r = shorterString.substring(i, i + j);
                    }
                }
            } // Ah yeah
        }
        return r;

    }


}
