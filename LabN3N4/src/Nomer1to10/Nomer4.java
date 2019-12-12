package Nomer1to10;

import java.util.Scanner;

public class Nomer4
{
    public void TwoNum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        int i;
        if (b<a)
        {
            int n = b;
            System.out.println("С использованием for: ");
            for (i = 0; i <= a-b; i++)
            {
                int [] c = new int[a-b+1];
                c[i] = n; n++;
                System.out.print(c[i] + " ");
            }
            System.out.println();
            System.out.println("С использованием while: ");
            i = 0; n = b;
            while (i <= a-b)
            {
                int [] c = new int[a-b+2];
                i++;
                c[i] = n; n++;
                System.out.print(c[i] + " ");
            }
            System.out.println();
            System.out.println("С использованием do-while: ");
            i = 0; n = b;
            do
                {
                    int [] c = new int[a-b+2];
                    i++;
                    c[i] = n; n++;
                    System.out.print(c[i] + " ");
                }
            while (i <= a-b);
        }
        if (a<b)
        {
            int n = a;
            System.out.println("С использованием for: ");
            for (i = 0; i <= b-a; i++)
            {
                int [] v = new int[b-a+1];
                v[i] = n; n++;
                System.out.print(v[i] + " ");
            }
            System.out.println();
            System.out.println("С использованием while: ");
            i = 0; n = a;
            while (i <= b-a)
            {
                int [] v = new int[b-a+2];
                i++;
                v[i] = n; n++;
                System.out.print(v[i] + " ");
            }
            System.out.println();
            System.out.println("С использованием do-while: ");
            i = 0; n = a;
            do
            {
                int [] v = new int[b-a+2];
                i++;
                v[i] = n; n++;
                System.out.print(v[i] + " ");
            }
            while (i <= b-a);
        }
        if (a==b) System.out.println(a);
    }
}
