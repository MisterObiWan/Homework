package Nomer1to10Lab4;

public class Nomer1Lab4
{
    public void rectangle()
    {
        //Ширина 23 колонки; Высота 11 строк;
        int a,b,c = 0,d = 0;
        for (b = 1; b <= 23; b++)
        {++d;if (b==1 | b==23)System.out.print(" ");else System.out.print("_");}++c;System.out.print(c);

        if (c==1) {for (a = 1; a <= 9; a++)
        {System.out.println();for (b = 1; b <= 23; b++)
        {if (b==1 | b==23)System.out.print("|"); else System.out.print(" ");}++c;System.out.print(c);}}

        if (c==10){ System.out.println();for (b = 1; b <= 23; b++)
        {if (b==1 | b==23)System.out.print("|");else System.out.print("_");}++c;System.out.print(c);System.out.println();}
        System.out.println("Кол-во колонок: " + d + " Кол-во строк: " + c);
    }
}
