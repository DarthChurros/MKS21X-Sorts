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

  public static void bubbleSort(int[] ary) {
    boolean run = true;
    while (run) {
      run = false;
      for (int i = 0; i < ary.length - 1; i++) {
        if (ary[i] > ary[i+1]) {
          int temp = ary[i];
          ary[i] = ary[i+1];
          ary[i+1] = temp;
          run = false;
        }
      }
    }
  }

  public static void main(String[] args) {
    int size = Integer.parseInt(args[0]);
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = (int)(Math.random() * size - size / 2);
    }
    if (args[3].equals("display"))
      System.out.println("unsorted: " + Arrays.toString(arr));
    switch (args[1]) {
      case "selection":
        selectionSort(arr);
        break;
      case "bubble":
        bubbleSort(arr);
        break;
      default: System.exit(1);
    }
    if (args[3].equals("display"))
      System.out.println("sorted: " + Arrays.toString(arr));
  }
}
