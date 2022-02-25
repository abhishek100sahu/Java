public class HollowSquare
{
    public static void main(String[] args) {
//      Outer loop from 1 to n
    	for(int i = 1; i <= 4; i++)
            {
//    			Inner loop from 1 to 5
                for(int j = 1; j <= 5; j++)
                {
                    if(i == 1 || j == 1 || i==4 || j==5)
                    {
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
            System.out.println();
            }
    }
}
