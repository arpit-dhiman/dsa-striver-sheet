
    public class Mergesort {

        public static void display(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }
    
        public static void merge(int arr[], int left, int mid, int right) {
            int i, j, k;
    
            int n1[] = new int[mid - left + 1];
            int n2[] = new int[right - mid];
    
            for (i = 0; i < n1.length; i++) {
                n1[i] = arr[left + i];
            }
            for (j = 0; j < n2.length; j++) {
                n2[j] = arr[mid + 1 + j];
            }
            i = 0;
            j = 0;
            k = left;
            while (i < n1.length && j < n2.length) {
                if (n1[i] <= n2[j]) {
                    arr[k++] = n1[i++];
                } else {
                    arr[k++] = n2[j++];
                }
            }
            while (i < n1.length) {
                arr[k++] = n1[i++];
            }
            while (j < n2.length) {
                arr[k++] = n2[j++];
            }
        }
    
        public static void mergesorts(int arr[], int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
                mergesorts(arr, left, mid);
                mergesorts(arr, mid + 1, right);
                merge(arr, left, mid, right);
    
            }
        }
    
        public static void main(String args[]) {
            int arr[] = { 7, 3, 4, 9, 1 };
    
            System.out.println("Original Array");
            display(arr);
            System.out.println();
    
            mergesorts(arr, 0, arr.length-1);
    
            System.out.println("After Sorting");
    
            display(arr);
    
        }
    }
    

