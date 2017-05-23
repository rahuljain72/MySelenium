package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class EnterTimeTrackPage extends BasePage {
	@FindBy(id="logoutLink")
	private WebElement logoutLNK;

	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickLogout(){
		logoutLNK.click();
	}

}
