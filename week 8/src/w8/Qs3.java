package w8;
//Declare multidimensional array and store 5 countries and their capital and print them in console.
public class Qs3 {
    public static void main(String[] args)
    {
        w3();
    }
    public static void w3()
    {
        String ex [][] = {{"India","Delhi"},{"Uk","London"},{"Canada","Ottawa"},{"Australia","Canberra"},{"Germany","Berlin"}};
        for(int i=0;i<=ex.length-1;i++)
        {
            System.out.println(" ");
            for(int j=0;j<=ex[i].length-1;j++)
            {
                System.out.println(ex[i][j]+" ");

            }
        }
    }
}
