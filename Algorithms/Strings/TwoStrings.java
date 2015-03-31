import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
        int num = Integer.parseInt(kb.nextLine());
        //iterate over smaller string
        //don't iterate over repeat occurrences of charatcer
        for (int i = 0;i < num; i++)
        {
            String a = kb.nextLine();
            String b = kb.nextLine();
            boolean similar = false;
            HashSet<Character> container = new HashSet<>();
            if (a.length() < b.length())
            {
                 for (int j = 0; j < a.length(); j++)
                 {
                     if (container.contains(a.charAt(j)))
                         continue;
                     else
                     container.add(a.charAt(j));
                   if (b.indexOf(a.charAt(j))!=-1)
                    {
                      similar = true;
                        break;
                    }
                }
            }
           else
            {
                 for (int j = 0; j < b.length(); j++)
                 {
                   if (container.contains(b.charAt(j)))
                         continue;
                     else
                     container.add(b.charAt(j));
                   if (a.indexOf(b.charAt(j))!=-1)
                    {
                      similar = true;
                        break;
                    }
                }
            }
            
            if (similar)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}