package testing_ecoders_demo_website;

import org.openqa.selenium.chrome.ChromeDriver;

public class Opening_broswser {
public static void main(String[] args) throws Throwable {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1:5000/home");
	Thread.sleep(2000);
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String ps=driver.getPageSource();
	System.out.println(ps);
	String exptitle="ECoders_homepage";
	if(exptitle.equals(title)) {
		System.out.println("testcase is passed");
	}
	else {
		System.out.println("test case is failed");
	}
	driver.quit();
}
}
