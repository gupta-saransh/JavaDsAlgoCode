package feb10;

public class printss {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		for(int i = 0; i < (1 << arr.length); i++){
			for(int b = arr.length - 1, j = 0; b >= 0; b--, j++){
				int bm = 1 << b;
				if((i & bm) == bm){
					System.out.print(arr[j] + " ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}



