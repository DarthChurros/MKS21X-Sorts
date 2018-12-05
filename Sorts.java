import java.util.Arrays;

 public class Sorts {
  public static void selectionSort(int[] ary) {
    for (int i = 0; i < ary.length; i++) {
    int min = i;
      for (int j = i + 1; j < ary.length; j++) {
        if (ary[j] < ary[min]) {
          min = j;
        }
      }
      //System.out.println(Arrays.toString(ary));
      int temp = ary[min];
      ary[min] = ary[i];
      ary[i] = temp;
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[7];
    for (int i = 0; i < 7; i++) {
      arr[i] = (int)(Math.random() * 30 - 15);
    }
    selectionSort(arr);
  }
}
