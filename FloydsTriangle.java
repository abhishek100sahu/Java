public class FloydsTriangle
{
    public static void main(String[] args) {
        int n = 1;
        // Outer loop from 1 to 5
        for (int i=1; i<=5; i++)
        {
            // Inner loop from 1 to i
            for(int j=1; j<=i; j++)
            {
                System.out.print(n+" ");
                n+=1;
            }
            System.out.println();
        }
    }
}
