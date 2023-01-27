import java.util.Arrays;

public class App {

  public static Object[] rotateRight(Object[] arr) {
    Object[] result=new Object[arr.length];
    for(int i=0; i < arr.length; i++){
     result[(i+1) % result.length] = arr[i];
    }  
    return result;  
  }
  
  
  public static void main(String[] args) {
    Object[] arr= new Object[]{1,2,3,4,5};
    arr= rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr= rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr= rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr= rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr= rotateRight(arr);
    System.out.println(Arrays.toString(arr));

    Object[] arr2 = new Object[]{"Hello", "there", "my friend"};
    arr2= rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2= rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2= rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
