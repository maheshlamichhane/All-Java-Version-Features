package com.lamichhane.sealed_classes;

sealed interface Drivable permits Demo{

}

public sealed class Vehicle permits Car {

}

sealed class Car extends Vehicle permits Ford,Volvo{

}



