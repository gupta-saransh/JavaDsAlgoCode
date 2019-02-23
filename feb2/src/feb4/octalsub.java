package feb4;

import java.util.Scanner;

public class octalsub {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int o1 = scn.nextInt();
		int o2 = scn.nextInt();
		
		int b = 0;
		int p = 1;
		int diff = 0;
		
		while(o1 > 0){
			int r1 = o1 % 10;
			o1 = o1 / 10;
			
			int r2 = o2 % 10;
			o2 = o2 / 10;
			
			r1 = r1 + b;
			if(r1 >= r2){
				b = 0;
			} else {
				b = -1;
				r1 += 8;
			}
			
			int r = r1 - r2;
			diff = diff + r * p;
			p = p * 10;
		}
		
		System.out.println(diff);
	}

}







