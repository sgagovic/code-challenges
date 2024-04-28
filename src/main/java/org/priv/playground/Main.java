package org.priv.playground;

import org.priv.playground.day1.Anagram;
import org.priv.playground.day2.Permutation;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        //day1();
        day2();
    }

    public static void day1(){
        Anagram a = new Anagram();
        a.isAnagram();
    }

    public static void day2(){
        List<String> words = Arrays.asList("London", "Sarajevo", "Berlin", "Oslo", "Chicago", "Koln");
        List<Integer> permutations = Arrays.asList(3,1,5,0,2,4);
        Permutation permutation = new Permutation();
        permutation.applyPermutation(words,permutations);

    }
}
