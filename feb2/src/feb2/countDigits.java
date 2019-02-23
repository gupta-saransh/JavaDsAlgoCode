package feb2;

public class countDigits {

	public static void main(String[] args) {
		int n = 98123;
		
		while(n != 0){
			int r = n % 10;
			System.out.print(r);
			n = n / 10;
		}
	}

}
