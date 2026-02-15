
// import java.util.ArrayList;
// class ArrayStore {
//     int[] arr = new int[10]; // storage
//     int index = 0;           // tracks position

//     void insert(int val) {
//         arr[index] = val;
//         index++;
//     }

//     void printAll() {
//         for (int i = 0; i < index; i++) {
//             System.out.println(arr[i]);
//         }
//     }

//   void binarySearch(int target) {
//         int left = 0;
//         int right = index - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (arr[mid] == target) {
//                 System.out.println("Found at index: " + mid);
//                 return;
//             } else if (arr[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         System.out.println("Not Found");
//     }
//      public boolean displayTheDuplicateValue(){

//         for(int i=0;i<index;i++){
//             for(int j=i+1;j<index;j++){
//                 if(arr[i]==arr[j]){
//                     System.out.println("Duplicate value is: "+arr[i]);
//                     return true;
//                 }
//             }
//         }
//         return false;

//     }

// public int removeDuplicates(int[] nums) {
//     if (nums.length == 0) return 0;

//     int index = 1;

//     for (int i = 1; i < nums.length; i++) {
//         if (nums[i] != nums[i - 1]) {
//             nums[index] = nums[i];
//             index++;
//         }
//     }

//     return index;
// }


//     public int calculateFreqValue(){

//         int count = 0;
//          ArrayList<Integer> newArr = new ArrayList<>();
//         for(int i = 0; i<index ; i++){
//             for(int j = 0;  j< i ; j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                     newArr.add(arr[i]);
//                 }
//             }
//         }
//     System.out.println("the duplicates count " + count);
//     System.out.println("the duplicates array" +  newArr);
//         return count;

//     }

//     public static void main(String[] args) {
//         ArrayStore obj = new ArrayStore();

//         obj.insert(12);
//         obj.insert(10);
//         obj.insert(10);
//         obj.insert(10);
//         obj.insert(10);
//         obj.insert(15);
//         obj.insert(10); // duplicate
//         obj.insert(20);
//         obj.displayTheDuplicateValue();
//         obj.calculateFreqValue();
//         obj.removeDuplicates([1,2,4,3,2]);
//         obj.printAll();
//     }
// }

// //dividing array
// class Solution {
//     public int[][] divideArray(int[] nums, int k) {
//         int sorted = sort(nums);
//         int n = nums.length;

//        if(n % 3 != 0){
//          System.out.println("The array can not divied");
//        }
//        int size = n /3;
//        int [] part1 = new int[size];
//         int [] part2 = new int[size];
//          int [] part3 = new int[size];
//  // first part
//         for (int i = 0; i < size; i++) {
//             part1[i] = arr[i];
//         }

//         // second part
//         for (int i = 0; i < size; i++) {
//             part2[i] = arr[i + size];
//         }

//         // third part
//         for (int i = 0; i < size; i++) {
//             part3[i] = arr[i + 2 * size];
//         }
//         return part1, part2,part3;
//     }

// }

// import java.util.Scanner;

// class array{


// public static void main(String[] args){
// //     Scanner scan =  Scanner(System.in);
// //     System.out.println("Enter a number");
// //     int[] arr = scan.nextInt();
//    for(int i = 7; i >= 0; i--){
//       for(int j = 0; j <= i; j++){
//         System.out.print(" ");
//         System.out.print("*" + "");
//       }
//       System.out.println(" ");   
//    }
// //   int n = arr.length;J
// // //   List newList = mew List();
// //   for(int i = 0; i < n; i++){
// //     if(arr[i] % 2 != 0){
// //        System.out.println(arr[i]);
// //        break;
// //     }
// //   }
 
//   }
// }

package array{
   

   public static void main(String[] args){
    String display (){
      System.out.print("Hello World");
    }
    display();
   }
}