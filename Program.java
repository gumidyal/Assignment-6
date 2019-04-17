
public class Program {

  public static IntPair[] allPairs(int arr[]) {

    if (arr == null) {
      throw new IllegalArgumentException();
    } else {
 
      IntPair[] newArray = new IntPair[arr.length * arr.length];

      int k = 0;
      
      for (int i = 0; i < arr.length; i++) {
        
        int first = arr[i];
        
        for (int j = 0; j < arr.length; j++) {
          
          IntPair pair = new IntPair(first, arr[j]);
          
          newArray[k] = pair;
          k++;
          
        } //for
        
      } //for
      
      return newArray;
      
    }//else
    
  } //allPairs method
   
  public static void main (String[] args) {
    int[] arr = {1, 2, 3};
    IntPair[] intpair = allPairs(arr);
    
    for (int i =0; i< intpair.length; i++) {
      System.out.println(intpair[i].getFst() + "," + intpair[i].getSnd());
    }
   
  }
  
}// Program class

//Citation: Kedamawit Habte
