class A8
{
    public static void main(String agrs[])
    {
        int i,j,k;
        for(i=1;i<7;i++)
        {
            for(k=6;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}