/**
 * .
 *
 * @author xxxx, jj.mm.yyyy
 * @version 1.0
 */
public class Exercice2 {

  public static void main (String[] args) {
    int i=0, total=0;
    int n = Integer.parseInt(args[0]);
    if (n<0) { 
      System.out.println("La valeur doit être positive ou nulle");
    }
    else {
      while (i<=n) {
      total=i + total;
      i++;
      }
    }
      System.out.println(total);
    
  } // main

} //
