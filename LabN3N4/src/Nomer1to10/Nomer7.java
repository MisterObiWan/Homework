package Nomer1to10;

public class Nomer7
{
    public void Bykva()
    {
      System.out.println("10 букв <<через одну>>");
      int a = 10; char [] b = new char[a];
      char c = 96;
      int i = 0;
      while (c < 122)
      {
          if (c%2==1)
          {
              if (i == a) break;
              b[i] = c; System.out.print(b[i] + " ");i++;
          }
          c++;
      }
    }
}
