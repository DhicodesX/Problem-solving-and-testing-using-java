import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Task2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i;
        for (i=0; i<n; i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            if (a==1){
                if(isOdd(b)== true){
                    System.out.println("ODD");
                }
                else{
                    System.out.println("EVEN");
                }
            }
            else if(a==2){
                if (isPrime(b)==true){
                    System.out.println("PRIME");
                }
                else{
                    System.out.println("COMPOSITE");
                }
            }
            else if (a==3){
                if (isPalindrome(b)==true){
                    System.out.println("PALINDROME");
                }
                else{
                    System.out.println("NOT PALINDROME");
                }
            }
            else{
                System.out.println("Invalid number");
            }
        }
    }
    
    public static boolean isOdd(int b){
        return b%2!=0;
    }
    public static boolean isPrime(int b){
        for (int i=2; i<=b/2; i++){
            if (b%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int b){
        int i=0;
        int rev=0;
        int res=0;
        int num=b;
        while (b!=0){
            rev=b%10;
            res=(res*10)+rev;
            b=b/10;
        }
        return num==res;
    }
}
