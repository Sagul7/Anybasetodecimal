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
