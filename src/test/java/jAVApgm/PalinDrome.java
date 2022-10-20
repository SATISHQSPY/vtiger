package jAVApgm;

public class PalinDrome {

	public static void main(String[] args) {
		int num=313;
		int sum=0;
		int rem=0;
		int temp=num;
		 while(num>0)
		 {
			 rem=num%10;
			 sum=sum*10+rem;
			 num=num/10;
		 }
	
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("NOT palindrome");
		}
	}

}
