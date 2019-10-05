
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class SelectionSort {
    static void recursivoSelectionSort(int numbers[], int n, int index){
        
             for (int i = 0; i < n - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {

                int aux = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = aux;
            }
        }
        recursivoSelectionSort(numbers, n,index+1);

    }
    public static void main(String[] args) {
        int[] numbers = {8, 4, 2, 1, 9, 6};

        recursivoSelectionSort(numbers, numbers.length,1);

        System.out.println(Arrays.toString(numbers));
    }
}
