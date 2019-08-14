package com.example.homework1;

public class Palindrome {
    public static void main(String[] args) {
            String word = "racecar";
            char[] warray = word.toCharArray();
            System.out.println(checkPalindrome(word));
        }

        public static boolean checkPalindrome(String word){
            boolean palindrome = false;
            for(int i = 0; i < word.length()/2; i++)
            if(word.charAt(i)== word.charAt(word.length()-(1+i))) {
                continue;
            }else{
                return false;
            }

            return true;

    }


}
