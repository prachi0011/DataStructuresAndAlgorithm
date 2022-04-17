import java.util.*;

public class Main {

  public static int decimal(String binaryString){
    //   String binaryString = "101000";
        double convertedDouble = 0;

        for (int i = 0; i < binaryString.length(); i++) {

            if (binaryString.charAt(i) == '1') {
                int len = binaryString.length() - 1 - i;
                convertedDouble += Math.pow(2, len);
            }
        }

        int convertedInt = (int) convertedDouble;
        return convertedInt;
  }
  public static List<Integer> grayCode(int n) {
      if(n == 0){
          List<Integer> bres = new ArrayList<>();
        bres.add(0);
        return bres;
      }
    if(n == 1){
        List<Integer> bres = new ArrayList<>();
        bres.add(0);
        bres.add(1);
        return bres;
    }
    List<Integer> nres = grayCode(n-1);
    List<Integer> mres = new ArrayList<>();
    for(int i=0; i < nres.size(); i++){
        
        String bin = Integer.toBinaryString(nres.get(i));
        String resultWithPadding =  String.format("%" + (n-1)+ "s", bin).replaceAll(" ", "0") + "0";
        // System.out.println(decimal(resultWithPadding));
        mres.add(decimal(resultWithPadding));
    }
    for(int i=nres.size()-1; i >= 0; i--){
        
        String bin = Integer.toBinaryString(nres.get(i));
        String resultWithPadding = String.format("%" + (n-1)+ "s", bin).replaceAll(" ", "0") + "1";
        // System.out.println(decimal(resultWithPadding));
        mres.add(decimal(resultWithPadding));
    }
    return mres;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    List<Integer> ans = grayCode(scn.nextInt());
    Collections.sort(ans);
    System.out.println(ans);
  }
}
