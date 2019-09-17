package Practice;

import java.util.HashMap;
import java.util.Set;

public class myown {
    public myown() {

    }

    public static int find_next_element_matching(int arr[]) {
        int i = 0;

        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Matching Elements are: " + arr[i]);
            }
            if (arr[i] > arr[i + 1]) {
                System.out.println("Greater Elements are : " + arr[i] + " to " + arr[i + 1]);
            }
        }
        return arr[i];
    }

    public static int adding_array(int arr[]) {
        int add = 0;
        for (int i = 0; i < arr.length; i++) {
            add = arr[i] + add;
        }
        return add;
    }

    public static int find_max_number(int arr[]) {
        int max;
        max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int find_one_missing_number(int arr[]) {
        int missing_number;
        int len = arr.length + 1;
        int add = 0;
        int actual_sum = len * (len + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            add += arr[i];
        }
        missing_number = actual_sum - add;
        System.out.println("The missing number is " + missing_number);
        return missing_number;
    }

    public int sort_the_array(int arr[]) {
        int temp;
        int i;
        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
        return arr[i - 1];
    }

    public void find_common_elements(int arr[], int arr2[], int arr3[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    if (arr[i] == arr2[j]) {
                        System.out.println("Common Element" + arr[i]);
                    }
                }
            }
        }
    }

    public void find_occurence(int[] arrayPassed) {
        HashMap<Integer, Integer> mapcons = new HashMap<Integer, Integer>();
        for (int i = 0; i < arrayPassed.length; i++) {
            if (mapcons.containsKey(arrayPassed[i])) {
                mapcons.put(arrayPassed[i], mapcons.get(arrayPassed[i]) + 1);
            } else {
                mapcons.put(arrayPassed[i], 1);
            }
        }
        System.out.println("Count  " + mapcons);
        Set<Integer> check = mapcons.keySet();
        for (int numberofoccurence : check) {
            if (mapcons.get(numberofoccurence) > 1) {
                System.out.println("value is " + numberofoccurence + " and reparting time " + mapcons.get(numberofoccurence));
            }

        }
    }

    public void reverese(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != arr.length - 1) {
                System.out.print(",");
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int[] first_array = {3, 6, 7, 2, 9, 11, 15, 8, 15, 11, 17, 17};
        int[] duplicate_array = {3, 5, 9, 7, 8};
        myown myprogram = new myown();
//        find_next_element_matching(first_array);
//        System.out.println("Addition of Number is " + adding_array(first_array));
//        System.out.println("Maximum Number in array is " + find_max_number(first_array));
//        myprogram.sort_the_array(first_array);
//        myprogram.find_one_missing_number(first_array);
//        myprogram.sort_the_array(first_array);
//        System.out.println("\n");
//        myprogram.sort_the_array(duplicate_array);
//        myprogram.find_common_elements(first_array, duplicate_array);
//        myprogram.find_occurence(first_array);
        myprogram.reverese(first_array);

    }
}
