package Nomer1to10Lab4;

public class Nomer7Lab4
{
    public void zmeika()
    {
        char [][] a = new char[5][5];
        int i,j,n=0;
        for (i = 0; i < 5; i++)
        {
            for (j = 0; j < 5; j++)
            {
                if (n==0)
                {
                    a[i][j] = '2';
                    System.out.print(" " + a[i][j] + " ");
                }
                /*if (n>0&n<5){a[i][j] = ' '; a[i][4] = '2';
                System.out.print(" " + a[i][j] + " ");}
                if (n==5){a[i][j] = '2';
                System.out.println(" " + a[i][j] + " ");}*/
                /*if (n==3){a[i][3] = '2';
                System.out.println(" " + a[i][3] + " ");n++;}
                if (n==4){a[2][j] = '2';
                System.out.println(" " + a[2][j] + " ");n++;}
                if (n==5){a[i][2] = '2';
                System.out.println(" " + a[i][2] + " ");n++;}*/
            }
            n++;
            System.out.println();
        }
    }
}
