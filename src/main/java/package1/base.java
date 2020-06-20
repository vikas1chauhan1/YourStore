package package1;

import java.io.FileInputStream; 
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
    public WebDriver BaseMethod() throws IOException
    {
    	
    	FileInputStream fis=new FileInputStream("C:\\Users\\vikas_000\\eclipse-workspace1\\YourStore\\src\\main\\java\\package1\\data.properties");
    			
    	prop=new Properties();
    	
    	prop.load(fis);
    	
   String browserName	= prop.getProperty("browser");
    	
   if(browserName.equals("chrome"))
	{
     System.setProperty("webdriver.chrome.driver","D:\\JAVA\\chromedriver_win32\\chromedriver.exe");
     driver=new ChromeDriver();
    
	}
	else if (browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","D:\\JAVA\\geckodriver-v0.26.0-win64 (1)\\geckodriver.exe");
	  driver=new FirefoxDriver();
	}
	else if (browserName.equals("ie"))
	{
		System.setProperty("webdriver.ie.driver", "D:\\JAVA\\IEDriverServer_x64_3.150.1 (1)\\IEDriverServer.exe" );
	  driver=new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.manage().window().maximize();
	return driver;
}    	


}
