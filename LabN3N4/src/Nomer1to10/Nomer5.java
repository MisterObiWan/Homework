package Nomer1to10;

import java.util.Random;
import java.util.Scanner;

public class Nomer5
{
    public void Slojno()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число слагаемых");
        int a = in.nextInt();
        Random random = new Random();
        int c = 0,i,lock = 0;
        one:while(lock == 0)
        {
            int[] b = new int[a];
            for (i = 0; i < a; i++)
            {
                b[i] = random.nextInt(10);
                c = c + b[i];
            }
            if(c%5 == 2 | c%3 == 1)
            {
                for (i = 0; i <a; i++)
                {
                    System.out.print(b[i] + " ");
                }
                System.out.println();
                System.out.println(c);
                lock = 1;
            }
            else {c = 0;}
        }
    }
}
