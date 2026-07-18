//perfect number

import java.util.*;
public class Main
{
    public static boolean perfect(int a){
        int p = 1;
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                p = p + i;
            }
        }
        return p == a;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the number: ");
		int a = sc.nextInt();
		boolean ans = perfect(a);
		System.out.println("The number is perfect: "+ans);
	}
}
