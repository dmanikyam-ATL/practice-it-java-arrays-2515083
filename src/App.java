import java.util.Arrays;

public class App {
  
  public static void main(String[] args) {
    int[] l= {45,92,38,33,21};
    for(int item: l){
      System.out.println(item);
    }
    System.out.println();
    // Java Streams
    Arrays.stream(l).forEach(System.out::println);
    //Arrays.stream(arr).filter();
    // Arrays.stream(arr).average();
    // Arrays.stream(arr).sum();
  }
}