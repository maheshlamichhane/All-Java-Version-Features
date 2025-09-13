package com.lamichhane.record_pattern;

public class TestRecords {

    public static void records(){
        Person p1 = new Person("Jowe Bloggs",22);
        System.out.println(p1);
        System.out.println(p1.name()+"; "+p1.age());

        patternMatching(p1);
        patternMatching("abc");

        Pair<String> pairS = new Pair<>("Sean","Kennedy");
        Pair<Integer> pairI = new Pair<>(10,20);
        patternMatching(pairS);
        patternMatching(pairI);

    }

    public static void patternMatching(Object obj){
        if(obj instanceof Person person){
            System.out.println("PM:"+person.name()+"; "+person.age());
        }
        else if(obj instanceof Pair pair){
            System.out.println("PM:"+pair.x()+"; "+pair.y());
        }
    }

    static void main() {
        records();
    }
}
