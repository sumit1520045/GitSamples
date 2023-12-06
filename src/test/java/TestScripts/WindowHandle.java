package TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println(parentWin);
		Set<String> tabs = driver.getWindowHandles();
		System.out.println(tabs.size());
		for(String child:tabs) {
	//comment
				if (!child.equalsIgnoreCase(parentWin)) {
					driver.switchTo().window(child);
				}

		
	}

}
