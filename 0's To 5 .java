// { Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}


class GfG {
    int convertfive(int num) {
        // Your code here
        String str = Integer.toString(num);
        String replace_string = str.replace("0","5");
        int x = Integer.parseInt(replace_string);
        return x;
       
    }
}
