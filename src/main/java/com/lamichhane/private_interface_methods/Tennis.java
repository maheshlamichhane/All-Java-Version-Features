package com.lamichhane.private_interface_methods;

public interface Tennis {

    private static void hit(String stroke){
        System.out.println("Move into position");
        System.out.println("Hitting a "+stroke);
        System.out.println("Move back into ready position");
    }

    static void forehand() {
        hit("forehand");
    }

    default void backhand(){
        hit("backhand");
    }

    private void smash(){
        hit("smash");
    }
}
