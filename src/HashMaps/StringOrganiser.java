package HashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class StringOrganiser {
	String[] input; 
	ArrayList<String> anagrams = new ArrayList<String>();
    HashMap<String, ArrayList<String>> words = new HashMap<String, ArrayList<String>>();
    String sorted; 
    
    
    public StringOrganiser(String[] input)
    {
    	this.input = input; 
    	
    	for (String i : input)
    	{
    		sorted = stringSort(i);
    		if(words.containsKey(i))
    		{
    			words.get(i).add(i);
    		}
    		else
    		{
    		    words.put(i, value)
    		}
    	}
    }
	
    
    public String stringSort(String input)
    {
    	char[] chars = input.toCharArray(); 
    	
    	Arrays.sort(chars);
    	
    	return new String(chars);
    }
    

}
