public class quicksort {

    static void print(int arr[])
   {
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i] + " ");
       }
       System.out.println();
   }

    static int partition(int arr[], int low, int high) {
       int pivot = arr[low];
       int i = low + 1;
       int j = high;

       do {
           while (arr[i] <= pivot) {
               i++;
           }

           

           while (arr[j] > pivot) {
               j--;
           }
           if (i < j) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }

       } while (i < j);
     int temp = arr[low];
     arr[low] = arr[j];
     arr[j] = temp;

       return j;
   }

    static void Quicksort(int arr[], int low, int high) {
       int partitionindex = 0;

       if (low < high) {
           partitionindex = partition(arr, low, high);
           Quicksort(arr, low, partitionindex - 1);
           Quicksort(arr, partitionindex + 1, high);
       }

   }

   public  static void main(String args[]) {
       int arr[] = { 23, 1, 2, 123, 35, 0 };
       int n = arr.length;
       print(arr);
       Quicksort(arr,0,n - 1);
       print(arr);
   }
}
