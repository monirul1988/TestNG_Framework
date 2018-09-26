package PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Homepage_Text {

	public Homepage_Text(AppiumDriver driver) 
	{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
       @AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Linkify\"]")
	   public WebElement Linkify;
       
       @AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"LogTextBox\"]")
	   public WebElement LogTextBox;
       
       @AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Marquee\"]")
	   public WebElement Marquee;
       

}
