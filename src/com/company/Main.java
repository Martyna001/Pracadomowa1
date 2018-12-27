package com.company;

public class Main {

    public static void main(String[] args) {
        Position p1 = new Position("Chleb", 1, 3.5);
        System.out.println(p1);
        Position p2 = new Position("Cukier", 3, 4);
        System.out.print(p2);
        Orders z = new Orders();
        z.addPosition(p1);
        z.addPosition(p2);
        System.out.println(z);
    }
}
