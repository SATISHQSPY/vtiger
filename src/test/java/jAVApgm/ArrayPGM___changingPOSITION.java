package jAVApgm;

public class ArrayPGM___changingPOSITION {
public static void main(String[] args) {
	int a[]= {3,2,1,5,4};
	int key=2;
	for(int i=0;i<key;i++)
	{
		int temp=a[0];
		for (int j=1;j<a.length;j++)
		{
			a[j-1]=a[i];
		}
		a[a.length-1]=temp;
		

for (int j=1;j<a.length;j++)
System.out.println(a[i]+" ");
	}
}
}

