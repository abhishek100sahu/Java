public class HalfPyramid
{
    public static void main(String[] args) {
        int n = 4;
//      Outer loop from 1 to n
        for(int i = 1; i <= n; i++)
            {
//              Inner loop from 1 to i
        		for (int j = 1; j <= i; j++ )
                    System.out.print("*");

                System.out.println();
            }

    }
}
