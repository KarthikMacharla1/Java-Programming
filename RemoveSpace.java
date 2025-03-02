package string;

public class RemoveSpace {
  public static void main(String[] args) {
	String s="ja va";
	char oldchar=' ';
	String newchar="";
	String res="";
	for (int i=0;i<=s.length()-1;i++) {
		char ch=s.charAt(i);
		   if(ch==oldchar) {
					res=res+newchar;
			}
		   else
		   {
			   res=res+s.charAt(i);
		   }
	}
	System.out.println(res);
	
	
	
}
}
