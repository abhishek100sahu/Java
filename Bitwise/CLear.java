package Bitwise;

public class CLear {
    public static void main(String args[]) {
        int n = 5;//0101
        int pos = 0;
        int bitMask = 1<<pos;

        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(binaryConv(newNumber));

    }
    public static int binaryConv(int n)
    {
        if (n == 1) {

            return 1;
        }
        return binaryConv(n / 2) * 10 + n % 2;
    }
}