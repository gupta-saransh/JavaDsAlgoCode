package feb10;

public class inverse {

	public static void main(String[] args) {
		int[] arr = {4, 1, 2, 0, 3};
		int[] inv = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			inv[arr[i]] = i;
		}
		
		for(int i = 0; i < inv.length; i++){
			System.out.print(inv[i] + " ");
		}
	}

}






