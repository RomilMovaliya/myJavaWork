public class testing {

    /*
     * // binary search
     * 
     * 
     * 
     * 
     * public static void main(String[] args) {
     * 
     * int arr[] ={1,22,2,3,4,5};
     * int key=2;
     * 
     * for(int i=0;i<arr.length;i++){
     * if(arr[i]==key){
     * System.out.println(i);
     * }
     * 
     * }
     * 
     * 
     * 
     * }
     */

    public static int binarySearch(int arr[], int key) {

        int s =0;
        int e = arr.length;
        int mid = (s + e) / 2;

        for (int i = 0; i < arr.length; i++) {
            if (key < arr[mid]) {
                e--;
               
            } else if (key > arr[mid]) {
                s++;
                
            } else {
                return mid;
            }

        }
        return 0;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 77 };
        int key = 5;

        System.out.println(binarySearch(arr, key));

    }
}