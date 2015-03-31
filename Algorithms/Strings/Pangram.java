import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String current = kb.nextLine().toLowerCase();
        boolean isPangram = true;
        for (char iterator = 'a'; iterator <= 'z'; iterator++){
            if (current.indexOf(iterator) == -1)
                {
                isPangram = false;
                break;
            }
        }
        if (isPangram)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
    }
}