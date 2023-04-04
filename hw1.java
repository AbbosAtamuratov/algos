public class hw1 {
    public static void main(String[] args) {
        int[] unsorted = new int[]{1, 3, 1, 5, 7, 7, 3, 2, 5, 7};

        printArr(unsorted);
        countingSort(unsorted);
        printArr(unsorted);
    }

    public static void countingSort(int[] arr) {
        int maxVal = getMaxValue(arr);
        int[] countArr = new int[maxVal + 1];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] > 0) {
                arr[index++] = i;
                countArr[i]--;
            }
        }
    }

    public static int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }


    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[arr.length-1]+"]\n");
    }

}
