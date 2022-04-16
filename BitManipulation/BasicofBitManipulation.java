import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();
    
    // String bin = Integer.toBinaryString (n);
    int mask = 1;
    System.out.println((mask << i) | n);
    System.out.println((~(mask << j)) & n);
    System.out.println((mask << k) ^ n);
    System.out.println(((mask << m) & n) != 0);
  }

}
