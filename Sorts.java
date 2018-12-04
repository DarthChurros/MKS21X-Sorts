 public class Sorts {
  public static void selectionSort(int[] ary) {
    for (int i = 0; i < ary.length; i++)
      for (int j = i + 1; j < ary.length; j++)
        if (ary[i] > ary[j]) {
          int temp = ary[i];
          ary[i] = ary[j];
          ary[j] = temp;
        }
  }
}
