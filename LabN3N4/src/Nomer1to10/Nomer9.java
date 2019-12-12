package Nomer1to10;

import java.util.Random;
import java.util.Scanner;

public class Nomer9
{
    public void Randmin()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] b = new int[size];
        int min = 30, c = 0;
        Random random = new Random();
        for (int i = 0; i < size; i++)
        {
            b[i] = random.nextInt(20);
            System.out.print(b[i] + " ");
            if (b[i]<min) {min = b[i];c = i;}
        }
        System.out.println();
        System.out.println("Минимальный элемент: " + min  + " Его индекс: " + c);
    }
}
