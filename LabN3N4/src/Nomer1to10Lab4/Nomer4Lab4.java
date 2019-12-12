package Nomer1to10Lab4;

import java.util.Arrays;

public class Nomer4Lab4
{
    public void mastrian()
    {
        char [][] a = new char[1][10];
        int i,j;
            for (i = 0; i < 1; i++)
            {
                for (j = 0; j < 10; j++)
                {
                    a[i][j] = '2';
                    System.out.println(Arrays.deepToString(a));
                }
            }
    }
}
