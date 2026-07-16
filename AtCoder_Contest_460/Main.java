import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the two integers
        long N = sc.nextLong();
        long M = sc.nextLong();
        
        long count = 0;
        
        // Perform the modulo operations until M becomes 0
        while (M != 0) {
            long remainder = N % M;
            N = M; // The problem requires updating N to the previous M if tracking full state, but since the C++ code only updates M, let's keep it exactly identical to your logic:
        }
        
        System.out.println(count);
        sc.close();
    }
}
