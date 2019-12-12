package Nomer1to10Lab4;

import java.util.Random;
import java.util.Scanner;

public class Nomer5Lab4
{
    public void masrand()
    {
        int i,j,n,m;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк ");
        n = in.nextInt();
        System.out.println("Введите количество столбцов");
        m = in.nextInt();
        int a[][] = new int[n][m];
        Random random = new Random();
        for (i=0;i<n;i++)
        {
            for (j=0;j<m;j++)
            {
                a[i][j] = random.nextInt(50);
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (i=0;i<m;i++)
        {
            for (j=0;j<n;j++)
            {
                System.out.print(" " + a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
