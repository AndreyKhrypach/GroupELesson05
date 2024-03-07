import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson05Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number between 0 -10:");
        int manualNumber = scanner.nextInt();
        if (manualNumber > 10 || manualNumber < 0) {
            System.out.println("WRONG INPUT!!");
        } else {
            System.out.println(manualNumber);
        }
        // Random random = new Random();
//        int[] arr = new int[] {12, 34, 55, 2, 4, 6, 8, 10, 11};
//        System.out.println(Arrays.toString(arr));
//        int keyNumber = random.nextInt(10) + 1;
//        System.out.println(keyNumber);
//        for (int index = 0; index < arr.length; index++) {
//            if(arr[index] == keyNumber){
//                System.out.println("Number founded: " + keyNumber +
//                        " by index = " + index);
//            }
//        }

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));


//        byte[] byteArr = new byte[5];
//        short[] shortArr = new short[5];
//        int[] intArr = new int[5];
//        long[] longArr = new long[5];
//        float[] floatArr = new float[5];
//        double[] doubleArr = new double[5];
//        boolean[] boolArr = new boolean[5];
//        char[] charArr = new char[5];

//        int[] arr = new int[] {12, 34, 55, 2, 4, 6, 8, 10, 11};
//        System.out.println(arr.length);

//        int[] arr = new int[5];
//        arr[0] = random.nextInt(10);
//        arr[1] = random.nextInt(10);
//        arr[2] = random.nextInt(10);
//        arr[3] = random.nextInt(10);
//        arr[4] = random.nextInt(10);

        //       int[] arr = {5, 3, 8, 23, 1};

//        int[] manualArrayInt = new int[]{5, 3, 8, 23, 1};
//        int sum = 0;
////        for (int element :
////                manualArrayInt) {
////            sum +=element;
////        }
//        for (int index = 0; index < manualArrayInt.length; index++) {
//            sum += manualArrayInt[index];
//        }
//        System.out.println((double) (sum / manualArrayInt.length));
//        int[] arrayInt = new int[5];
//        for (int index = 0; index < arrayInt.length; index++) {
//            System.out.print(arrayInt[index] + ", ");
//        }
//        for (int index = 0; index < arrayInt.length; index++) {
//            arrayInt[index] = random.nextInt(10);
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arrayInt));

//        int a = 0;
//        while (true){
//            System.out.println(a);
//            a++;
//            if(a == 10){
//                break;
//            }
//        }


//        int a = 0;
//        for (; ; ) {
//            System.out.println(a);
//            a++;
//            if( a == 10){
//                break;
//            }
//        }

//        int a = 0;
//
//        do {
//            System.out.println(a);
//            a++;
//        }while (a < 10);

//        while (a < 100) {
//            System.out.println(a);
//            a++;
//        }

//        int a = 0;
//        boolean bool = false;
//        while (!bool) {
//            System.out.println(a);
//            a++;
//            if (a > 10) {
//                bool = true;
//            }
//
//        }

//        int a = 0;
//
//        while (a < 10) {
//            System.out.println(a);
//            a++;
//        }

//        for (byte i = 127; i > -10; i--){
//            System.out.println(i);
//        }
//        for (int i = 100; i > 0; i-=10) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 100; i+=10) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i > 0; i--) {
//            if(i % 10 == 0){
//                System.out.println(i);
//            }
//        }

//        for (int i = 0; i <= 10; i++) {
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }

//        int i = 0;
//        for ( ; i < 10; i++) {
//            System.out.println(i);
//        }
//        System.out.println("______________________________");
//        System.out.println(i);

//        int a = 0;
//
//        for (int i = 0; i < 3; i++){
//            System.out.println(a);
//            a++;
//        }
        scanner.close();
    }
}
