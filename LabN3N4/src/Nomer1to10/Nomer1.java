package Nomer1to10;

import java.util.Scanner;

public class Nomer1
{
    public void Daysearch()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int a = in.nextInt();
        if (a>0 & a<8)
        {
            switch(a)
            {
                case 1: System.out.println("Понедельник");break;
                case 2: System.out.println("Вторник");break;
                case 3: System.out.println("Среда");break;
                case 4: System.out.println("Четверг");break;
                case 5: System.out.println("Пятница");break;
                case 6: System.out.println("Суббота");break;
                case 7: System.out.println("Воскресенье");break;
            }
        }
        else System.out.println("Введено некорректное значение");
    }
}
