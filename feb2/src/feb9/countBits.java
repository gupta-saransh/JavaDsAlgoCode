package feb9;

public class countBits {

	public static void main(String[] args) {
		int x = 57;
		
		int counter = 0;
		while(x != 0){
			int rsbm = x & (-x);
			x = x - rsbm;
			counter++;
		}
		
		System.out.println(counter);
	}

}
