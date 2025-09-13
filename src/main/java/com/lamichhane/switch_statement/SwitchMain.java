package com.lamichhane.switch_statement;

public class SwitchMain {

    enum Direction {NORTH,SOUTH,EAST,WEST};



    public static void main(String[] args) {
        Direction d = Direction.NORTH;
        int numLetters = 0;
        switch (d){
            case NORTH:
            case SOUTH:
                    numLetters = 5;
                    break;
            case EAST:
            case WEST:
                numLetters = 4;
                break;
        }
        System.out.println(numLetters);



        System.out.println(
                switch (d){
                    case NORTH,SOUTH -> 5;
                    default -> 4;
                }
        );
    }
}
