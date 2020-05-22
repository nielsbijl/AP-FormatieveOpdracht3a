package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class EasySort {
    public static ArrayList<Character> sortArrayChars(ArrayList<Character> chars){
        ArrayList<Character> sortedChars = new ArrayList<>();
        int lengthList = chars.size();
        for (int i = 0; i < lengthList; i++) {
            Character smallestChar = chars.get(0);
            for (Character character: chars){
                if (character < smallestChar){
                    smallestChar = character;
                }
            }
            sortedChars.add(smallestChar);
            chars.remove(smallestChar);
        }
        return sortedChars;
    }
    public static String checkFirstAlphabeticallyWord(String smallestString, String string){
        //input = 2 strings
        //output = The first Alphabetically string
        if (string != smallestString){
            String smallestWord;
            if (string.length() > smallestString.length()){
                smallestWord = smallestString;
            }
            else {
                smallestWord = string;
            }
            for (int charIndex = 0; charIndex < smallestWord.length(); charIndex++){
                Character stringChar = string.charAt(charIndex);
                Character smallestStringChar = smallestString.charAt(charIndex);
                if (smallestStringChar > stringChar){
                    smallestString = string;
                    break;
                }
                else if (stringChar == smallestStringChar){
                    if (charIndex == (smallestWord.length() -1)){
                        smallestString = smallestWord;
                        break;
                    }
                }
            }
        }
        return smallestString;
    }
    public static ArrayList<String> sortArrayStrings(List<String> strings){
        ArrayList<String> sortedStrings = new ArrayList<>();
        int lengthStrings = strings.size();
        for (int i = 0; i < lengthStrings; i++){
            String smallestString = strings.get(0);
            for (String string : strings) {
                smallestString = checkFirstAlphabeticallyWord(smallestString, string);
            }
            strings.remove(smallestString);
            sortedStrings.add(smallestString);
        }
        return sortedStrings;
    }
    public static PriorityQueue<String> sortPriorityQueue(PriorityQueue<String> queue){
        PriorityQueue<String> sortedPriorityQueue = new PriorityQueue<>();
        Iterator itr = queue.iterator();
        while (itr.hasNext()){
            sortedPriorityQueue.add((String) itr.next());
        }
        return sortedPriorityQueue;
        }
}
