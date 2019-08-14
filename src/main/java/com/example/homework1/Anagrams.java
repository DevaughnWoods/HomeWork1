package com.example.homework1;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String word1="listen";
        String word2="silent" ;

        checkAnagrams(word1, word2);


    }
    public static boolean checkAnagrams(String word1, String word2){
        boolean isAnagram = false;
        if(word1.length() != word2.length())
            return isAnagram;

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        isAnagram = Arrays.equals(arr1,arr2);

        System.out.println("" + isAnagram);

        return Arrays.equals(arr1,arr2);


    }
}
