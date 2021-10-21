package com.company;

class cords
{
    public static class cord
    {
        int x;
        int y;
    }

    public static boolean Check(cord a1, cord b1, cord a2, cord b2)
    {

        if (a1.x == b1.x || a1.y == b1.y || a2.x == b2.x || a2.y == b2.y)
        {
            return true;
        }

        if (a1.x >= b2.x || a2.x >= b1.x)
        {
            return true;
        }

        if (b1.y >= a2.y || b2.y >= a1.y)
        {
            return true;
        }

        return false;
    }
  
}
