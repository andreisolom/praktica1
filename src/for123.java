public class for123 {
    public static void main(String[]args)
    {
        int sum=0;
        int [] arr1={10, 9, 8};
        int a=arr1[0];
        int b=arr1[1];
        int c=arr1[2];
        for(int i:arr1)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
