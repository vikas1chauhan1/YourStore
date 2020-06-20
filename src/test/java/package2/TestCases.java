package package2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import package1.Path;
import package1.base;

public class TestCases extends base {
	public WebDriver driver;

	@BeforeTest
	public void UrlLaunch() throws IOException {
		driver = BaseMethod();
		driver.get(prop.getProperty("url"));
	}

	@SuppressWarnings("unused")
	@Test
	public void TestC() throws InterruptedException {
		Path p = new Path(driver);

		Actions a = new Actions(driver);
		a.moveToElement(p.getDesktops()).build().perform();

		p.getMac();

		int MacCount = 1;

		p.getMacPage();
		System.out.println("Verified that desired product page is open");

		p.getAddCart().get(0).click();

		p.getCartItem().isDisplayed();
		System.out.println("Cart button, Number of Item and price is getting reflected");


		p.getPhonesPDA().isDisplayed();
		System.out.println("link ‘Phones & PDAs’ is displayed on page");

		p.getPhonesPDA().click();
		int PhonePDACount = 3;

		int ProductList = p.getTotalProduct().size();

		if (PhonePDACount == ProductList) {
			System.out.println("number of products getting displayed on page against the stored count is same");
		} else {
			System.out.println("number of products getting displayed on page against the stored count is not same");
		}

		p.getAddCart().get(1).click();
		String cartItem1 = p.getCartItem().getText();
		System.out.println("previous cart item = " + cartItem1);
		p.getCartItem().isDisplayed();
		System.out.println("updated item count and price on Cart button, is getting reflected");

		Thread.sleep(2000);
		p.getCartItem().click();

		for (int i = 0; i < 4; i++) {
			boolean value = p.getNoOfItem().get(i).isDisplayed();
			System.out.println(value);
		}

		p.getViewCart();
		String actualMsg1 = p.getQuantity().getAttribute("value");
		System.out.println("Previous quantity is = " + actualMsg1);
		p.getQuantity().clear();
		p.getQuantity().sendKeys("2");
		p.getUpdate();

		String actualMsg = p.getSuccessMsg().getText();
		Assert.assertTrue(actualMsg.contains("Success: You have modified your shopping cart!"));
		System.out.println("Verified Shopping cart modification success message");

		String actualMsg2 = p.getQuantity().getAttribute("value");
		System.out.println("New quantity is = " + actualMsg2);
		if (actualMsg2.contains(actualMsg1)) {
			System.out.println("New Quantity is not updated");
		}

		else {
			System.out.println("New Quantity is updated");
		}

		p.getDelete();

		p.getIphoneINcart();
		System.out.println("Verified the cart is updated and Removed product is not listed in cart");

		String cartItem2 = p.getCartItem().getText();
		System.out.println("New cart items = " + cartItem2);
		if (cartItem2.equalsIgnoreCase(cartItem1)) {
			System.out.println("The Cart button is not updated with new item count and price");
		}

		else {
			System.out.println("The Cart button is updated with new item count and price");
		}

	}

}
