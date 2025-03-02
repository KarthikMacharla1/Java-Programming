package string;

public class ReverseofaString {

	public static void main(String[] args) {
		String s="I am an Indian";
		String[] str=s.split(" ");
		for (int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]);
		}
		
		
	}
}
