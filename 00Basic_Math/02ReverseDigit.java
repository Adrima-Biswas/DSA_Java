/*
	Problem Statement: Reverse a number
	File Name: 02Reverse.java
*/

import java.util.*;
public class Main
{
    public static int reverse(int a){
        int rev = 0;
        while(a != 0){
            int rem = a % 10;
            a = a / 10;
            rev = (rev * 10) + rem;
        }
        return rev;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Give the number: ");
		int num = sc.nextInt();
		int ans = reverse(num);
		System.out.println("The reverse number is: "+ans);
	}
}
