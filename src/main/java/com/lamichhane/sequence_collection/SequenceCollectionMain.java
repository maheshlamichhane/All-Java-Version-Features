package com.lamichhane.sequence_collection;

import java.util.*;

public class SequenceCollectionMain {


    static void main() {
        System.out.println("SequencedCollection");
        seqColl();

        System.out.println("SequenceSet");
        seqSet();

        System.out.println("SequenceMap");
        seqMap();
    }


    static void seqColl() {
        SequencedCollection<String> seqColl = new ArrayList<>();
        seqColl.addFirst("A");
        seqColl.addFirst("B");
        seqColl.addLast("C");
        seqColl.addLast("D");
        seqColl.addLast("D");
        System.out.println(seqColl);
        System.out.println("getFirst(): " + seqColl.getFirst());
        System.out.println("getLast(): " + seqColl.getLast());
        System.out.println("removeFirst() " + seqColl.removeFirst());
        System.out.println("removeLast(): " + seqColl.removeLast());
        System.out.println(seqColl);  // A,C ,D

        // front to last
        System.out.println("Forwards");  // A,C,D
        for (String s : seqColl) {
            System.out.println(s);
        }

        // reverse order
        System.out.println("Backwards..."); // D,C,A
        for (String s : seqColl.reversed()) {
            System.out.println(s);
        }
    }

    static void seqSet(){
        SequencedSet<String> seqSet = new LinkedHashSet<>();
        seqSet.addFirst("A");
        seqSet.addFirst("B");
        seqSet.addLast("C");
        seqSet.addLast("D");
        seqSet.addLast("D");
        System.out.println(seqSet);
        System.out.println("getFirst(): " + seqSet.getFirst());
        System.out.println("getLast(): " + seqSet.getLast());
        System.out.println("removeFirst() " + seqSet.removeFirst());
        System.out.println("removeLast(): " + seqSet.removeLast());
        System.out.println(seqSet);  // A,C ,D

        // front to last
        System.out.println("Forwards");  // A,C,D
        for (String s : seqSet) {
            System.out.println(s);
        }

        // reverse order
        System.out.println("Backwards..."); // D,C,A
        for (String s : seqSet.reversed()) {
            System.out.println(s);
        }
    }


    static void seqMap(){
        SequencedMap<Integer,String> seqMap = new LinkedHashMap<>();
        seqMap.putFirst(1,"Adam");
        seqMap.putFirst(2,"Brian");
        seqMap.putLast(3,"Charlie");
        seqMap.putLast(4,"David");
        System.out.println(seqMap);
        System.out.println("getFirst(): " + seqMap.firstEntry());
        System.out.println("getLast(): " + seqMap.lastEntry());
        System.out.println("removeFirst() " + seqMap.pollFirstEntry());
        System.out.println("removeLast(): " + seqMap.pollLastEntry());
        System.out.println(seqMap);  // A,C ,D

        // front to last
        System.out.println("Forwards");  // A,C,D
        for (Map.Entry<Integer,String> entry: seqMap.entrySet()) {
            System.out.println(entry.getKey()+"; "+entry.getValue());
        }

        // reverse order
        System.out.println("Backwards..."); // D,C,A
        for (Map.Entry<Integer,String> entry: seqMap.reversed().entrySet()) {
            System.out.println(entry.getKey()+"; "+entry.getValue());
        }
    }


    }
