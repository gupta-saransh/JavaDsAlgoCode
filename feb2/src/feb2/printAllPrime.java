package feb2;

public class printAllPrime {

	public static void main(String[] args) {
		int n = 10;
		for (int t = 2; t <= n; t++) {
			boolean tisprime = true;

			// logic purana start
			int d = 2;
			while(d < t){
				if(t % d == 0){
					tisprime = false;
					break;	
				}
				d++;
			}
			// logic purana end
			
			if (tisprime == true) {
				System.out.println(t);
			}
		}
	}

}
