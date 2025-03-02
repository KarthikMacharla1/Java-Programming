package string;

public class SumofDigits {
        public static int sumofdigits(String s) {
        	int sum=0;
        	for(int i=0;i<s.length();i++) {
        		char ch=s.charAt(i);
        		if(Character.isDigit(ch)) {
        			sum=sum+Character.getNumericValue(ch);
        			
        		}
          
        	}
        	return sum;
        }
        public static void palindrom(int sum) {
        	int temp=sum;
        	int check=0;
        	while(temp>0) {
        		int ld= temp%10;
        		check=check*10+ld;
        		temp/=10;
        		
        	}
			if (sum==check) {
				System.out.println("The number is an Palindrom number");
			}
			else {
				System.out.println("not a Palindrom");
			}
        	
        }
        public static void main(String[] args) {
			String s="j12s345p";
			int sum=sumofdigits(s);
			palindrom(sum);
			
		}
}
