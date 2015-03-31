import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
        int numCases = Integer.parseInt(kb.nextLine());
        for (int i =0; i < numCases; i++)
        {
            String[] array = kb.nextLine().split(" ");
            int n = Integer.parseInt(array[0]);
            int k = Integer.parseInt(array[1]);
            
            String[] students = kb.nextLine().split(" ");
            int onTime = 0;
            for (int j = 0; j < students.length; j++)
            {
                if (Integer.parseInt(students[j])<=0)   
                    onTime++;
            }
            if (onTime >= k)
                System.out.println("NO");
            else
                System.out.println("YES");
            
            
        }
    }
}