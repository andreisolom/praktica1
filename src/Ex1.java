public class Ex1
{
    public static void main(String[]args)
    {
        int[]arr1=new int[10];
        int[]arr2=new int[10];

        for(int i=0; i<10; i++)
        {
            arr1[i]= i;
            arr2[10 -1 -i]= i;
        }

        int[]arrVar=new int[10];
        int i=0;
        int c=0;
        while(i<10){

            arrVar[i]=arr1[i]+arr2[i];
            c+=arrVar[i];

            i++;
        }
        System.out.println(c);
        i=0;
        System.out.println();
        do
        {
            System.out.print(arrVar[i]);
            i++;
        }while(i<10);

        System.out.println();
        for(int k=0;k<10;k++)
        {
            System.out.print(arr1[k]);

        }
        System.out.println();
        for(int k=0;k<10;k++)
        {
            System.out.print(arr2[k]);

        }

    }
}
