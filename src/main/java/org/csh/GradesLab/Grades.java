package org.csh;

import java.util.ArrayList;
import java.util.Scanner;

public class Grades
{
    private ArrayList<Double> grades;

    public Grades()
    {
        grades = new ArrayList<Double>();
    }

    public void createList()
    {
        Scanner scan = new Scanner(System.in);
        double put = 0;
        int k = 0;
        boolean first = true;
        System.out.print("Enter your grades. When finished type 10k or a negative number:    ");
        while (k < 10000 && k >= 0)
        {
            if (!first)
                System.out.print("next:    ");
            if (k < 10000 && k >= 0)
            {
                put = scan.nextDouble();
                Double input = Double.valueOf(put);
                grades.add(input);
                k = (int) put;
                first = false;
            }
        }
        scan.close();
    }

    public double getAverage()
    {
        double sum = 0;
        int grade = 0;
        for (int x = 0;x < grades.size() - 1;x++)
        {
            sum += (grades.get(x)).doubleValue();
            grade++;
        }
        double output = (sum / grade);
        return (output - (output % .01));
    }


    public String toString()
    {
        return "\nYour grade average is " + getAverage();
    }

}
