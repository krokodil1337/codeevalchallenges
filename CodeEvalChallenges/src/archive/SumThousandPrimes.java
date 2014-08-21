package archive;
import java.util.ArrayList;
public class SumThousandPrimes {
	private static final int MAX_N = 1000;
	public static void main(String[] args) {
		int i = 2; 
		ArrayList<Integer> primes = new ArrayList<>(MAX_N);
		int sum = 0;
		while (primes.size() < MAX_N) {
			boolean isPrime = true;
			for (int p : primes) {
				if (i % p == 0) {
					//p divides i
					i += 1;
					isPrime = false;
					break;
				}
			}
			if (isPrime) { 
				primes.add(i);
				sum += i;				
			}
			System.out.println(sum);
		}
	}

}
