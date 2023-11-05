package w8;
//Declare array and store any 5 countries and print them in console.
public class Qs2 {
    public static void main(String[] args)
    {
        Qs2 cou=new Qs2();
        cou.w2();
    }
    public void w2()
    {
        String s [] = {"UK","USA","Canada","India","Australia"};
        for (int i=0; i<=s.length-1; i++)
        {
            System.out.println(s[i]);
        }
    }
}
