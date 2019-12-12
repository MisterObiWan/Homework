import Nomer1to10.*;
import Nomer1to10Lab4.*;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = 0;
        while (c==0)
        {
            System.out.println("Выберите лабораторную работу: " + "\n" + "1.Лаб.работа №3     2.Лаб.работа №4");
            int b = in.nextInt();
            if (b == 1)
            {
                System.out.println("Выберите номер задания (от 1 до 10)");
                int a = in.nextInt();
                Nomer1 zadacha = new Nomer1();
                Nomer2 zadacha2 = new Nomer2();
                Nomer3 zadacha3 = new Nomer3();
                Nomer4 zadacha4 = new Nomer4();
                Nomer5 zadacha5 = new Nomer5();
                Nomer6 zadacha6 = new Nomer6();
                Nomer7 zadacha7 = new Nomer7();
                Nomer8 zadacha8 = new Nomer8();
                Nomer9 zadacha9 = new Nomer9();
                Nomer10 zadacha10 = new Nomer10();
                switch (a)
                {
                    case 1: zadacha.Daysearch();
                        System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 2: zadacha2.Daysearch();
                    System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 3: zadacha3.Fibonachi();
                    System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 4: zadacha4.TwoNum();
                    System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 5: zadacha5.Slojno();
                    System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 6: zadacha6.Easy();
                    System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 7: zadacha7.Bykva();
                    System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 8: zadacha8.BykvaA();
                    System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 9: zadacha9.Randmin();
                    System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 10: zadacha10.Sort();
                    System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                }
            }
            if (b == 2)
            {
                System.out.println("Выберите номер задания (от 1 до 10)");
                int a = in.nextInt();
                Nomer1Lab4 zadacha1 = new Nomer1Lab4();
                Nomer2Lab4 zadacha2 = new Nomer2Lab4();
                Nomer3Lab4 zadacha3 = new Nomer3Lab4();
                Nomer4Lab4 zadacha4 = new Nomer4Lab4();
                Nomer5Lab4 zadacha5 = new Nomer5Lab4();
                Nomer6Lab4 zadacha6 = new Nomer6Lab4();
                Nomer7Lab4 zadacha7 = new Nomer7Lab4();
                Nomer8Lab4 zadacha8 = new Nomer8Lab4();
                switch (a)
                {
                    case 1: zadacha1.rectangle();
                    System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 2: zadacha2.triangle();System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 3: zadacha3.mas2rec();System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 4: zadacha4.mastrian();System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 5: zadacha5.masrand();System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 6: zadacha6.masdel();System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 7: zadacha7.zmeika();System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                    case 8: zadacha8.cezar();System.out.println("Желаете повторить?" + " " + "1.Да   2.Нет"); c = in.nextInt(); if (c==1) {c = 0;}break;
                }
            }
        }
    }
}
