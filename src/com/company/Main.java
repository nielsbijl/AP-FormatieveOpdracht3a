package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("\n-----ArrayList Of Chars-----\n");

        ArrayList<Character> chars = new ArrayList<>();
        chars.add('c');
        chars.add('b');
        chars.add('a');
        System.out.println(chars);
        ArrayList<Character> sortedChars = EasySort.sortArrayChars(chars);
        System.out.println(sortedChars);

        System.out.println("\n-----Check First Alphabetically Word-----\n");


        String smallestWord = EasySort.checkFirstAlphabeticallyWord("abbc", "aaacd");
        System.out.println(smallestWord);

        System.out.println("\n-----ArrayList Strings-----\n");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("aac");
        strings.add("aab");
        strings.add("aa");
        strings.add("aaa");
        System.out.println(strings);
        ArrayList<String> sortedStrings = EasySort.sortArrayStrings(strings);
        System.out.println(sortedStrings);

        System.out.println("\n-----LinkedList Strings-----\n");

        LinkedList<String> linkedListStrings = new LinkedList<String>();
        linkedListStrings.add("aa");
        linkedListStrings.add("abc");
        linkedListStrings.add("abb");
        linkedListStrings.add("aba");
        linkedListStrings.add("aac");
        System.out.println(linkedListStrings);
        System.out.println(EasySort.sortArrayStrings(linkedListStrings));

        System.out.println("\n-----Collection Queue Strings-----\n");
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("abc");
        queue.add("abb");
        queue.add("aba");
        queue.add("aac");
        queue.add("aa");
        System.out.println(queue);
        System.out.println(EasySort.sortPriorityQueue(queue));
    }
}
