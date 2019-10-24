package com.zipcodewilmington.danny_do_better_exercises;
import java.lang.String;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld()
    {
        return ("Hello World");
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment)
    {
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment)
    {

        return (firstSegment + secondSegment);
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input)
    {
        return input.substring(0, 3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input)
    {
        int length = input.length();
        return input.substring(length - 3);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue)
    {
        Boolean expected = inputValue.equals((comparableValue));
        return expected;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue)
    {
        int midLength = inputValue.length() / 2;
        return inputValue.charAt(midLength);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString)
    {
        String[] splitString = spaceDelimitedString.split(" ");
        return splitString[0].toString();
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString)
    {
        String[] splitString = spaceDelimitedString.split(" ");
        return splitString[1].toString();

    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse)
    {
        //String[] result = new String

        StringBuilder reversed = new StringBuilder();
        String[] chars = stringToReverse.split("");
        for (int i = chars.length-1; i >=0; i--)
        {
            reversed.append(stringToReverse.charAt(i));
        }
        return reversed.toString();
    }
}
