package feb9;

public class fartocel {

	public static void main(String[] args) {
		int start = 0;
		int end = 300;
		int step = 20;
		
		for(int far = start; far <= end; far += step){
			int cel = (int)(5.0 / 9 * (far - 32));
			System.out.println(far + "\t" + cel);
		}
	}

}
