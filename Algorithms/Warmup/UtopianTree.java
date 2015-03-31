import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {
    public static HashMap<Integer, Integer> memo;
    public static int UtopiaTree(int a)
    {
        if (memo.containsKey(a))
            return memo.get(a);
        else if (a == 0)
        {
            memo.put(0,1);
            return 1;
        }
        else if (a%2 == 1)
        {
            int answer = 2*UtopiaTree(a-1);
            memo.put(a,answer);
            return answer;
        }
        else
        {
            int answer = UtopiaTree(a-1)+1;
            memo.put(a,answer);
            return answer;
        }
        
    }
    
    
    public static void main(String[] args) {
        memo = new HashMap<>();
        Scanner s = new Scanner(System.in);
        int lines = Integer.parseInt(s.nextLine());
        for (int i =0; i < lines; i++)
        {
            int current = Integer.parseInt(s.nextLine());
            System.out.println(UtopiaTree(current));
        }
        
        
    }
}