import java.util.Scanner;

public class Anybasetodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();

        System.out.println(decimal(num,base));
    }
    public static int decimal(int num,int base)
    {
        int result = 0;
        int power = 0;
        while(num>0)
        {
            int x =num%10;
            result+=x*checkPow(base,power);
            power++;
            num/=10;
        }
        return result;
    }
    public static int checkPow(int base,int x)
    {
        if(x==0)
            return 1;

        return base * checkPow(base,x-1);
    }
}
/*
You are given a number A. You are also given a base B. A is a number on base B.
You are required to convert the number A into its corresponding value in decimal number system.
Input
A = 1010
B = 2
Output
10
Input
A = 22 
B = 3
Output
8

1010....0*pow(2,0),1*pow(2,1)
    */
