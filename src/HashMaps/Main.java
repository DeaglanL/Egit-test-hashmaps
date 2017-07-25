package HashMaps;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = "/home/deaglanl/words.txt";
		String stringFromFile = null;
		String[] splitString;
		try {
			stringFromFile = Deaglan.readFileToString(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stringFromFile = stringFromFile.replaceAll(" ", "");
		splitString = stringFromFile.split("\n");
		
		StringOrganiser sO = new StringOrganiser(splitString); 
		
		System.out.println(sO.stringSort(splitString[0]));
	}

}
