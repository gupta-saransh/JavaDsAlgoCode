package feb3;

import java.util.Scanner;

public class pat8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter a number ");
		int n = scn.nextInt();

		int stars = 1;
		int spaces = n / 2;
		
		int var = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= spaces; j++){
				System.out.print(" ");
			}
			
			int myvar = var;
			for(int j = 1; j <= stars; j++){
				System.out.print(myvar);
				myvar = j <= stars / 2? myvar + 1: myvar - 1;
			}
			
			if(i <= n / 2){
				spaces--;
				stars += 2;
				var++;
			} else {
				spaces++;
				stars -= 2;
				var--;
			}
			
			System.out.println();
		}
	}

}










