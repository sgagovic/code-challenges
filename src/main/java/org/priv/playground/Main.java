package org.priv.playground;

import org.priv.playground.day1.Anagram;
import org.priv.playground.day2.Permutation;
import org.priv.playground.day3.CompatibleJobs;
import org.priv.playground.day3.Pair;
import org.priv.playground.day4.BinaryTree;
import org.priv.playground.day4.Node;

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
        //day2();
        //day3();
        day4();
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

    public static void day3(){
        Pair job1 = new Pair(0,6);
        Pair job3 = new Pair(1,4);
        Pair job2 = new Pair(3,8);
        Pair job4 = new Pair(3,5);
        Pair job5 = new Pair(4,7);
        Pair job6 = new Pair(5,9);
        Pair job7 = new Pair(6,10);
        Pair job8 = new Pair(8,11);

        List<Pair> jobs= Arrays.asList(job1, job2, job3, job4, job5, job6, job7,job8);

        CompatibleJobs compatibleJobs = new CompatibleJobs();
        compatibleJobs.findLargestSubsetGreedy(jobs);

    }

    public static void day4(){
        // create an object of BinaryTree
        BinaryTree tree = new BinaryTree();

        // create nodes of the tree
        Node node1 = new Node(2);
        Node node2 = new Node(42);
        Node node3 = new Node(2);
    }
}
