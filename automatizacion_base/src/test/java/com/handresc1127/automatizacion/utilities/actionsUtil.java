package com.handresc1127.automatizacion.utilities;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class actionsUtil {

	/*
	 * Expresiones Regulares para los features \"([^\"]*)\" (\\d+) \"(.*?)\"
	 * Comentario adicional Pull Request
	 */

	public static String globalAux;
	
	public static void highlightElement(WebDriver driver, By by) {
		for (int second = 0; second <= 120; second++) {
			try {
				if (driver.findElement(by).isDisplayed())
					break;
			} catch (Exception e) {
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}

		driver.findElement(by).isDisplayed();
		//assertTrue(driver.findElements(by).size() > 0);
		WebElement element = driver.findElement(by);
		//new Actions(driver).moveToElement(element).perform();

		String originalStyle = element.getAttribute("style");

		String modifyStyle = "border: 3px solid green;";
		if (originalStyle.contains("border:")) {
			int indexInicio = 7 + originalStyle.indexOf("border:");
			String aux = originalStyle.substring(indexInicio);
			int indexFin = indexInicio + aux.indexOf(";");
			String strInicial = originalStyle.substring(0, originalStyle.indexOf("border:"));
			String strMedio = "border: 3px solid green";
			String strFinal = originalStyle.substring(indexFin);
			modifyStyle = strInicial + strMedio + strFinal;
		} else {
			modifyStyle = modifyStyle + " " + originalStyle;

		}

		for (int i = 0; i < 2; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;

			try {
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, modifyStyle);
				Thread.sleep(50);
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, originalStyle);
				Thread.sleep(25);
			} catch (Exception e) {
			}

		}
	}

	public static void setTextField(WebDriver driver, By by, String text) {
		if (!text.isEmpty()) {
			highlightElement(driver, by);
			WebElement element = driver.findElement(by);
			element.clear();
			element.sendKeys(text);
		}
	}

	public static void setTextFieldSlowly(WebDriver driver, By by, String text) {
		if (!text.isEmpty()) {
			highlightElement(driver, by);
			WebElement element = driver.findElement(by);
			element.clear();

			for (int i=0;i<text.length();i++) {
				String character=text.substring(i, i+1);
				element.sendKeys(character);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
				}
				}
		}
	}

	public static void goToWebSide(WebDriver driver, String text) {
		if (!text.isEmpty()) {
			driver.navigate().to(text);
		}
	}

	public static void clic(WebDriver driver, By by) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		element.click();
	}

	public static void selectText(WebDriver driver, By by, String option) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		System.out.println("Seleccionar: " + option);
		new Select(element).selectByVisibleText(option);
	}

	public static void selectIndex(WebDriver driver, By by, int indexOption) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		new Select(element).selectByIndex(indexOption);
	}

	public static void selectContains(WebDriver driver, By by, String valueContains) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		String valueComboBox = element.getText();
		String values[] = valueComboBox.split("\n");
		int index = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i].contains(valueContains)) {
				System.out.println(values[i]);
				index = i;
				break;
			}
		}
		new Select(element).selectByIndex(index);
	}

	public static void selectValue(WebDriver driver, By by, String valueOption) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		new Select(element).selectByValue(valueOption);
	}

	public static String[][] getTable(WebDriver driver, By by) {
		WebElement table_element = driver.findElement(by);
		List<WebElement> tr_collection = table_element.findElements(By.tagName("tr"));
		String tabla[][] = new String[999][999];
		// System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
		System.out.print("Leyendo tabla: ");
		int row_num, col_num, col_max = 0;
		row_num = 0;
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		for (WebElement trElement : tr_collection) {
			List<WebElement> td_collection = trElement.findElements(By.tagName("td"));

			if (td_collection.size() == 0) {
				td_collection = trElement.findElements(By.tagName("th"));
			}
			// List<WebElement>
			// td_collection=trElement.findElements(By.xpath("//*[@tagName='td' or
			// @tagName='th']"));
			// System.out.println("NUMBER OF COLUMNS="+td_collection.size());
			if (td_collection.size() > col_max)
				col_max = td_collection.size();
			col_num = 0;
			for (WebElement tdElement : td_collection) {
				// System.out.println("row # "+row_num+", col # "+col_num+
				// "text="+tdElement.getText());
				System.out.print(".");
				tabla[row_num][col_num] = tdElement.getText();
				col_num++;
			}
			row_num++;
		}
		System.out.println();
		System.out.println("Filas:" + row_num + " Columnas:" + col_max);
		assertTrue(row_num > 0);
		assertTrue(col_max > 0);
		// String resize
		String tabla_return[][] = new String[row_num][col_max];
		for (int i = 0; i < row_num; i++) {
			System.arraycopy(tabla[i], 0, tabla_return[i], 0, col_max);
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return tabla_return;
	}

	public static void checkBox(WebDriver driver, By by, boolean checked) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		if (checked) {
			if (!element.isSelected()) {
				if (element.isEnabled()) {
					element.click();
				} else {
					System.out.println("No esta habilitado: " + by.toString());
				}

			}
		} else {
			if (element.isSelected()) {
				if (element.isEnabled()) {
					element.click();
				} else {
					System.out.println("No esta habilitado: " + by.toString());
				}
			}
		}
	}
	
	public static String getText(WebDriver driver, By by) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		return element.getText();
	}
	
}
