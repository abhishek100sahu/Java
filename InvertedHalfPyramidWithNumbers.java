public class InvertedHalfPyramidWithNumbers
{
    public static void main(String[] args) {
        int n = 5;
        // Outer loop from 1 to n
        for (int i=1; i<=n; i++)
        {
            // Inner loop from 1 to n-i+1
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
