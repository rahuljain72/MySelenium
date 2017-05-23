package Test;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Excel1;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends BaseTest {
	@Test(priority=2)
	public void testValidLoginLogout(){
		String un=Excel1.getCellData(INPUT_PATH,"ValidLoginLogout",1,0);
		String pw=Excel1.getCellData(INPUT_PATH,"ValidLoginLogout",1,1);
		String hpTitle=Excel1.getCellData(INPUT_PATH,"ValidLoginLogout",1,2);
		String lpTitle=Excel1.getCellData(INPUT_PATH,"ValidLoginLogout",1,3);
		
		//Enter valid un
		LoginPage l=new LoginPage(driver);
		l.setUsername(un);
		//Enter valid pw
		l.setPassword(pw);
		//click login
		l.clickLogin();
		//verify HP
		
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		//click Logout
		e.verifyTitle(hpTitle);
		//clickLogout
		e.clickLogout();
		//verify LP
		l.verifyTitle(lpTitle);
	}

}
