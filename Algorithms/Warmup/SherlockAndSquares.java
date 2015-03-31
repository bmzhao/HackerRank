import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        for (int i =0; i < n; i++)
        {
            String[] current = kb.nextLine().split(" ");
            int upper = (int)Math.floor(Math.sqrt(Integer.parseInt(current[1])));
            int lower = (int)Math.ceil(Math.sqrt(Integer.parseInt(current[0])));
            System.out.println(upper-lower+1);
        }
        
    }
}