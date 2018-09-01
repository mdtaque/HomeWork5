package Array;

import java.util.Random;

public class UseRandom {

    public static void main(String[] args) {
        int[] x = new int[5];
        Random random = new Random();

        System.out.println("these are the random numbers: ");

        for (int i = 0; i<5; i++){
            x[i] = random.nextInt(100);
        }

        for(int j = 0; j<5; j++){
            System.out.println(x[j]);
        }
    }
}
