
public class FastModExp {

  public static int fastModExp(int x, int y, int m) {
    
    if (y % 2 == 0) {
      if (y == 0) {
        return 1;
      }
      else {
        return fastModExp(x*x, y/2, m) % m;
      }
    }
    else if (y % 2 != 0) {
      if (y == 0) {
        return 1;
      }
      else {
        return (x * fastModExp(x, y-1, m)) % m;
      }
    }
    return 0;

    
  } //fastModExp
  
  
  public static void main (String[] args) {
    
    int i = 1;
    int j = 2;
    int k = 3;
    
    System.out.println(fastModExp(i, j, k));
   // System.out.println(1 % 3);
    
  }//main

} //class
