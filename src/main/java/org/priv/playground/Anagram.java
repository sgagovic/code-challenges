package org.priv.playground;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram {

    private List<String> places = Arrays.asList("eat", "ate", "apt", "pat", "tea", "now");
    Map<String, List<String>> result = new HashMap<>();


    public Map<String, List<String>> isAnagram(){
       List<String> sorted = sort(places);

        for(int i=0; i<sorted.size(); i++){
            List<String> anagrams = new ArrayList<>();
            if(result.containsKey(sorted.get(i))){
                continue;
            } else{
                result.put(sorted.get(i), anagrams);
                for(int j=0; j<sorted.size(); j++){
                    if(sorted.get(i).equals(sorted.get(j))){
                        anagrams.add(places.get(j));
                    }
                }
            }
            result.put(sorted.get(i), anagrams);
        }

        return result;
    }

    private List<String> sort(List<String> elements){
        ArrayList<String> sorted = new ArrayList<>();
        for(int i=0; i<elements.size(); i++){
            char[] chars = elements.get(i).toCharArray();
            Arrays.sort(chars);
            sorted.add(String.valueOf(chars));
        }

        return sorted;
    }

}
