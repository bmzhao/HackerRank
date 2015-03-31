import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       String[] firstLine = kb.nextLine().split(" ");
       int n = Integer.parseInt(firstLine[0]);
       int m = Integer.parseInt(firstLine[1]);
       long total = 0;
       for (int i =0; i < m; i++)
       {
           String[] current = kb.nextLine().split(" ");
           total += (Integer.parseInt(current[1]) - Integer.parseInt(current[0]) + 1) * Long.parseLong(current[2]);
       }
       System.out.println(total/n);
    }
}