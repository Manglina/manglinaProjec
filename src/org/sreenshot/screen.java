package org.sreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANGLINA\\eclipse-workspace\\SCREENSHOT\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement id=driver.findElement(By.id("email"));
		id.sendKeys("mang");
		
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("gopi");
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File Defaultloc=tk.getScreenshotAs(OutputType.FILE);
		File decloc=new File("D://mang/sc.jpg");
		
		FileUtils.copyFile(Defaultloc, decloc);
		Thread.sleep(2000);
		driver.close();
		
	}

}
