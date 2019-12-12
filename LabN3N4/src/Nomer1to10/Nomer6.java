package Nomer1to10;

import java.util.Random;
import java.util.Scanner;

public class Nomer6
{
    public void Easy()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Задать размер массива: ");
        int size = in.nextInt();
        int a = 0;
        for (int i = 0; i < size; i++)
        {
            int [] b = new int[size];
            Random random = new Random();
            while (a%5 != 2) {a = random.nextInt(100);}
            b[i] = a; a = 0;
            System.out.print(b[i] + " ");
        }
    }
}
