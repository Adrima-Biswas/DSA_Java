//prime 
import java.util.*;
public class Main
{
    public static boolean prime(int a){
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the number: ");
		int a = sc.nextInt();
		boolean ans = prime(a);
		System.out.print("The number is prime: "+ans);
	}
}
