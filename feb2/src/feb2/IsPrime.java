package feb2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter a number ");
		int n = scn.nextInt();

		int divisor = 2;
		while (divisor < n) {
			if(n % divisor == 0){
				System.out.println("Not Prime");
				return;
			}
			
			divisor++;
		}
		
		System.out.println("Prime");
	}

}




