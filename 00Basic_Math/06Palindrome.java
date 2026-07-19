/*
	Problem Statement: Palindrome Number
	File Name: 03Palindrome.java
*/

//palindrom 
import java.util.*;
public class Main
{
    public static boolean palindrom(int num){
        
        // if(num < 10) return true;
        
        int temp = num;
        
        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            num = num / 10;
            rev = (rev * 10) + rem;
        }
        return temp == rev;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Give the number: ");
		int n = sc.nextInt();
		boolean ans = palindrom(n);
		System.out.println("The number is plaindrome: "+ans);
	}
}
