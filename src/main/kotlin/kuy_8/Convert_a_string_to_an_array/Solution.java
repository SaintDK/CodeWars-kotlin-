package kuy_8.Convert_a_string_to_an_array;

import java.util.Arrays;
import java.util.regex.Pattern;
public class Solution {

    /**
     * This class shows how to convert String to String Array in Java
     * @param args
     */
    public static void main(String[] args) {
        String line = "My name is Pankaj";
        //using String split function
        String[] words = line.split(" ");
        System.out.println(Arrays.toString(words));
        //using java.util.regex Pattern
        Pattern pattern = Pattern.compile(" ");
        words = pattern.split(line);
        System.out.println(Arrays.toString(words));
    }

    public static Object[] stringToArray(String robin_singh) {

        String[] answer = robin_singh.split(" ");

        return answer;
    }
}
