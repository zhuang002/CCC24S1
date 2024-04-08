import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int[] seats = new int[N];
        int count = 0;
        for (int i=0;i<N;i++) {
            seats[i] = sc.nextInt();
        }
        for (int i=0;i<N;i++) {
            if (seats[i] == seats[(i+N/2)%N]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
