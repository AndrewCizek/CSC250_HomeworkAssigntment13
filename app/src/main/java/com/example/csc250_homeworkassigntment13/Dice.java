package com.example.csc250_homeworkassigntment13;

import java.util.Random;

public class Dice
{
    private int numberOfSides;

    public Dice(int numberOfSides)
    {
        this.numberOfSides = numberOfSides;
    }

    public int[] roll(int numOfRolls)
    {
        Random r = new Random();
        int[] rollTotal = new int[numOfRolls];
        for(int i = 0; i< rollTotal.length; i++)
        {
            if (numberOfSides == 10)
            {
                rollTotal[i] = (r.nextInt(numberOfSides));
            }
            else
            {
                rollTotal[i] = (r.nextInt(numberOfSides) + 1);
            }

        }
        return rollTotal;
    }

    public int rollTotal(int[] rolled)
    {
        int rollTotal = 0;
        for(int i = 0; i < rolled.length; i++)
        {
            rollTotal += rolled[i];
        }
        return rollTotal;
    }


}
