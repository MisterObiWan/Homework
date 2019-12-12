package Nomer1to10;

import java.util.Scanner;

public class Nomer3
{
  public void Fibonachi()
  {
      Scanner in = new Scanner(System.in);
      System.out.println("Введите число");
      int size = in.nextInt();
      int a = 1, a1 = 1, a2, i;
      System.out.println("С помощью for: ");
      System.out.print("Числа Фибоначчи равны " + a + " " + a1 +" ");
      for (i = 3; i <= size; i++)
      {
          a2 = a + a1;
          System.out.print(a2 + " ");
          a = a1; a1 = a2;
      }
      a = 1; a1 = 1; a2 = 0;
      System.out.println();
      System.out.println("С помощью while: ");
      System.out.print("Числа Фибоначчи равны " + a + " " + a1 +" ");
      i = 3;
      while (i <= size)
      {
          i++;
          a2 = a + a1;
          System.out.print(a2 + " ");
          a = a1; a1 = a2;
      }
      a = 1; a1 = 1; a2 = 0;
      System.out.println();
      System.out.println("С помощью do-while: ");
      System.out.print("Числа Фибоначчи равны " + a + " " + a1 +" ");
      i = 2;
      do
      {
          i++;
          a2 = a + a1;
          System.out.print(a2 + " ");
          a = a1; a1 = a2;
      }
      while (i < size);
  }
}
