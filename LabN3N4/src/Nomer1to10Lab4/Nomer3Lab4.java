package Nomer1to10Lab4;

import java.util.Arrays;

public class Nomer3Lab4
{
    public void mas2rec()
    {
      char a [][] = new char[1][10];
      int i,j,n=0;
      while(n<10)
      {
          for (i = 0; i < 1; i++)
          {
              for (j = 0; j < 10; j++)
              {
                  if (n!=0&n!=9){a[0][0]='2';a[i][j]=0;a[0][9]='2';}
                  if (n==0|n==9){a[i][j] = '2';}
              }
          }
          System.out.println(Arrays.deepToString(a));
          n++;
      }
    }
}
