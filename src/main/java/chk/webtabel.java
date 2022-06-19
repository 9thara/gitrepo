package chk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtabel {

	
	public static void main (String args[]) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijayalakshmi.k\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(row.size());
		
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(column.size());
		System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr[2]/td[2]")).getText());
		
		for(int i=2;i<=row.size();i++) {
			
			for(int j=1;j<=column.size();j++) {
				
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
				System.out.print(" ");
			}
			
			
			System.err.println();
		}
		
	}
}
