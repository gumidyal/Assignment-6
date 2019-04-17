
public class ConcatReplicate {
  
  
  public static String concatAndReplicateAll(String[] arr, int n) {
    
    String str = "";
    
    for (int i = 0; i < arr.length; i++) {
      
      for (int j = 0; j < n; j++) {
        
       str = str + arr[i];
  
      } //for 
      
    } // for
    
    return str;
    
  }// method
 
  public static void main (String[] args) {
    
    String[] array = { "i", "am", "tired" };
    
    System.out.println(concatAndReplicateAll(array, 3));
    
  } //main
  

} //class
//Citation: Kedamawit Habte