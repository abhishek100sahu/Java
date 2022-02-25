package Bitwise;

import java.util.Scanner;

public class Update {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;//0101
        int pos = 2;
        int bitMask = 1<<pos;

        if(oper == 1) {
            // set oper
            int newNumber = bitMask | n;
            System.out.println(binaryConv(newNumber));
        } else {
            // CLear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(binaryConv(newNumber));
        }
        sc.close();

    }
    public static int binaryConv(int n)
    {
        if (n == 1) {

            return 1;
        }
        return binaryConv(n / 2) * 10 + n % 2;
    }
}