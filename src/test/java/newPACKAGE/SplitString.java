package newPACKAGE;

public class SplitString {
public static void main(String[] args) {
	String s = "bahubali balladeva devsena";
	String[] str = s.split(" ");
	String[] str1 = s.split("b");
	for (int i=0; i<str.length;i++)
	{
		System.out.println(str[i]);//Split the string
		System.out.println(str1[i]);
	}
}
}
