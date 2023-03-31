package varify_url;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_homepage_url
{
public static void main(String[] args) throws Throwable {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1:5000/home");
	Thread.sleep(2000);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String expturl="http://127.0.0.1:5000/home";
	if(expturl.equals(url)) {
		System.out.println("testcase is passed");
	}
	else {
		System.out.println("test case is failed");
	}
	driver.quit();
}
}
