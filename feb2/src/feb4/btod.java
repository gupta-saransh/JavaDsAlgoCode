package feb4;

public class btod {

	public static void main(String[] args) {
		int binary = 111000;
		int decimal = 0;
		
		int p = 1; // 2 ^ 0
		while(binary != 0){
			int rem = binary % 10;
			binary = binary / 10;
			
			decimal = decimal + rem * p;
			p = p * 2;
		}
		
		System.out.println(decimal);
	}

}
