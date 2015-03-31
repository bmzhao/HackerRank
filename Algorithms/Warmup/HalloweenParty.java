import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numLines = Integer.parseInt(kb.nextLine());
        HashMap<Integer,Integer> memos = new HashMap<Integer,Integer>();
        for (int i = 0; i < numLines; i++)
        {
            int input = Integer.parseInt(kb.nextLine());
            System.out.println(answer(input));
        }

    }

    /*
    public static int answer(HashMap<Integer,Integer> memo, int input)
    {
        int returnvalue;
        if (memo.containsKey(input)) 
              return memo.get(input);
        else if (input <= 1)
        {
            returnvalue = 0;
            memo.put(input,returnvalue);
            return returnvalue;            
        }
        else
        {
            returnvalue = answer(memo,input-1)+input/2;
            memo.put(input,returnvalue);
            return returnvalue;
        }
    }*/
    public static BigInteger answer(int input)
    {
        if (input == 1)
            return new BigInteger("1");
        else if (input == 2)
            return new BigInteger("2");
        else if (input %2 == 0)
        {
            String stringInput = new Integer(input/2).toString();
            BigInteger temp = new BigInteger(stringInput);
            return temp.multiply(temp);
        }
        else
        {
            BigInteger toReturn = answer(input-1);
            return toReturn.add(new BigInteger(new Integer(input-1).toString()).divide(new BigInteger("2")));
            
        }
    }
}