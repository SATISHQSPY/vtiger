package tESTNGpavanSir;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider = "getData")
	public void bookingTickets(String src, String dest) {
		System.out.println(src + "--->" + dest);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] arr = new Object[3][2];
		arr[0][0] = "HYD";
		arr[0][1] = "BNG";

		arr[1][0] = "MUB";
		arr[1][1] = "LKN";

		arr[2][0] = "KOL";
		arr[2][1] = "BUN";

		return arr;
	}

}
