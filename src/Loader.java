public class Loader {
    public static void main(String[]args)
    {


        int sum=0;
        int [] arr1={10, 9, 8};
        int i=0;



        while (i<3)
        {
            sum=sum+arr1[i];
            i++;
        }
        System.out.println(+sum);

    }
}
