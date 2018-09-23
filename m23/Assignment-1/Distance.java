/**
 ******************************************************************************
 *                    HOMEWORK, 15-121
 ******************************************************************************
 *                  THE DOCUMENT DISTANCE
 ******************************************************************************
 *
 * The document distance problem is the problem of computing the distance
 * between two given text documents.
 *
 * The distance between two documents is the angle between their word
 * frequency vectors.
 *
 *
 *****************************************************************************/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.*;
import java.net.*;

public class Distance {
	private  String REGEX = "[^a-zA-Z0-9_ ]";
	String s;
	int count = 0;
	static int wordsCount = 0;
	int wordCountOne = 0;
	File file;
	Distance(File item) {
		this.file = item;
		file();
	}
	HashMap<String, Integer> name = new HashMap<String, Integer>();
	ArrayList<String> str = new ArrayList<String>();
	ArrayList<String>str1 = new ArrayList<String>();
	public void file() {
		try {
			int size = 0;
			Scanner scan = new Scanner(file);
			scan.useDelimiter("\n");
			while (scan.hasNext()) {
				s = scan.nextLine();
				Pattern p = Pattern.compile(REGEX);
                //System.out.println("Pattern..." +p);
				// get a matcher object
				Matcher m = p.matcher(s);
				//System.out.println("matcher.."+m);
				s = m.replaceAll(" ").toLowerCase();
				//System.out.println("String..." +s);
				String[] words = s.split(" ");
				StringTokenizer tokens = new StringTokenizer(s);
				wordCountOne += tokens.countTokens();
				addWords(words);
				count++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void addWords(String[] words) {
		for (int i = 0; i < words.length; i++) {
			if (!(words[i].equals(""))) {
				if (name.containsKey(words[i])) {
					name.put(words[i], name.get(words[i]) + 1);
				} else {
					name.put(words[i], 1);
				}
			}
		}
		// return name;
	}
	public double ecludian() {
		double sum = 0;
		for (String key : name.keySet()) {
			sum += name.get(key) * name.get(key);
		}
		return sum;
	}
	
	public int getNumOfLines() {
		return count;
	}
	public int getNumOfWords() {
		return str.size();
	}
}
class Words {
	String word;
	int count;
	Words(String word1, int count1) {
		// System.out.println(word1 + " " + count);
		this.word = word1;
		this.count = count1;
	}
	public String getWord() {
		return this.word;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount() {
		this.count += 1;
	}
}