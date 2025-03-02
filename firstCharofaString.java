package string;

public class firstCharofaString {
  public static void main(String[] args) {
	String s="This is Hyd place";
	String[] str=s.split(" ");
	for (int i=0;i<=str.length-1;i++) {
		System.out.println(str[i].charAt(0));
	}
}
}


