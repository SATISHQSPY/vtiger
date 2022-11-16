package Collection;

import java.util.LinkedHashSet;

public class NON_Duplicate_charecter {




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
			{
				int Count=0;
			for (int i=0;i<str.length;i++)
				
				{
				if (lset.equals(str[i]))
				{
					Count++;
					
				}
				
				}
			if (Count>1)
			System.out.println(lset+" "+Count);

			}

			
			}


		}





