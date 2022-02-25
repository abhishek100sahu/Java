public class Triangle01
{
    public static void main(String[] args) {
        int n = 5;
        // Outer loop from 1 to n
        for (int i=1; i<=n; i++)
        {
            // Inner loop from 1 to i
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
