import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       int numberSticks = Integer.parseInt(kb.nextLine());
       HashMap<Integer, Integer> numbers = new HashMap<>();
       PriorityQueue<Integer> heap = new PriorityQueue<>();
       for (int i = 0; i < numberSticks; i++)
       {
           int current = kb.nextInt();
           if (numbers.containsKey(current))
               numbers.put(current,numbers.get(current)+1);
           else
               numbers.put(current,1);
           heap.add(current);
       }
       while (!heap.isEmpty())
       {
           int cut = 0;
           int smallest = heap.poll();
           HashMap<Integer,Integer> nextNumbers = new HashMap<>();
           for (int number: numbers.keySet())
           {
               cut += numbers.get(number);
               if (number - smallest > 0)
                   nextNumbers.put(number-smallest,numbers.get(number));
           }
           numbers = nextNumbers;
           System.out.println(cut);
           heap = new PriorityQueue(numbers.keySet());
       }
        
    }
}