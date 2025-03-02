package string;

public class DuplicateString {
 public static boolean isEmpty(String s) {
	 if(s.length()==0) {
		 return false;
	 }
	 else {
		 return true;
	 }
 }
public static void dublicate(String s) {
	
	String s1="";
	for (int i=0;i<=s.length()-1;i++) {
		char ch=s.charAt(i);
		if (s1.indexOf(ch)==-1) {
			s1=s1+ch;
		}
	}
	System.out.println("unique String: "+s1);
	}
public static void main(String[] args) {
	String s="java";
	
		dublicate(s);
	
	
	
}
 
}
