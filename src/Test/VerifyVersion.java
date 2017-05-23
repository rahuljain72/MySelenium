package Test;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Excel1;
import pom.LoginPage;

public class VerifyVersion extends BaseTest{
	@Test(priority=1)
	public void testVersion() {
		String eVersion=Excel1.getCellData(INPUT_PATH,"VerifyVersion",1,1);
		//veify version is v.3.3
		
		LoginPage l=new LoginPage(driver);
		l.verifyVersion(eVersion);
	}

}
