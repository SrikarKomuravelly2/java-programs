package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfEachCharacter {
	
	public static void main(String[] args) {
		
		String s1="sriikkarr";
		
		countingCharacters(s1);
		
	}

	
	
	public static void countingCharacters(String s1) {
		
		Map<Character, Integer> maps= new HashMap<Character, Integer>();
		
		for(char c: s1.toCharArray())
		{
			
			if(maps.containsKey(c))
			{
				maps.put(c,maps.get(c)+1);
			}
			else
			{
				maps.put(c, 1);
			}
		}
		System.out.println(maps);
		
	}

}
