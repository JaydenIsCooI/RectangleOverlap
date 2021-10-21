package com.company;

public class Main
{

    public static void main(String[] args)
    {
        cords.cord a1 = new cords.cord();
        cords.cord a2 = new cords.cord();
        cords.cord b1 = new cords.cord();
        cords.cord b2 = new cords.cord();
        a1.x = 10;
        a1.y = 20;
        a2.x = 20;
        a2.y = 30;
        b1.x = 15;
        b1.y = 25;
        b2.x = 40;
        b2.y = 50;

        if (cords.Check(a1, b1, a2, b2))
        {
            System.out.println("------------------------------\n" + "The Rectangles Overlap\n" + "------------------------------");
        } else
        {
            System.out.println("------------------------------\n" + "The Rectangles Don't Overlap\n" + "------------------------------");
        }
    }
}
