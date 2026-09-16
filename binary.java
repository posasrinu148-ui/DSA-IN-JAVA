class binary {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int key = 4;
        int start = 0;
        int end = arr.length - 1;

        System.out.println(binarySearch(key, arr, start, end));
    }

    static int binarySearch(int key, int[] arr, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (arr[mid] > key) {
            return binarySearch(key, arr, start, mid - 1);
        }

        return binarySearch(key, arr, mid + 1, end);
    }
}
