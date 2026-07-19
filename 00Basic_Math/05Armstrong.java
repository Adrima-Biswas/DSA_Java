// armstrong
import java.util.*;
public class Main {
    
    public static boolean armstrong(int num){
        
        int temp1 = num;
        
        if(num == 0) return true;
        
        int len_num = 0;
        int temp2 = num;
        while(temp2 != 0){
            temp2 = temp2 / 10;
            len_num++;
        }
        
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            num = num / 10;
            sum = sum + (int)Math.pow(rem, len_num);
        }
        
        return temp1 == sum;
        
    }
    
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		System.out.print("Give the number: ");
		int num = sc.nextInt();
		boolean ans = armstrong(num);
		System.out.println("The number is armstrong: "+ans);
	}
	
}
