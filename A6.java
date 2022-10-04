class A6
{
    public static void main(String agrs[])
    {
        int i,j,k;
        for(i =1;i<=5;i++)
        {
            for(j=i;j<=5;j++)
            {
                if((i==2 && j==3 || i==2 && j==4 ) ||(i==3 && j==4 ))
                {
                    System.out.print("  ");
                }
                else{
                    System.out.print(j+" ");
                }
                               
            }
            System.out.println();
        }
        
    }
}
// o/p 
// 1 2 3 4 5 
// 2     5 
// 3   5 
// 4 5 
// 5