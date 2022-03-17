package string;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String str1="abcd";
	String str2="ABCD";
	str1=str1.toLowerCase();
	str2=str2.toLowerCase();
	if(str1.length()==str2.length()) {
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
if(Arrays.equals(ch1, ch2)) {
	System.out.println(str1+ " and " + str2 + " are anagram " );
}
else {
	System.out.println(str1+" and " +str2+ " are not anagram " );
	
}
}
}
}