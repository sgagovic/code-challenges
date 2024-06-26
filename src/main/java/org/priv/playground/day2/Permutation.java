package org.priv.playground.day2;


/*
This problem was asked by Twitter.

A permutation can be specified by an array P, where P[i] represents the location of the element at i in the permutation. For example, [2, 1, 0] represents the permutation where elements at the index 0 and 2 are swapped.

Given an array and a permutation, apply the permutation to the array. For example, given the array ["a", "b", "c"] and the permutation [2, 1, 0], return ["c", "b", "a"].
 */

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public List<String> applyPermutation(List<String> input, List<Integer> permutation){
        List<String> result = new ArrayList<>();
        for(int i=0; i<input.size(); i++){
            result.add(input.get(permutation.get(i)));
        }
        return result;
    }

}
