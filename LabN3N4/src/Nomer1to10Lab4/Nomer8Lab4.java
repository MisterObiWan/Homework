package Nomer1to10Lab4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Nomer8Lab4
{
    public void cezar()
    {
        String n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст: ");
        n = in.next();
        char a[] = new char[n.length()];
        for (int i=0;i<n.length();i++)
        {
            a[i] = n.charAt(i);
            System.out.print(" " + (int)a[i] + " ");
        }
        int b=0;
        while (b == 0|b==2)
        {
        System.out.println("Желаете раскодировать? 1.ДА 2.НЕТ");
        try {
            b=0;
            int m = in.nextInt();
            if (m==1) { System.out.println(Arrays.toString(a)); b++;}
            if (m==2){ System.out.println("Удачного дня"); b++;}
        }catch (InputMismatchException e){ System.err.println("Не используй буквы!!!");break; }
        }
    }
}
