package Nomer1to10Lab4;

import java.util.Scanner;

public class Nomer2Lab4
{
    public  void triangle()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int size1 = in.nextInt();
        System.out.println("Введите кол-во колонок: ");
        int size2 = in.nextInt();
        int a,b,c = 0,d = size2,i;

        for (a = 1; a < size1; a++)
        {--d;System.out.println();for (i = 0;i <= size1; i++){System.out.print(" ");}for (b = 1; b <= size2; b++)
        {if (b==size2)System.out.print("|"); if (b==d) System.out.print("/");else System.out.print(" ");}++c;System.out.print(c);}

        if (c==size1-1){ System.out.println();for (i = 0;i <= size1; i++){System.out.print(" ");}for (b = 1; b <= size2; b++)
        {if (b==size2)System.out.print("|");if (b==d-1)System.out.print("/");else System.out.print("_");}++c;System.out.print(c);System.out.println();}
        System.out.println("Кол-во колонок: " + d + " Кол-во строк: " + c);
    }
}
