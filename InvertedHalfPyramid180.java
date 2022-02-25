public class InvertedHalfPyramid180
{
    public static void main(String[] args) {
        int n = 4;

        // Outer loop from i to n
        for(int i=1; i<=n; i++)
            {
                // 1st Inner loop from 1 to n-i for Space
                for (int j=1; j<=n-i; j++)
                {
                    System.out.print(" ");
                }

                // 2nd Inner loop from 1 to i for star
                for (int j=1; j<=i ;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

    }
}
