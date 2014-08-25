import java.util.ArrayList;
public class Main {
    public static void main (String[] args) {
    ArrayList<Integer> primes = new ArrayList<>(100);
    int i = 2;
    int palindrome = 0;
    while (i < 1000) {
        boolean prime = true;
        //is i prime?
        for (Integer p : primes) {
            if ( i % p == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            primes.add(i);
        
            //test for palindrome < 1000
            if (i < 10 || (i< 100 && i >= 10 && i / 10 == i % 10) ||(i >= 100 && i / 100 == (i % 10)))
             palindrome = i;
        }
        i += 1;
    }
    System.out.println(palindrome);
    }
}
