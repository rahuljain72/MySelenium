package Test;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Excel1;
import pom.LoginPage;

public class InvalidLogin extends BaseTest{
	@Test(priority=3)
	public void testInvalidLogin() {
		String un=Excel1.getCellData(INPUT_PATH,"InvalidLogin",1,0);
		String pw=Excel1.getCellData(INPUT_PATH,"InvalidLogin",1,1);
		//enter invalid un
		LoginPage l=new LoginPage(driver);
		l.setUsername(un);
		//enter invalid pwd
		l.setPassword(pw);
		//click login
		//verify err msg is displayed
		l.verifyErrMsgpresent();
	}

}
