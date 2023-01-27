import java.util.Arrays;

public class App {

  public static void moveZerosToEnd(int[] arr) {
    int count=0;
    for (int i=0; i < arr.length; i++){
      if(arr[i] !=0){
        arr[count] = arr[i];
        count++;
      }
    }  
    while(count < arr.length){
      arr[count] = 0;
      count++;
    }
  }
  
  
  public static void main(String[] args) {
    int[] arr = new int[]{1,1,0,0,0,1,0};
    System.out.println(Arrays.toString(arr));
    moveZerosToEnd(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println();

    int[] arr2 = new int[] { 0, 0, 1, 2, 3, 0, 4 };
    System.out.println(Arrays.toString(arr2));
    moveZerosToEnd(arr2);
    System.out.println(Arrays.toString(arr2));
    System.out.println();

    int[] arr3 = new int[] { 1, 0, 4, 4, 0, 0, 0 };
    System.out.println(Arrays.toString(arr3));
    moveZerosToEnd(arr3);
    System.out.println(Arrays.toString(arr3));
    System.out.println();

  }
}
