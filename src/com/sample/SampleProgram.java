package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleProgram {

	public static WebDriver driver;

	public static void getBrowser() throws Exception {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\WiproProject\\SampleProject\\Driver\\chromedriver.exe"); driver = new
		 * ChromeDriver(); driver.get("https://www.kenzo.com/eu/en/home");
		 * Thread.sleep(2000); WebElement accessories =
		 * driver.findElement(By.id("ACCESSORIES")); Actions ac = new Actions(driver);
		 * ac.moveToElement(accessories).build().perform(); List<WebElement>
		 * findElements = driver .findElements(By.xpath(
		 * "//*[@id=\"main-header\"]/div/nav/ul/li[4]/div/div/div/ul/li[3]")); for
		 * (WebElement webElement : findElements) { String text = webElement.getText();
		 * System.out.println(text); }
		 */

		System.out.println("Good Morning");

		// immutable
		/*
		 * String s="abc"; String s1="abc"; String a=s.concat(s1);
		 * System.out.println(System.identityHashCode(s));
		 * System.out.println(System.identityHashCode(s1));
		 * System.out.println(System.identityHashCode(a));
		 * 
		 * //mutable StringBuffer x=new StringBuffer("senthil"); StringBuffer x1=new
		 * StringBuffer("senthil"); StringBuffer c=x.append(x1);
		 * System.out.println(System.identityHashCode(x));
		 * System.out.println(System.identityHashCode(x1));
		 * System.out.println(System.identityHashCode(c));
		 */

	}

	public static void printName() {
		/*
		 * int max=8; if(count<=max) { System.out.println("Senthil"+" " +count);
		 * count++; printName(count); }
		 */

		System.setProperty("webdriver.chrome.driver", "E:\\WiproProject\\SampleProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");

	}

	public static void main(String[] args) throws Exception {
		// getBrowser();
		printName();
	}
}
