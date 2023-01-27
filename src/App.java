import java.util.Arrays;

public class App {
  public static Integer findSecondSmallestItem(Integer[] arr) {
    int small = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for(int i=0; i< arr.length ; i++){
      int current = arr[i];
      if( current < small){
        secondSmallest = small;
        small= current;
      } else if(current < secondSmallest && current !=small){
        secondSmallest = current;
      }
    }
    if(secondSmallest == Integer.MAX_VALUE){
      return null;
    }
    return secondSmallest;
  }
  
  public static Integer findSecondSmallestItem2(Integer[] arr) {
    if (arr.length <= 1) {
      return null;
    }
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] != arr[i + 1]) {
        return arr[i + 1];
      }
    }
    return null;
  }
  public static void main(String[] args) {
    Integer[] a= new Integer[]{5,8,3,2,6};
    System.out.println(findSecondSmallestItem(a));
    Integer[] b = new Integer[] { 3, 3, 3, 3, 3 };
    System.out.println(findSecondSmallestItem(b));
    Integer[] c = new Integer[] { 3, 3, 4, 3, 3 };
    System.out.println(findSecondSmallestItem(c));
    Integer[] d = new Integer[] {};
    System.out.println(findSecondSmallestItem(d));
    Integer[] e = new Integer[] { 1 };
    System.out.println(findSecondSmallestItem(e));
  }
}