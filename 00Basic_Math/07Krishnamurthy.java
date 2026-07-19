//krishnamurti
import java.util.*;
public class Main {
    public static boolean krishnamurti(int a){
        int q = 0;
        int z = a;
        while(a != 0){
            int rem = a % 10;
            a = a / 10;
            int p = 1;
            for(int i = 2; i <= rem; i++){
                p = p * i;
            }
            q = q + p;
        }
        return q == z;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("give the number: ");
		int num = sc.nextInt();
		boolean ans = krishnamurti(num);
		System.out.println("The number "+num+" is krishnamurthy: "+ans);
	}
}
