package Collection;

import java.util.LinkedHashSet;

public class WithoutduplicatePRINT_Charecter {



		public static void main(String[] args) {

				String s= "welcome to india welcome to tyss";
				
				String[] str = s.split(" ");
				LinkedHashSet <String>ls = new LinkedHashSet<>();
				for (int i=0;i<str.length;i++)
				{
					ls.add(str[i]);
				}
				System.out.println(ls);
			for (String lset:ls)
			System.out.print(lset+" ");

			}

			
			}


		





