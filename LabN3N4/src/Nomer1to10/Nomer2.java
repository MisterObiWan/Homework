package Nomer1to10;

import java.util.Scanner;

public class Nomer2
{
    public void Daysearch()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели");
        String a = in.nextLine();
        if (a.equals("Понедельник") | a.equals("Вторник") | a.equals("Среда") | a.equals("Четверг")
                | a.equals("Пятница") | a.equals("Суббота") | a.equals("Воскресенье") | a.equals("понедельник") | a.equals("вторник")
                | a.equals("среда") | a.equals("четверг") | a.equals("пятница") | a.equals("суббота") | a.equals("воскресенье"))
        {
            switch(a)
            {
                case "Понедельник": System.out.println(1);break;
                case "Вторник": System.out.println(2);break;
                case "Среда": System.out.println(3);break;
                case "Четверг": System.out.println(4);break;
                case "Пятница": System.out.println(5);break;
                case "Суббота": System.out.println(6);break;
                case "Воскресенье": System.out.println(7);break;
                case "понедельник": System.out.println(1);break;
                case "вторник": System.out.println(2);break;
                case "среда": System.out.println(3);break;
                case "четверг": System.out.println(4);break;
                case "пятница": System.out.println(5);break;
                case "суббота": System.out.println(6);break;
                case "воскресенье": System.out.println(7);break;
            }
        }
        else System.out.println("Такого дня нет");
    }
}
