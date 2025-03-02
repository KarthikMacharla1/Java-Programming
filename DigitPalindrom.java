package string;

public class DigitPalindrom {

	public static void main(String[] args) {
		String s="j12s345p";
		String s1="";
		for (int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
				s1=s1+ch;
			}
		}
	    int num=Integer.parseInt(s1);
	    System.out.println(num);
	    int sum=0;
	    int temp=num;
	    while(temp>=0) 
	    {
	    	int digit=temp%10;
	    	sum+=digit;
	    	temp/=10;
	    }
		System.out.println(sum);
		int rever=0;
		temp=num;
		while(temp>0) {
			int ld=temp%10;
			rever=rever*10+ld;
			temp/=10;
			
		}
		if(sum==rever) {
			System.out.println("it is a Palindrom");
		}
		else
		 {
			System.out.println("it is a Palindrom");
		}
			
	
	}
}
































