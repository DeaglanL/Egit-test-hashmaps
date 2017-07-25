package HashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

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
    		if(words.containsKey(sorted))
    		{
    			words.get(sorted).add(i);
    		}
    		else
    		{
    		    words.put(sorted, new ArrayList<String>());
    		    words.get(sorted).add(i);
    		}
    	}
    	
    	int longest = 0;
    	String most = null; 
    	String equalMost = null; 
    	for (String i: words.keySet()) 
    	{
    		if(words.get(i).size() >= longest)
    		{
    		    if(words.get(i).size() == longest && i.length() > most.length()) {
    			longest = words.get(i).size();
    			most = i;
    			}
    		    else if(words.get(i).size() == longest && i.length() == most.length())
    		    {
    		    	equalMost = i; 
    		    }
    		    else
    		    {
    		    	longest = words.get(i).size();
        			most = i;
    		    }
    		}
    	}
    	if (most != null && equalMost != null)
    	{
    		System.out.println("The word with the most anagrams is " + most + " and " + equalMost +  " with " + longest + " words");
    	}
    	else
    	{
    		System.out.println("The word with the most anagrams is " + most + "with " + longest + " words");
    	}
    	
    }
	
    
    public String stringSort(String input)
    {
    	char[] chars = input.toCharArray(); 
    	
    	Arrays.sort(chars);
    	
    	return new String(chars);
    }
    

}
