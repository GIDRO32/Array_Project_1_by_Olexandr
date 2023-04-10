package PartI;

public class PartOne
{
    public static void main(String[] args) {
        int[][] array1 = initializeArray1(5, 5);
        int[][] array2 = initializeArray2();
        int[][] array3 = initializeArray3(5,5);
        int[][] array4 = initializeArray4();
        int[][] array5 = initializeArray5();

        System.out.println("Array 1:");
        printArray(array1);
        System.out.println("Array 2:");
        printArray(array2);
        System.out.println("Array 3:");
        printArray(array3);
        System.out.println("Array 4:");
        printArray(array4);
        System.out.println("Array 4:");
        printArray(array5);
    }

    public static int[][] initializeArray1(int N, int M) {
        int[][] array = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = i * M + j;
            }
        }

        return array;
    }
    public static int[][] initializeArray2() {
        int[][] array = new int[5][5];
        int count = 0;

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                array[j][i] = count++;
            }
        }

        return array;
    }
    public static int[][] initializeArray3(int N, int M) {
        int[][] array = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = 5;
            }
        }

        return array;
    }
    public static int[][] initializeArray4() {
        int[][] array = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = j;
            }
        }

        return array;
    }
    public static int[][] initializeArray5() {
        int[][] array = new int[5][5];
        int count = 24;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = count--;
            }
        }

        return array;
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
