package com.codegym;

public class TestStaticProperty {

    public static void main(String[] args) {
	Car car1 = new Car("Madza","I4");
    System.out.println(Car.numberOfCars);
    Car car2 = new Car("Madza3","V6");
    System.out.println(Car.numberOfCars);
    }
}
