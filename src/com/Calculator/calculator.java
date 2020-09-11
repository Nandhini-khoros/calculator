package com.Calculator;
import java.util.Scanner;
public class calculator
{
    public static int addition(int a, int b)
    {
        return a+b;
    }
    public static int sub(int a, int b)
    {
        return a - b;
    }
    public static int mul(int a, int b)
    {
        return a * b;
    }
    public static int div(int a, int b)
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        else {
            return a / b;
        }
    }
    public static void main(String args[])
    {
        char g;
        int a;
        int b;
        System.out.println("Enter operation to be performed");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        g=s.next().charAt(0);
        switch(g) {
            case '+': {
                System.out.println(addition(a,b));
                break;
            }
            case '-': {
                System.out.println(sub(a,b));
                break;
            }
            case '*': {
                System.out.println(mul(a,b));
                break;
            }
            case '/': {

                System.out.println(div(a, b));
                break;

            }
            default:
                throw new IllegalStateException("Unexpected value: " + g);
        }
    }
}
