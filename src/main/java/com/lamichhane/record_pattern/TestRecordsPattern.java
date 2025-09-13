package com.lamichhane.record_pattern;

public class TestRecordsPattern {

    public static void recordPattern(){
        Person p1 = new Person("Joe Bloggs",22);
        Person p2 = new Person("Mary Bloggs",23);
        nonNesting(p1);
        nonNesting(p2);

        Player player1 = new Player(p1,Ability.WEAK);
        Player player2 = new Player(p2,Ability.STRONG);
        Doubles dbles = new Doubles(player1,player2);
        nesting(dbles);

    }

    public static void nonNesting(Object obj){
        if(obj instanceof Person(String s,Integer nAge)){
            System.out.println(s+"; "+nAge);
        }
    }

    public static void nesting(Doubles dbles){
        if(dbles instanceof  Doubles(Player pl1,Player pl2)){
            System.out.println(pl1.person()+"; "+pl1.ability());
        }
        // more complex nesting
        if(dbles instanceof Doubles(Player(Person p1,Ability ability),Player pl2)){
            System.out.println(p1.name()+"; "+p1.age()+"; "+ability.name());
        }
    }

    static void main() {
        recordPattern();
    }
}
