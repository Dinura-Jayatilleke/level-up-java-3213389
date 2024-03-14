package com.linkedin.javacodechallenges;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("is "+ n +"even? " +isEven(n));
    }

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    //return (n%2 == 0);
}
