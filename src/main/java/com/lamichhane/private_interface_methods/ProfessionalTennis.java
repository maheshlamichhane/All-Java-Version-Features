package com.lamichhane.private_interface_methods;

public class ProfessionalTennis implements Tennis{

    public static void main(String[] args) {
        Tennis tennis = new ProfessionalTennis();
        tennis.backhand();
        Tennis.forehand();
    }
}
