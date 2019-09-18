package Practice;

class PracticeArray {
    public static PracticeArray practiceArray = new PracticeArray();

    public static void main(String arg[]) {
        int first_array_declare[] = {10, 2, 5, 15, 12, 6, 4, 15, 12, 10};
        int find_1_missing_number[] = {7, 5, 6, 1, 4, 2, 8,10,12};
//        practiceArray.check_if_next_element_matching(first_array_declare);
//        practiceArray.check_if_next_element_is_greater(first_array_declare);
//        practiceArray.sum_array(first_array_declare);
//        System.out.println("The Max number is " + find_max_number(find_1_missing_number));
//        System.out.println("The Missing is " + one_missingNumber(find_1_missing_number));
        practiceArray.sorting_array(find_1_missing_number);
        System.out.println("*****************************");
        practiceArray.sorting_array(first_array_declare);
        System.out.println("*****************************");
//        practiceArray.find_common_elements(find_1_missing_number, first_array_declare);
        practiceArray.remove_duplicates(first_array_declare, first_array_declare.length);
    }

    public void check_if_next_element_matching(int first_array[]) {

        System.out.println("Total count is   " + first_array.length);
        for (int i = 0; i < first_array.length - 1; i++) {
            System.out.print("value at " + i + "  is " + first_array[i] + "\n");
            if (first_array[i] == first_array[i + 1]) {
                System.out.println("Great Number Matches value is  " + first_array[i] + "  and  " + first_array[i + 1]);
            } else {
                System.out.println("Number is not matching and next element is  " + first_array[i + 1]);
            }
        }
    }

    public void check_if_next_element_is_greater(int checkarray[]) {
        System.out.println("*****************************");
        for (int x = 0; x < checkarray.length - 1; x++) {
            if (checkarray[x] < checkarray[x + 1]) {
                System.out.println("Oh Yes !! Next Element is Greater. Compared this values " + checkarray[x] + "  and  " + checkarray[x + 1]);
            } else if (checkarray[x] == checkarray[x + 1]) {
                System.out.println("it is matching " + checkarray[x] + "  and  " + checkarray[x + 1]);
            } else {
                System.out.println("Sorry it is not greater " + checkarray[x] + "  and  " + checkarray[x + 1]);
            }
        }
    }

    public void sum_array(int addition[]) {
        int add = 0;
        for (int y = 0; y < addition.length; y++) {
            add = addition[y] + add;
            System.out.print(addition[y] + " ");
        }
        System.out.println("\n");
        System.out.println("Total sum of array " + add);
    }

    public static int one_missingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int restSum = 0;
        for (int i = 0; i < arr.length; i++) {
            restSum += arr[i];
        }
        int missingNumber = sum - restSum;
        return missingNumber;
    }

    public static int find_max_number(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public void find_common_elements(int arr[], int arr2[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    System.out.println("This is my common array" + arr[i]);
                }
            }
        }

    }

    public int sorting_array(int arr[]) {
        int temp = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(arr[i] + " ");
        }
        return arr[i - 1];
    }

    public static int remove_duplicates(int arr[], int length_array) {
        System.out.println("Array Passed ");
        int i = 0;
        practiceArray.sorting_array(arr);
        System.out.println("\n");
        for (i = 0; i < length_array - 1; i++) {
            for (int j = i + 1; j < length_array; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + "  ");
                }
            }
        }
        return arr[i];
    }
}
