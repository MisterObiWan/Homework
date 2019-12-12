package Nomer1to10;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Nomer10
{
    public void Sort()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        Random random = new Random();
        Integer[] b = new Integer[size];
        System.out.println("Неотсортированный массив: ");
        for (int i = 0; i < size; i++)
        {
           b[i] = random.nextInt(30);
           System.out.print(b[i] + " ");
        }
        for (int x:b) {Arrays.sort(b,Collections.reverseOrder()); }
        System.out.println();
        System.out.println("Готовый массив: " + Arrays.deepToString(b));
    }
}
