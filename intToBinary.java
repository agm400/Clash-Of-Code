import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
String x = Integer.toBinaryString(n);

//converts int to bin string
int y=0;
for(int i=0;i<x.length();i++){
    if(x.charAt(i)=='1'){
        y++;
        
    }
}
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
if(y==x.length()){
        System.out.println("true");
        
}
else{
    System.out.println("false");
}
    }
}