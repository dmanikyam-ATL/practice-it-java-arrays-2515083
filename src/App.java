import java.util.Arrays;

public class App {

  public static void reverse(int[] arr) {
    for(int i=0; i < arr.length / 2; i++){
      int temp = arr[i];
      arr[i]=arr[arr.length-1-i];
      arr[arr.length-i-1] = temp;
    }
  }
  
  
  public static void main(String[] args) {
    int[] arr = new int[]{1,2,3,4,5,6,7};
    System.out.println(Arrays.toString(arr));
    reverse(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println();

    int[] arr2 = new int[] { 4, 1, 3, 6, 8, 2, 10 };
    System.out.println(Arrays.toString(arr2));
    reverse(arr2);
    System.out.println(Arrays.toString(arr2));
    System.out.println();

    int[] arr3 = new int[] {};
    System.out.println(Arrays.toString(arr3));
    reverse(arr3);
    System.out.println(Arrays.toString(arr3));
    System.out.println();

  }
}
