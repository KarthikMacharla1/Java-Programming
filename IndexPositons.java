package string;

public class IndexPositons {
  public static void main(String[] args) {
	  String s="I am an Developer";
	   for (int i=0;i<=s.length()-1;i++) {
		   char ch=s.charAt(i);
		if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
		     System.out.print(i);
		}
	   }

}}
