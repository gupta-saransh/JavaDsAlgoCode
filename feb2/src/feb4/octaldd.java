package feb4;

import java.util.Scanner;

public class octaldd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int o1 = scn.nextInt(); 
		int o2 = scn.nextInt();
		
		int c = 0;
		int p = 1;
		int sum = 0;
		while(o1 > 0 || o2 > 0 || c > 0){
			int r1 = o1 % 10;
			o1 = o1 / 10;
			
			int r2 = o2 % 10;
			o2 = o2 / 10;
			
			int r = r1 + r2 + c;
			int d = r % 8;
			c = r / 8;
			
			sum = sum + d * p;
			p = p * 10;
		}
		
		System.out.println(sum);
	}

}














