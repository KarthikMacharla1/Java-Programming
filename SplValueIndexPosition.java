package string;

public class SplValueIndexPosition {
  public static void main(String[] args) {
		String s="HYD@$%-erab!%ad";
		String s1="";
		String special="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch)||Character.isDigit(ch))
			{
				
			}
			else
			{
				special=special+ch;
				
			}
			
		}
		System.out.println("the Special Char's are :"+special);
	}

}
