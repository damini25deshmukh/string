package string;

public class StringPalindrome{
	 public static void main(String[] args) {
		String s="ABBA";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
			if(s.equals(reverse)) {
				System.out.println("the given String is palindrome " +s);
			}
			else {
				System.out.println("the given String is not palindrome "+s);

			}
		}

	 }
	
