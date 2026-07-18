//Sum of all digits of a number
import java.util.*;
public class Main
{
    public static int sum(int a){
        int p = 0;
        while(a != 0){
            int q = a % 10;
            a = a / 10;
            p = p + q;
        }
        return p;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Give the number: ");
		int num = sc.nextInt();
		int ans = sum(num);
		System.out.println("The sum of all the digits of the number "+num+" is: "+ans);
	}
}
