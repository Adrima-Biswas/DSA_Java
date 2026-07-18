//factorial
import java.util.*;
public class Main
{
    public static int factorial(int a){
        int f = 1;
        for(int i = 2; i <= a; i++){
            f = f * i;
        }
        return f;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Give the number: ");
	    int num = sc.nextInt();
	    int ans = factorial(num);
	    System.out.println("The factorial of the number "+num+" is: "+ans);
	}
}
