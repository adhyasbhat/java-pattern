class Ex10
{
    public static void main(String[] agrs)
    {
        int i,j=0,n=5;
        for(i=1;i<=n;i++)
        {
            for (j =1;j<=n;j++)
            {
                if (i*j<10)
                {
                    System.out.print("0");
                }
                System.out.print(i*j+" ");
               
            }
            System.out.println();
        
        }
    }
}

// o/p
// 01 02 03 04 05
// 02 04 06 08 10
// 03 06 09 12 15
// 04 08 12 16 20
// 05 10 15 20 25