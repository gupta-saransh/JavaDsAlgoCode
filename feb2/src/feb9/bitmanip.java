package feb9;

public class bitmanip {

	public static void main(String[] args) {
		int num = 57;
		System.out.println(num + " " + Integer.toBinaryString(num));

		int k = 3;
		// bit on logic
		int bm = 1 << k;
		System.out.println(bm + " " + Integer.toBinaryString(bm));
		
		if((num & bm) == 0){
			System.out.println("Bit is off");
			num = (num | bm);
			System.out.println(num + " " + Integer.toBinaryString(num));
		} else {
			System.out.println("Bit is already on.");
		}
	}

}
