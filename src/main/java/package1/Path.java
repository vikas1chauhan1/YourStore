package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Path {

	public WebDriver driver;

	public Path(WebDriver driver) {
		this.driver = driver;
	}

	By Desktops = By.linkText("Desktops");
	By Mac = By.linkText("Mac (1)");

	By AddCart = By.xpath("//span[text()='Add to Cart']");
	By PhonesPDA = By.linkText("Phones & PDAs (3)");

	By CartItem = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
	By ViewCart = By.xpath("//*[text()=' View Cart']");

	By Quantity = By.xpath("//td[contains(text(),'Product 14')]/following-sibling::td/div/input");
	By Update = By.xpath("//tr[2]//td[4]//div[1]//span[1]//button[1]");

	By Delete = By.xpath("//button[@data-original-title='Remove']");

	By MacPage = By.xpath("//h2[contains(text(),'Mac')]");

	By TotalProduct = By.xpath("//div[@class='product-thumb']");

	By ItemInCart = By.xpath("//td[@class='text-left']");

	By NoOfItem = By.xpath("//td[@class='text-right']");
	By SuccessMsg = By.xpath("//div[@class='alert alert-success alert-dismissible']");

	By IphoneINcart = By.xpath("//a[text()='iPhone']");

	public WebElement getDesktops() {
		return driver.findElement(Desktops);
	}

	public void getMac() {
		driver.findElement(Mac).click();
	}

	public List<WebElement> getAddCart() {
		return driver.findElements(AddCart);
	}

	public WebElement getPhonesPDA() {
		return driver.findElement(PhonesPDA);
	}

	public WebElement getCartItem() {
		return driver.findElement(CartItem);
	}

	public void getViewCart() {
		driver.findElement(ViewCart).click();
	}

	public WebElement getQuantity() {
		return driver.findElement(Quantity);
	}

	public void getUpdate() {
		driver.findElement(Update).click();
	}

	public void getDelete() {
		driver.findElement(Delete).click();
	}

	public WebElement getMacPage() {
		return driver.findElement(MacPage);
	}

	public List<WebElement> getTotalProduct() {
		return driver.findElements(TotalProduct);
	}

	public List<WebElement> getItemInCart() {
		return driver.findElements(ItemInCart);
	}

	public List<WebElement> getNoOfItem() {
		return driver.findElements(NoOfItem);
	}

	public WebElement getSuccessMsg() {
		return driver.findElement(SuccessMsg);
	}

	public void getIphoneINcart() {
		driver.findElement(IphoneINcart).isDisplayed();
	}

}
