package Nomer1to10;

public class Nomer8
{
    public void BykvaA()
    {
        System.out.println("10 согласных букв: ");
        int a = 10; char [] b = new char[a];
        char c = 64;
        int i = 0;
        while (c < 90)
        {
            c++;
            if (c != 65 && c != 69 && c != 73 && c != 79 && c != 81 && c != 85 & c != 89)
            {
                if (i == a) break;
                b[i] = c; System.out.print(b[i] + " ");i++;
            }
        }
    }
}
