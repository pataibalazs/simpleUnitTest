package com.company.main;


//teszt hogy megy-e a frissités
public class Circle {

    public int[] lista;

    public Circle(int lengthOfTheArray) {
        this.lista = new int[lengthOfTheArray];
        this.lista[0]=10;

    }

    public static double calculateArea(double radius) {
        if(radius<0)
            return -1;
        return Math.PI * radius * radius;
    }

    public static double twiceTheSize(double radius){
        return radius*2;
    }


}
