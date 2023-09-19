package edu.eci.arep;

/**
 * Hello world!
 *
 */
public class AppService 
{
    public static String getCos(String number){
        String numberX = String.valueOf(Math.cos(Double.parseDouble(number)));
        return numberX;
    }
    public static String getSin(String number){
        String numberX = String.valueOf(Math.sin(Double.parseDouble(number)));
        return numberX;
    }
    public static String isPalindrome(String word){
        word = word.toLowerCase();
        String reversedWord = "" ;
        for(int i = word.length() - 1; i >= 0; --i ){
            reversedWord += word.charAt(i);
        }
        boolean flag = word.equals(reversedWord);
        String ans = flag? "Its Palindrome" : "It is not a Palindrome";

        return ans;
    }

    public static String getMagnitude(String str1, String str2){
        String ans = String.valueOf(Math.sqrt(Math.pow(2, Double.parseDouble(str1)) + Math.pow(2, Double.parseDouble(str2))));
        return ans;
    }

    
}
