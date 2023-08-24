public class Array {

   public static void main(String[] args) {
      int[] arr = {10,22,44,1,5,3,19,2,6,33,88};

      for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i] + " ");
      }
     
     
      int max = arr[0];
      int index = 0;
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] > max)
         {
             max = arr[i];
             index = i+1;
         }
      }
      System.out.println("Max is " + max);  
      System.out.println("Max index is " +index);
   }
}