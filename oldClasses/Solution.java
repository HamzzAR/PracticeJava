import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	int squigglybracket,sb2,curlybracket,cb2,squarebracket,psb2;
	    squigglybracket = 0;
    	curlybracket = 0;
    	squarebracket = 0;
    	boolean output = false;
			
    		
    	squigglybracket = recorsion("{");
   
    	System.out.println(squigglybracket);
    	
    }

	    public static int recorsion(String a){
	    	
	    	String input = "{}({}){{";
	    	int bracket = 0;
	    	for (int x=0; x<1; x++) {

	    		String t = input.substring(x,x+1);
	    		if (t.equals(a)) {
	    			for (int i=x ; i<input.length(); i++) {
	    			if (input.substring(i,i+1).equals(t)) {
	    				bracket++;
	    				System.out.println("Second for");
	    			}
				}
	    	}
	   	}

	   		return bracket;
	}

}
