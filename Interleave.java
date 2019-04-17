import java.util.Arrays;

public class Interleave {

  public static int[] interleave(int[] arr1, int[] arr2) {

    // check for the length that is smaller of the two
    // keep going on the for loop until the minimum length is reached
    // fill in the rest of the new array with

    int len = arr1.length + arr2.length;
    int[] newArray = new int[len];
    int smallerLen = 0;
    int largerLen = 0;
    int i = 0;
    int x = 0;
    int[] restArr = null;

    if (arr1.length < arr2.length) {
      smallerLen = arr1.length;
      largerLen = arr2.length;
      restArr = arr2;
    } else if (arr1.length > arr2.length) {
      smallerLen = arr2.length;
      largerLen = arr1.length;
      restArr = arr1;
    } else {
      smallerLen = arr1.length;
    }

    for (i = 0; i < 2 * smallerLen; i++) {

      newArray[i] = arr1[x];
      newArray[++i] = arr2[x];
      x++;
    }
    for (int y = x; y < largerLen; y++) {
      newArray[i] = restArr[y];
      i++;
    }

    return newArray; // ???????

  } // method


  public static void main(String[] args) {

    int[] array1 = {1, 2, 3, 4, 5};
    int[] array = {10, 11, 12};

    System.out.println(Arrays.toString(interleave(array, array1)));

  }

} // class

// Citation: Kedamawit Habte
