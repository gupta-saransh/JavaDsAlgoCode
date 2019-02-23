package feb3;

import java.util.Scanner;

public class pat4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a number ");
		int n = scn.nextInt();
		
		for(int i = 0; i < n; i++){
			int nck = 1;
			
			for(int j = 0; j <= i; j++){
				System.out.print(nck + "\t");
				int nckp1 = nck * (i - j) / (j + 1);
				nck = nckp1;
			}
			System.out.println();
		}
	}

}






