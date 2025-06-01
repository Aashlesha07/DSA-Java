package margeSorting;

public class mergesorting {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];
        int idx1 = si;     // Left subarray starting index
        int idx2 = mid + 1; // Right subarray starting index
        int x = 0;         // Index for merge array

        // Merge both sorted halves
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements from left subarray
        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }

        // Copy remaining elements from right subarray
        while (idx2 <= ei) {
            merge[x++] = arr[idx2++]; // ✅ Corrected this line
        }

        // Copy merged elements back to the original array
        for (int i = 0, j = si; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
