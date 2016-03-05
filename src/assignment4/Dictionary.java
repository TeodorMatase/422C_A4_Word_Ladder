/**
 * @author Teo Matase
 * @author Royce Li
 * Dictionary Class holds all 5 letter english words
 */

package assignment4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;


public class Dictionary {
	public ArrayList<String> TrueDictionary;
	public int length;
 	@SuppressWarnings("resource")
	public Dictionary(String arg){
 		TrueDictionary = new ArrayList<String>();
 		this.length = 0;
 		String filename = arg.trim();
 		String line = null;
		try {
			FileReader in = new FileReader(filename);
			BufferedReader reader = new BufferedReader(in);
			while((line = reader.readLine()) != null){
				if(line.charAt(0) == '*'){
					continue;
				}
				this.TrueDictionary.add(line.substring(0, 5));
				length++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dictionary file not found\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
 	
 	/* @param String x, word to search for in dictionary
 	 * @param return, true if word exists in dictionary, false if it doesn't
 	 */
 	public boolean search(String x){
 		return TrueDictionary.contains(x);
 	}
}
