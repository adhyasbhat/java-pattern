class Ex8
{
    public static void main(String[] agrs)
    {
        int i,j,n=5;
        for(i=0;i<n;i++)
        {
            for (j =0;j<n;j++)
            {
                if(i==0 || i==n-1 || j==0 || j==n-1)
                {
                System.out.print(" "+"*");
            }
            else{
                System.out.print(" "+" ");
            }
            }
            System.out.println();
        
        }
    }
}

// o/p 
// * * * * *
// *       *
// *       *
// *       *
// * * * * *
