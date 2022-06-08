import java.util.Scanner;
public class Hello
{
public static long fibo(int n)	
{
if(n<=1) return 0;
if(n==2) return 1;
return fibo(n-1) + fibo (n-2);
}
public static void main(String[]args)
{
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = input.nextInt();
    long d = fibo(n);
    System.out.println(d);
}
}