import java.util.Arrays;

 public class Sorts {
  public static void selectionSort(int[] ary) {
    int min;
    int temp;
    for (int i = 0; i < ary.length; i++) {
    min = i;
      for (int j = i + 1; j < ary.length; j++) {
        if (ary[j] < ary[min]) {
          min = j;
        }
      }
      //System.out.println(Arrays.toString(ary));
      temp = ary[min];
      ary[min] = ary[i];
      ary[i] = temp;
    }
  }

  public static void bubbleSort(int[] ary) {
    boolean run = true;
    int done = 1;
    int temp;
    while (run) {
      run = false;
      for (int i = 0; i < ary.length - done; i++) {
        if (ary[i] > ary[i+1]) {
          temp = ary[i];
          ary[i] = ary[i+1];
          ary[i+1] = temp;
          run = true;
        }
      }
      done++;
    }
  }

  public static void main(String[] args) {
    int size = Integer.parseInt(args[0]);
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = (int)(Math.random() * size * 4 - size * 2);
    }
    if (args.length > 2 && args[2].equals("display"))
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
    if (args.length > 2 && args[2].equals("display"))
      System.out.println("sorted: " + Arrays.toString(arr));
  }
}
