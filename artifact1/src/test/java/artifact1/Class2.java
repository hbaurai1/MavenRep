package artifact1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	public void Login1() throws InterruptedException
	// TODO Auto-generated method stub
	{
	/*System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	Thread.sleep(5);
	driver.get("http://apps.qaplanet.in/qahrm/login.php");
	Thread.sleep(5);
	driver.close();
	driver.quit();*/
		
		System.out.println("----- login method");
		System.out.println("Updated repository");
		System.out.println("Updated repository 2");
	}
	
	@Test
	public void sum1()
	
	{
		int a = 10;
		int b = 20;
		int c= a+b;
		System.out.println("Sum is "+c );
	}
	
@Test
public void mul1()
	
	{
		int d = 10;
		int e = 20;
		int f= d*e;
		System.out.println("Sum is "+f );
	}


}
