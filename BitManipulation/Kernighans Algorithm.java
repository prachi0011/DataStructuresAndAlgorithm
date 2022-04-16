import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int mask = 1;
    int count=0;
   for(int i=0; i<=32;i++){
       if((mask & n) != 0){
           count += 1;
        //   System.out.println(count);
       }
       mask = mask << 1;
   }
   System.out.println(count);
  }

}
