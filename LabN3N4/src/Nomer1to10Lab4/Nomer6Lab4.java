package Nomer1to10Lab4;

import java.util.Random;

public class Nomer6Lab4
{
    public void masdel()
    {
        int j,i,n,m;
        int a[][] = new int[5][5];
        Random random = new Random();
        n = random.nextInt(5);
        m = random.nextInt(5);
        for (i=0;i<5;i++)
        {
            for (j=0;j<5;j++)
            {
                a[i][j] = random.nextInt(50);
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Исчезнувшая строка: " + n + " Исчезнувший столбец: " + m);
        System.out.println();
        for (i=0;i<5;i++)
        {
            for (j=0;j<5;j++)
            {
                if (i==n|j==m)continue;
                System.out.print(" " + a[i][j] + " ");
            }
            if (i==n|j==m)continue;
            System.out.println();
        }
    }
}
