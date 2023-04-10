package PartV;

public class Exceptions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            int fourthElement = arr[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed.");
        }

    }
}
