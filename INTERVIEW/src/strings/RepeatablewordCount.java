package strings;

import org.apache.commons.lang3.StringUtils;

public class RepeatablewordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hi hi hi deepak. How are you you ha ha";
		int repWordCount=0;
		int distinctwords=0;
		String[] words = str.split(" ");
		System.out.println("Total no of words in string "+words.length);
		
		for(int i=0; i<words.length; i++) {
			for(int j=i+1; j<words.length; j++)
			if(words[i].equals(words[j])) {
				repWordCount++;
			}
			else {
				distinctwords++;
			}
		}
		System.out.println("No of repeatable words is : "+repWordCount);
		System.out.println("Distinct words : "+distinctwords);
		
		for(int i=0; i<words.length; i++) {
			System.out.println(StringUtils.countMatches(str, words[i]));
		}
	}

}
