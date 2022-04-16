import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int mask = 1;
    // System.out.println((mask & n) == 0);
    while((mask & n) == 0){
        mask = mask << 1;
        
    }
   
    System.out.println(Integer.toBinaryString(mask));
  }

}
