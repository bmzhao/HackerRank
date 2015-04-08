import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int p = Integer.parseInt(kb.nextLine());
        int q = Integer.parseInt(kb.nextLine());
        String answer = "";
        for (int i = p; i <= q; i++)
        {
            if (calculate(i))
                answer += i + " ";
        }
        if (answer.equals(""))
            System.out.println("INVALID RANGE");
        else
            System.out.println(answer);
    }
    
     public static boolean calculate(long i)
    {
        long digits = Long.toString(i).length();
        long square = i * i;
        String squareString = Long.toString(square);
        int right = Integer.parseInt(squareString.substring(squareString.length()- (int) digits,squareString.length()));
        String leftString = squareString.substring(0,squareString.length()- (int) digits);
        int left;
        if (leftString.equals(""))
            left = 0;
        else
            left = Integer.parseInt(leftString);
        return (left + right == i);

    }
}