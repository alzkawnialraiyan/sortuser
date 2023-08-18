import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter numbers of elements: ");
        int n = read.nextInt();

        int [] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i =0; i<n ; i++){
            array[i] = read.nextInt();
        }

        int temp =0;

        System.out.println("Elements of original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j< array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("Elements of array sorted in ascending order: ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}