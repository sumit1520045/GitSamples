package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tryFileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		WebElement addFiles = driver.findElement(By.xpath("//input[@type='file']"));
		String path1 = System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".Png";
		addFiles.sendKeys(path1);
		
	//comment

		
	}

}
