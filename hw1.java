public class hw1 {
    public static void main(String[] args) {
        int[] unsorted = new int[]{1, 3, 1, 5, 7, 7, 3, 2, 5, 7};

        printArr(unsorted);
        selectSort(unsorted);
        printArr(unsorted);
    }

    public static void selectSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minInd = i;

            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
            }

            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[arr.length-1]+"]\n");
    }

}
