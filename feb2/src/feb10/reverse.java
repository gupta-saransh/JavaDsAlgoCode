package feb10;

public class reverse {

	public static void main(String[] args) {
		int[] arr = {10, 40, 3, 77, 11};
		
		// logic
		for(int left = 0, right = arr.length - 1; left < right;left++, right--){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
	}

}
