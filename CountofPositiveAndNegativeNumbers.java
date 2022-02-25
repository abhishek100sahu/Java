import java.util.Scanner;

public class CountofPositiveAndNegativeNumbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input from user
        int i;
        int positivecount=0;
        int negativecount=0;
        do{
            System.out.print("Enter the Number : ");
            int a = sc.nextInt();
            i=a;
            if (i>0)
                positivecount+=1;
            else if(i<0)
                    negativecount+=1;

        }
        while(i!=0);

        System.out.println("Negative numbers are : "+negativecount);
        System.out.println("Positive numbers are : "+positivecount);
        sc.close();
    }
}
