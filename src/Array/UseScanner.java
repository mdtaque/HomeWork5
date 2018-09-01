package Array;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {

        int[] array = new int[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter 3 numbers: ");

        for(int i=0; i<3; i++){
            array[i]=sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i<3; i++){
            sum = sum + array[i];
        }
        System.out.println("sum is: "+sum);
    }
}
