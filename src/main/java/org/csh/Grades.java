package org.csh;
import java.util.*;

public class Grades {
    public static void main(String[] args) {
        System.out.print("\n\n");
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> daClass = new ArrayList<Double>();
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
                daClass.add(input);
                k = (int) put;
                first = false;
            }
        }
        double sum = 0;
        int grades = 0;
        for (int x = 0;x < daClass.size() - 1;x++)
        {
            sum += (daClass.get(x)).doubleValue();
            grades++;
        }
        double output = (sum / grades);
        System.out.print("\nYour grade average is " + (output - (output % .01)));
        scan.close();
        System.out.print("\n\n");
    }

}
