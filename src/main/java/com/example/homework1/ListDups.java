package com.example.homework1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.HashSet;


public class ListDups {
    public static void main(String[] args) {
        ArrayList<String> duplicates = new ArrayList();

        duplicates.add("Jerry");
        duplicates.add("Jerry");
        duplicates.add("Steven");
        duplicates.add("Spyros");
        duplicates.add("Joe");
        duplicates.add("Devaughn");
        duplicates.add("Nick");
        duplicates.add("Deedee");
        duplicates.add("Mario");
        duplicates.add("Spyros");




        findDuplicates(duplicates);
        //System.out.println("Running main function");


    }

    public static ArrayList<String> findDuplicates(ArrayList<String> strings){

        HashSet<String> orig = new HashSet<>();
        HashSet<String> dupe = new HashSet<>();

        HashMap<String, Integer> occurances = new HashMap<>();

       System.out.println("Duplicates running..");

       // ArrayList<String> duplicates = new ArrayList(strings);

        for(int i = 0; i < strings.size(); i++) {

            //System.out.println("Stepped");

            //first we see if we already have the number in the first map
            if(orig.contains(strings.get(i))){
                dupe.add(strings.get(i));
            } else {
                //if it gets to the this clause then we didn't have an
                //instance of the int we were looking at
                orig.add(strings.get(i));
            }




        }

        //System.out.println(dupe.keySet());
        for (String s: dupe){
            System.out.println(s);
        }



        return null;
    }


    }

