
public class Contains {
  
  public static boolean contains (double dubs[], double eps, double d) {
    
    int match = 0;
    
    
    for (int i = 0; i < dubs.length; i++) {
      
      if (java.lang.Math.abs(dubs[i] - d) < eps) {
        match++;
      }
           
    } //for
    
    return (match != 0);
   
  } //contains method

  public static void main (String[] args) {
    double arr[] = {1.0, 2.0, 3.0};
    double val = 4.0;
    double c = 0.5;
    
    System.out.println(contains(arr, val, c));
    
    
  }
  
} //class
