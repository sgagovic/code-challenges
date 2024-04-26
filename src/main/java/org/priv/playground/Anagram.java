package org.priv.playground;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram {

    private List<String> places = Arrays.asList("eat", "ate", "apt", "pat", "tea", "now");
    private Map<Integer, List<String>> map = new HashMap<>();


    public Map<String, List<String>> isAnagram(){

        ArrayList<String> sorted = new ArrayList<>();
        for(int i=0; i<places.size(); i++){
            char[] chars = places.get(i).toCharArray();
            Arrays.sort(chars);
            sorted.add(String.valueOf(chars));
        }

        Map<String, List<String>> result = new HashMap<>();
        for(int i=0; i<sorted.size(); i++){
            List<String> anagrams = new ArrayList<>();

            if(!result.containsKey(places.get(i))){
                anagrams.add(places.get(i));
                result.put(places.get(i), anagrams);
            }

            for(int j=1; j<sorted.size(); j++){
                if(sorted.get(i).equals(sorted.get(j))){
                    anagrams.add(places.get(j));
                }
            }

            result.put(places.get(i), anagrams);
        }

        return result;
    }

}
