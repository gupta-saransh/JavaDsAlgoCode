package feb10;

public class linearSearch {

	public static void main(String[] args) {
		int[] arr = {55, 2, 33, 11, 77, 6};
		// take data from user, find in array and print index
		int data = 11;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == data){
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(-1);
	}

}
