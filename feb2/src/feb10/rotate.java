package feb10;

public class rotate {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 7, 1, 6, 9, 0};
		int r = 2;
		
		reverse(arr, 0, arr.length - 1); // full
		reverse(arr, 0, r - 1); // p1
		reverse(arr, r, arr.length - 1); // p2
		
		for(int val: arr){
			System.out.print(val + " ");
		}
		System.out.println(".");
		
	}
	
	private static void reverse(int[] arr, int lo, int hi){
		for(int left = lo, right = hi; left < right; left++, right--){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
	}

}
