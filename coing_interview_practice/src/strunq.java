// check whether string is unique or not.

import java.util.*;
public class strunq {

    // simple cmp
    // boolean unqchar(String str){
    //     for(int i=0; i <str.length();i++){
    //         for(int j=i+1;j<str.length();j++){
    //             if (str.charAt(i) == str.charAt(j)) {
    //                 return false;
                    
    //             }
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     strunq obj = new strunq();
    //     String input = "GeeksforGeeks";
    //     if (obj.unqchar(input)) {
    //         System.out.println("The String " + input + " has all unique characters");

        
    //     }
    //     else
    //     System.out.println("The String " + input + " has duplicate characters");
    // }

    // Using Arrays.sort() method
    boolean unqchar(String str){
        char[] chrarr = str.toCharArray();

        Arrays.sort(chrarr);
        for (int i =0 ;i <chrarr.length-1;i++) {
            if(chrarr[i] != chrarr[i+1]){

                continue;
            }
            else
            return false; 
            
        }
        return true;
    }
    public static void main(String[] args) {
        strunq obj = new strunq();
        String input = "Ganesh";
        if (obj.unqchar(input)) {
            System.out.println("The String " + input + " has all unique characters");

        
        }
        else
        System.out.println("The String " + input + " has duplicate characters");
    }
}
