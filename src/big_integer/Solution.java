package big_integer;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	BigInteger a = new BigInteger(in.next());
    	BigInteger b = new BigInteger(in.next());
    	
    	System.out.println(a.add(b));
    	System.out.println(a.multiply(b));
    }
}

