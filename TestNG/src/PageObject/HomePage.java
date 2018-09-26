package PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
public HomePage(AppiumDriver driver) 
	{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Text\"]")
public WebElement Text;


@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Accessibility\"]")
public WebElement Accessibility;


@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Animation\"]")
public WebElement Animation;

@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"App\"]")
public WebElement App;

@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Content\"]")
public WebElement Content;

@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Graphics\"]")
public WebElement Graphics;

@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Media\"]")
public WebElement Media;

@AndroidFindBy(xpath="	//android.widget.TextView[@content-desc=\"NFC\"]")
public WebElement NFC;

@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"OS\"]")
public WebElement OS;

@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Preference\"]")
public WebElement Preference;

@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Views\"]")
public WebElement Views;






}


