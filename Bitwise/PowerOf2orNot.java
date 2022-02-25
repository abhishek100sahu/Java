package Bitwise;

import java.util.Scanner;

public class PowerOf2orNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n & (n-1))==0) {
            System.out.println(n+" is a Power of 2");
        } else {
            System.out.println(n+" is not a Power of 2");
        }
        sc.close();
    }
}