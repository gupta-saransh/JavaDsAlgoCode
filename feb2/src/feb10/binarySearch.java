package feb10;

public class binarySearch {

	public static void main(String[] args) {
		int[] arr = {10, 10, 10, 20, 20, 20, 20, 20, 20, 30, 30, 30};
		int data = 10;
		
		int lo = 0;
		int hi = arr.length - 1;
		int res = -1;
		
		while(lo <= hi){
			int mid = (lo + hi) / 2;
			
			if(data > arr[mid]){
				lo = mid + 1;
			} else if(data < arr[mid]){
				hi = mid - 1;
			} else {
				res = mid;
				lo = mid + 1;
			}
		}
		
		System.out.println(res);
	}

}
