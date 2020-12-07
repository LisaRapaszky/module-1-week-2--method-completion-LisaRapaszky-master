package org.wcci;

import javax.imageio.stream.ImageInputStream;

public class StringProblems {
    /*
     * smallestStringSorter()
     *
     * Given two strings, stringA and stringB, return the smallest string, however, if one of the strings has a length
     * of 0, return the other string.  If both strings are the same length, return a new string mashing stringA and
     * stringB together.
     *
     * Examples:
     * - smallestStringSorter("two", "fifteen") -> "two"
     * - smallestStringSorter("", "tomorrow") -> "tomorrow"
     * - smallestStringSorter("zizzer", "zazzer") -> "zizzerzazzer"
     */
    public String smallestStringSorter(String stringA, String stringB) {

        if (stringA.equals("")) {
            return (stringB);
        } else if (stringB.equals("")) {
            return (stringA);
        } else if (stringA.length() > stringB.length()) {
            return (stringB);
        } else if (stringA.length() < stringB.length()) {
            return (stringA);
        } else if (stringA.length() == stringB.length()) {
            return (stringA + stringB);
        }
        return "";
    }

    /*
     * evenUpperCaseOrOddLowerCase()
     *
     * Given a string, str, transform the string's characters to upper case characters if the length is even or lower
     * case if the length is odd.
     *
     * Examples:
     * - evenUpperCaseOrOddLowerCase("Hello") -> "hello"
     * - evenUpperCaseOrOddLowerCase("Zizzer Zazzer Zuzz") -> "ZIZZER ZAZZER ZUZZ"
     */
    public String evenUpperCaseOrOddLowerCase(String str) {
        //int strLength = str.length();

        if (str.length() % 2 == 0) {
            System.out.println(str.toUpperCase());

        } else {
            System.out.println(str.toLowerCase());
        }
        return "";
    }
    // (str.length() % 2 !=0)


//(str.length % 2 != 0) {

    /*
     * stringCombiner()
     *
     * Given two strings, stringA and stringB, return a new string that combines the two strings, but the strings should
     * be combined in ascending alphabetically order.
     *
     * Examples:
     * - stringCombiner("Hello", "There") -> "HelloThere"
     * - stringCombiner("Zizzer" "zazzer") -> "zazzerZizzer"
     */

    public String stringCombiner(String stringA, String stringB) {
        String stringA = a;
        String stringB = b;
        int compare = a.compareToIgnoreCase(b);
        if (compare < 0) {
            System.out.println();
        } else if (compare > 0) {
            System.out.println();
        } else {
        } return "";
    }


//    // * Given a string, str, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length
//     * will be at least 2.
//     *
//     * Examples:
//     * - left2("Hello") → "lloHe"
//     * - left2("java") → "vaja"
//     * - left2("Hi") → "Hi"
//     //


    public String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }
}


