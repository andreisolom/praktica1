import java.lang.Math;
public class Ex3
{
    public static void main(String[] args)
    {

        int[]RandArr=new int[10];
        for (int i=0;i<10;i++)
        {
            int decV=(int)(Math.pow(10,Math.random()*10));
            double Value=Math.random();
            RandArr[i]=(int)(Value*decV);
        }

        for(int i=0;i<10;i++)
        {
            System.out.print(RandArr[i]);
            System.out.print(" ");

        }
        for (int k=0;k<10;k++)
        {
            for (int i = 1; i < 10; i++)
            {

                if (RandArr[i - 1] > RandArr[i])
                {
                    int Hold = RandArr[i - 1];
                    RandArr[i - 1] = RandArr[i];
                    RandArr[i] = Hold;
                }

            }
        }
        System.out.println();
        for(int i=0;i<10;i++){
            System.out.print(RandArr[i]);
            System.out.print(" ");

        }


    }
}
