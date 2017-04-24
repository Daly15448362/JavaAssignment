package prototype4;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
 
	public static void main(String[] args)throws Exception {
	FileReader fl = new FileReader("Badwords.txt");
	BufferedReader bb = new BufferedReader(fl);
	String search;
	
	String key = "dick";
	while((search=bb.readLine()) != null)
	{
		if(search.contains(key))
		{
			
			System.out.println(search);
		}
		}
	}	
}
