// check whether string is unique or not.

import java.util.*;

public class FindAllCharUnique {

    // simple cmp
    // boolean unqchar(String str){
    // for(int i=0; i <str.length();i++){
    // for(int j=i+1;j<str.length();j++){
    // if (str.charAt(i) == str.charAt(j)) {
    // return false;

    // }
    // }
    // }
    // return true;
    // }
    // public static void main(String[] args) {
    // FindAllCharUnique obj = new FindAllCharUnique();
    // String input = "GeeksforGeeks";
    // if (obj.unqchar(input)) {
    // System.out.println("The String " + input + " has all unique characters");

    // }
    // else
    // System.out.println("The String " + input + " has duplicate characters");
    // }

    // Using Arrays.sort() method
    // boolean unqchar(String str) {
    // char[] chrarr = str.toCharArray();

    // Arrays.sort(chrarr);
    // for (int i = 0; i < chrarr.length - 1; i++) {
    // if (chrarr[i] != chrarr[i + 1]) {

    // continue;
    // } else
    // return false;

    // }
    // return true;
    // }

    public static void main(String[] args) {
        FindAllCharUnique obj = new FindAllCharUnique();
        String input = "strings";
        if (areUniqueChars(input)) {
            System.out.println("The String " + input + " has all unique characters");

        } else
            System.out.println("The String " + input + " has duplicate characters");
    }

    public static boolean areUniqueChars(String str) {
        if (str.length() > 128)
            return false;
        boolean[] booleans = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);
            if (booleans[value]) { // is found? means true then return false
                return false;
            }
            booleans[value] = true;
        }
        return true;
    }

}
