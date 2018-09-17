package com.handresc1127.automatizacion.utilities;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionsUtil {

	/*
	 * Expresiones Regulares para los features \"([^\"]*)\" (\\d+) \"(.*?)\"
	 * Comentario adicional Pull Request WebElement parent =
	 * myElement.findElement(By.xpath("..")); WebElement childs =
	 * myElement.findElement(By.xpath('.//*'));
	 */

	public static String globalAux;
	public static PropertiesLoader properties = PropertiesLoader.getInstance();

	private static final long TIMEOUTS = (properties.getProperty("webdriver.timeouts.implicitlywait")) != null
			? Long.parseLong(properties.getProperty("webdriver.timeouts.implicitlywait"))
			: 10000L;

	public static void highlightElement(WebDriver driver, By by) {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
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
		driver.manage().timeouts().implicitlyWait(TIMEOUTS, TimeUnit.MILLISECONDS);
		driver.findElement(by).isDisplayed();
		// assertTrue(driver.findElements(by).size() > 0);

		WebElement element = driver.findElement(by);

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
				Thread.sleep(25);
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, originalStyle);
				Thread.sleep(10);
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

			for (int i = 0; i < text.length(); i++) {
				String character = text.substring(i, i + 1);
				element.sendKeys(character);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public static void setTextActions(WebDriver driver, By by, String text) {
		if (!text.isEmpty()) {
			highlightElement(driver, by);
			WebElement element = driver.findElement(by);
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.click();
			actions.build().perform();
			actions.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b"
					+ "\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
			actions.build().perform();
			actions.sendKeys(text);
			actions.build().perform();
			actions.click();
			actions.build().perform();
			try {
				element.findElement(By.xpath("..")).click();
				element.findElement(By.xpath("../..")).click();
			} catch (Exception e) {
			}
		}
	}

	public static void clicParent(WebDriver driver, By by) {
		WebElement element = driver.findElement(by);
		try {
			element.findElement(By.xpath("..")).click();
			element.findElement(By.xpath("../..")).click();
		} catch (Exception e) {
		}
	}

	public static void goToWebSide(WebDriver driver, String text) {
		String currentURL = driver.getCurrentUrl();
		if (!text.isEmpty() && !text.equals(currentURL)) {
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
		highlightElement(driver, by);
		WebElement table_element = driver.findElement(by);
		List<WebElement> tr_collection = table_element.findElements(By.tagName("tr"));
		String tabla[][] = new String[999][999];
		int row_num, col_num, col_max = 0;
		row_num = 0;
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		for (WebElement trElement : tr_collection) {
			List<WebElement> td_collection = trElement.findElements(By.tagName("td"));
			if (td_collection.size() == 0) {
				td_collection = trElement.findElements(By.tagName("th"));
			}
			if (td_collection.size() > col_max)
				col_max = td_collection.size();
			col_num = 0;
			for (WebElement tdElement : td_collection) {
				tabla[row_num][col_num] = tdElement.getText();
				col_num++;
			}
			row_num++;
		}
		//assertThat(row_num, greaterThan(0));
		//assertThat(col_max, greaterThan(0));
		assertTrue(row_num>0);
		assertTrue(col_max>0);
		String tabla_return[][] = new String[row_num][col_max];
		for (int i = 0; i < row_num; i++) {
			System.arraycopy(tabla[i], 0, tabla_return[i], 0, col_max);
		}
		driver.manage().timeouts().implicitlyWait(TIMEOUTS, TimeUnit.MILLISECONDS);
		return tabla_return;
	}

	public static String[][] getTableDiv(WebDriver driver, By by) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		List<WebElement> child_collection = element.findElements(By.xpath("./*"));
		String tabla[][] = new String[999][999];
		int row_num, col_num, col_max = 0;
		row_num = 0;
		boolean containInfo = false;
		for (WebElement childElement : child_collection) {
			List<WebElement> grandChild_collection = childElement.findElements(By.xpath("./*"));
			if (grandChild_collection.size() > col_max)
				col_max = grandChild_collection.size();
			col_num = 0;
			containInfo = false;
			for (WebElement tdElement : grandChild_collection) {
				String aux = tdElement.getText();
				tabla[row_num][col_num] = aux;
				col_num++;
				if (aux != null) {
					if (!aux.isEmpty()) {
						containInfo = true;
					}
				}
			}
			if (containInfo) {
				row_num++;
			}
		}
		assertTrue(row_num>0);
		assertTrue(col_max>0);
		String tabla_return[][] = new String[row_num][col_max];
		driver.manage().timeouts().implicitlyWait(TIMEOUTS, TimeUnit.MILLISECONDS);
		return tabla_return;
	}

	public static void checkBox(WebDriver driver, By by, boolean checked) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		if (checked) {
			if (!element.isSelected()) {
				if (element.isEnabled()) {
					element.click();
				}
			}
		} else {
			if (element.isSelected()) {
				if (element.isEnabled()) {
					element.click();
				}
			}
		}
	}

	public static String getText(WebDriver driver, By by) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		return element.getText();
	}

	public static String getTextAttribute(WebDriver driver, By by) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		return element.getAttribute("value");
	}

	public static void compareText(WebDriver driver, By by, String valorEsperado) {
		String valorObtenido = getText(driver, by);
		assertEquals(valorEsperado, valorObtenido);
	}

