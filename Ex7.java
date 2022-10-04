class Ex7
{
    public static void main(String[] agrs)
    {
        int i,j=0,n=5;
        for(i=0;i<n;i++)
        {
            for (j =0;j<n;j++)
            {
                if(i==0 || i==4 || j==0 || j==4)
                {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        
        }
    }
}

// o/p 
// *****
// *   *
// *   *
// *   *
// *****