<<<<<<< HEAD
=======
	public static void validateMSISDNIni(String valorInicial, String valorFinal) {

		String auxInicial = "";

		if (valorInicial.length() > 3 && valorInicial.length() <= 6) {

			auxInicial = "(" + valorInicial.substring(1, 4) + ") " + valorInicial.substring(4, valorInicial.length());
		} else if (valorInicial.length() > 6) {

			auxInicial = "(" + valorInicial.substring(1, 4) + ") " + valorInicial.substring(4, 7) + "-"
					+ valorInicial.substring(7, valorInicial.length());
		} else {

			auxInicial = "(" + valorInicial.substring(1, valorInicial.length());
		}

		assertEquals(auxInicial, valorFinal);

	}

	public static void validateMSISDNFin(String valorInicial, String valorFinal) {

		String auxFinal = "";

		if (valorInicial.length() > 3 && valorInicial.length() <= 6) {

			auxFinal = "(" + valorInicial.substring(0, 3) + ") " + valorInicial.substring(3, valorInicial.length() - 1);
		} else if (valorInicial.length() > 6) {

			auxFinal = "(" + valorInicial.substring(0, 3) + ") " + valorInicial.substring(3, 6) + "-"
					+ valorInicial.substring(6, valorInicial.length() - 1);
		} else {

			auxFinal = "(" + valorInicial.substring(0, valorInicial.length() - 1);
		}

		assertEquals(auxFinal, valorFinal);

	}
	
	public static void validateNumDocIni(String valorInicial, String valorFinal) {
		
		String auxDocFinal = "";
		auxDocFinal = valorInicial.substring(1,valorInicial.length());
				
		assertEquals(auxDocFinal, valorFinal);
	}

	public static void validateNumDocFin(String valorInicial, String valorFinal) {

		String auxDocFinal = "";
	
		auxDocFinal = valorInicial.substring(0, valorInicial.length() - 1);

		assertEquals(auxDocFinal, valorFinal);

	}

>>>>>>> HU-006
	public static String textoMinusculasSinEspacios(String texto) {
		String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
		String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
		for (int i = 0; i < original.length(); i++) {
			texto = texto.replace(original.charAt(i), ascii.charAt(i));
		}
		texto = texto.replaceAll("\t|\n| ", "");
		texto = texto.toLowerCase();
		return texto;
	}

	public static String getAttribute(WebDriver driver, By by, String atributo) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		String retorno = element.getAttribute(atributo);
		if (retorno == null)
			retorno = "";
		if (retorno.isEmpty())
			retorno = element.getCssValue(atributo);
		return retorno;
	}

	public static void compareAtributo(WebDriver driver, By by, String atributo, String valorEsperado) {
		String valorObtenido = getAttribute(driver, by, atributo);
		if (valorObtenido.isEmpty())
			assertEquals(valorEsperado, valorObtenido);
		else
			assertThat(valorObtenido, CoreMatchers.containsString(valorEsperado));
	}

	public static void presionarTeclaRobot(String tecla) {
		Robot robot;
		try {
			robot = new Robot();
			switch (ActionsUtil.textoMinusculasSinEspacios(tecla)) {
			case "f5":
				robot.keyPress(KeyEvent.VK_F5);
				robot.keyRelease(KeyEvent.VK_F5);
				break;

			case "backspace":
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				break;
			case "inicio":
				robot.keyPress(KeyEvent.VK_HOME);
				robot.keyRelease(KeyEvent.VK_HOME);
				break;
			case "suprimir":
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
				break;
			case "flechaizquierda":
				robot.keyPress(KeyEvent.VK_LEFT);
				robot.keyRelease(KeyEvent.VK_LEFT);
				break;
			case "flechaderecha":
				robot.keyPress(KeyEvent.VK_RIGHT);
				robot.keyRelease(KeyEvent.VK_RIGHT);
				break;
			}
			robot.delay(100);

		} catch (AWTException e) {
			e.getMessage();
		}

	}

	public static boolean existsElement(WebDriver driver, By objeto) {
		try {
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
			WebElement element = driver.findElement(objeto);
			driver.manage().timeouts().implicitlyWait(TIMEOUTS, TimeUnit.MILLISECONDS);
			if (element.isDisplayed())
				return true;
		} catch (NoSuchElementException e) {
			return false;
		}
		return false;
	}

}
