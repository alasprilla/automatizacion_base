package com.handresc1127.automatizacion.utilities;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.pages.PageObject;

public class ActionsUtil {

	// Expresiones Regulares para los features \"([^\"]*)\" (\\d+) \"(.*?)\"

	private ActionsUtil() {
		throw new IllegalStateException("Utility class");
	}

	static HashMap<String, By> objetosPage = new HashMap<>();
	static PropertiesLoader properties = PropertiesLoader.getInstance();
	private static final Logger LOGGER = LoggerFactory.getLogger(PageObject.class);
	private static final long TIMEOUTS = (getProperty("webdriver.timeouts.implicitlywait")) != null
			? Long.parseLong(getProperty("webdriver.timeouts.implicitlywait"))
			: 10000L;

	public static By getObjeto(String nombreObjeto) {
		By retorno = objetosPage.get(nombreObjeto);
		String valueContains = "Objeto no mapeado";
		if (retorno == null)
			valueContains = nombreObjeto;
		assertThat("Objeto no mapeado", CoreMatchers.equalTo(valueContains));
		return retorno;
	}

	public static void objetosPut(String key, By value) {
		String validacionKey = "Objeto mapeado en objectsmap";
		By valueKey = objetosPage.get(key);
		if (valueKey != null) {
			validacionKey = "El objeto " + key + " ya fue mapeado: " + valueKey;
			objetosPage = new HashMap<>();
		}
		assertThat("Objeto mapeado en objectsmap", CoreMatchers.equalTo(validacionKey));
		objetosPage.put(key, value);
	}

	public static boolean objetosIsEmpty() {
		return objetosPage.isEmpty();
	}

	public static void setProperty(String property, String url) {
		properties.setProperty(property, url);
	}

	public static String getProperty(String property) {
		String retorno = properties.getProperty(property);
		return retorno;
	}

	public static void highlightElement(WebDriver driver, By by) {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		for (int second = 0; second <= 60; second++) {
			try {
				driver.findElement(by);
				if (driver.findElement(by).isDisplayed())
					break;
			} catch (Exception e) {
			}
			sleepMiliseconds(100);
		}
		driver.manage().timeouts().implicitlyWait(TIMEOUTS, TimeUnit.MILLISECONDS);

		WebElement element = driver.findElement(by);
		String originalStyle = element.getAttribute("style");
		String modifyStyle = "border: 3px solid green;";
		String comandoExecute= "arguments[0].setAttribute('style', arguments[1]);";
		if (originalStyle.contains("border:")) {
			int indexInicio = 7 + originalStyle.indexOf("border:");
			String aux = originalStyle.substring(indexInicio);
			int indexFin = indexInicio + aux.indexOf(';');
			String strInicial = originalStyle.substring(0, originalStyle.indexOf("border:"));
			String strMedio = "border: 3px solid green";
			String strFinal = originalStyle.substring(indexFin);
			modifyStyle = strInicial + strMedio + strFinal;
		} else {
			modifyStyle = modifyStyle + " " + originalStyle;
		}
		for (int i = 0; i < 2; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(comandoExecute, element, modifyStyle);
			sleepMiliseconds(15);
			js.executeScript(comandoExecute, element, originalStyle);
			sleepMiliseconds(5);
		}
	}

	public static void goToWebSide(WebDriver driver, String text) {
		String currentURL = driver.getCurrentUrl();
		if (!text.isEmpty() && !text.equals(currentURL)) {
			driver.navigate().to(text);
		}
	}

	public static void presionarTecla(WebDriver driver, By by, String tecla) {
		WebElement element = driver.findElement(by);
		List<WebElement> elementsToClicked = driver.findElements(by);
		for (WebElement element_ : elementsToClicked) {
			try {
				if (element_.isDisplayed()) {
					element=element_;
					break;
				}
			} catch (Exception e) {
			}
		}
		switch (ActionsUtil.textoMinusculasSinEspacios(tecla)) {
		case "f5":
			element.sendKeys(Keys.F5);
			break;
		case "backspace":
			element.sendKeys(Keys.BACK_SPACE);
			break;
		case "inicio":
			element.sendKeys(Keys.HOME);
			break;
		case "fin":
			element.sendKeys(Keys.END);
			break;
		case "suprimir":
			element.sendKeys(Keys.DELETE);
			break;
		case "flechaizquierda":
			element.sendKeys(Keys.ARROW_LEFT);
			break;
		case "flechaderecha":
			element.sendKeys(Keys.ARROW_RIGHT);
			break;
		case "tab":
			element.sendKeys(Keys.TAB);
			break;
		case "avanzarpagina":
			element.sendKeys(Keys.PAGE_DOWN);
			sleepSeconds(1);
			break;
		case "retrocederpagina":
			element.sendKeys(Keys.PAGE_UP);
			sleepSeconds(1);
			break;
		case "":
			break;
		default:
			assertThat("Tecla no mapeado", CoreMatchers.equalTo(tecla));
			break;
		}
	}

	public static boolean existsElement(WebDriver driver, By objeto) {
		try {
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
			WebElement element = driver.findElement(objeto);
			driver.manage().timeouts().implicitlyWait(TIMEOUTS, TimeUnit.MILLISECONDS);
			if (element.isDisplayed())
				return true;
		} catch (Exception e) {
			return false;
		}
		return false;
	}

	public static boolean existsElement(WebElement element) {
		try {
			if (element.isDisplayed())
				return true;
		} catch (Exception e) {
			return false;
		}
		return false;
	}

	public static void noExiste(WebDriver driver, By objeto) {
		boolean existAny = false;
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		List<WebElement> elementsThatNotExists = driver.findElements(objeto);
		driver.manage().timeouts().implicitlyWait(TIMEOUTS, TimeUnit.MILLISECONDS);
		for (WebElement element : elementsThatNotExists) {
			if (existsElement(element)) {
				existAny = true;

				String originalStyle = element.getAttribute("style");
				String modifyStyle = "border: 3px solid green;";
				if (originalStyle.contains("border:")) {
					int indexInicio = 7 + originalStyle.indexOf("border:");
					String aux = originalStyle.substring(indexInicio);
					int indexFin = indexInicio + aux.indexOf(';');
					String strInicial = originalStyle.substring(0, originalStyle.indexOf("border:"));
					String strMedio = "border: 3px solid green";
					String strFinal = originalStyle.substring(indexFin);
					modifyStyle = strInicial + strMedio + strFinal;
				} else {
					modifyStyle = modifyStyle + " " + originalStyle;
				}
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, modifyStyle);
				break;
			}
		}
		assertFalse("Se encontro el elemento " + objeto, existAny);
	}

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
				sleepMiliseconds(5);
			}
		}
	}

	public static String[][] getTable(WebDriver driver, By by) {
		highlightElement(driver, by);
		WebElement tableElement = driver.findElement(by);
		List<WebElement> trCollection = tableElement.findElements(By.tagName("tr"));
		String[][] tabla = new String[999][999];
		int rowNum=0; 
		int colNum;
		int colMax = 0;
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		for (WebElement trElement : trCollection) {
			List<WebElement> tdCollection = trElement.findElements(By.tagName("td"));
			if (tdCollection.isEmpty()) {
				tdCollection = trElement.findElements(By.tagName("th"));
			}
			if (tdCollection.size() > colMax)
				colMax = tdCollection.size();
			colNum = 0;
			for (WebElement tdElement : tdCollection) {
				tabla[rowNum][colNum] = tdElement.getText();
				colNum++;
			}
			rowNum++;
		}
		assertTrue(rowNum > 0);
		assertTrue(colMax > 0);
		String[][] tablaReturn = new String[rowNum][colMax];
		for (int i = 0; i < rowNum; i++) {
			System.arraycopy(tabla[i], 0, tablaReturn[i], 0, colMax);
		}
		driver.manage().timeouts().implicitlyWait(TIMEOUTS, TimeUnit.MILLISECONDS);
		return tablaReturn;
	}

	public static String[][] getTableDiv(WebDriver driver, By by) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		List<WebElement> childCollection = element.findElements(By.xpath("./*"));
		String[][] tabla = new String[999][999];
		int rowNum=0; 
		int colNum;
		int colMax = 0;
		boolean containInfo = false;
		for (WebElement childElement : childCollection) {
			List<WebElement> grandChildCollection = childElement.findElements(By.xpath("./*"));
			if (grandChildCollection.size() > colMax)
				colMax = grandChildCollection.size();
			colNum = 0;
			containInfo = false;
			for (WebElement tdElement : grandChildCollection) {
				String aux = tdElement.getText();
				tabla[rowNum][colNum] = aux;
				colNum++;
				if (aux != null && !aux.isEmpty()) {
					containInfo = true;
				}
			}
			if (containInfo) {
				rowNum++;
			}
		}
		assertTrue(rowNum > 0);
		assertTrue(colMax > 0);
		String[][] tablaReturn = new String[rowNum][colMax];
		for (int i = 0; i < rowNum; i++) {
			System.arraycopy(tabla[i], 0, tablaReturn[i], 0, colMax);
		}
		driver.manage().timeouts().implicitlyWait(TIMEOUTS, TimeUnit.MILLISECONDS);
		return tablaReturn;
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

	public static void clicParent(WebDriver driver, By by) {
		WebElement element = driver.findElement(by);
		try {
			element.findElement(By.xpath("..")).click();
			element.findElement(By.xpath("../..")).click();
		} catch (Exception e) {
			LOGGER.error("Excepcion Clic .. o ../..:", e);
		}
	}

	public static void clic(WebDriver driver, By by) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		element.click();
	}

	public static void clicIfDisplayed(WebDriver driver, By by) {
		boolean wasCicked = false;
		List<WebElement> elementsToClicked = driver.findElements(by);
		for (WebElement element : elementsToClicked) {
			try {
				if (element.isDisplayed()) {
					element.click();
					wasCicked = true;
					break;
				}
			} catch (Exception e) {
			}
		}
		assertTrue("No se clickeo ningún elemento " + by, wasCicked);
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
		assertThat(valueComboBox, CoreMatchers.containsString(valueContains));
		String []  values= valueComboBox.split("\n");
		int index = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i].contains(valueContains)) {
				index = i;
				break;
			}
		}

		Select select = new Select(element);
		select.selectByIndex(index);
		WebElement option = select.getFirstSelectedOption();
		String valorActual = option.getText();
		if (!valorActual.contains(valueContains)) {
			select = new Select(element);
			select.selectByIndex(index + 1);
			option = select.getFirstSelectedOption();
			valorActual = option.getText();
		}
		assertThat(valorActual, CoreMatchers.containsString(valueContains));
	}

	public static void selectValue(WebDriver driver, By by, String valueOption) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		new Select(element).selectByValue(valueOption);
	}

	public static void compareText(WebDriver driver, By by, String valorEsperado) {
		String valorObtenido = getText(driver, by);
		valorEsperado=valorEsperado.replace("\\\"", "\"");
		assertEquals(valorEsperado, valorObtenido);
	}

	public static void compareTextStart(WebDriver driver, By by, String textStart) {
		String valorObtenido = getText(driver, by);
		assertThat(valorObtenido, CoreMatchers.startsWith(textStart));
	}

	public static void compareTextNotEmpty(WebDriver driver, By by) {
		String valorObtenido = getText(driver, by);
		assertThat(valorObtenido, !valorObtenido.isEmpty());
	}

	public static void compareAtributo(WebDriver driver, By by, String atributo, String valorEsperado) {
		String valorObtenido = getAttribute(driver, by, atributo);
		if (valorObtenido.isEmpty())
			assertEquals(valorEsperado, valorObtenido);
		else
			assertThat(valorObtenido, CoreMatchers.containsString(valorEsperado));
	}

	public static void checkBox(WebDriver driver, By by, boolean checked) {
		highlightElement(driver, by);
		WebElement element = driver.findElement(by);
		if (checked) {
			if (!element.isSelected() && element.isEnabled()) {
				element.click();
			}
		} else {
			if (element.isSelected() && element.isEnabled()) {
				element.click();
			}
		}
	}

	public static void ejecutarScript(WebDriver driver, String script, By by) {
		WebElement element = driver.findElement(by);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript(script, element);
	}

	public static void waitForXElements(WebDriver driver, By by, String condicion, int cantidad) {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		boolean brakeLoop = false;
		for (int second = 0; second <= 60; second++) {
			try {
				switch (condicion) {
				case ">":
					if (driver.findElements(by).size() > cantidad)
						brakeLoop = true;
					break;
				case ">=":
					if (driver.findElements(by).size() >= cantidad)
						brakeLoop = true;
					break;
				case "<":
					if (driver.findElements(by).size() < cantidad)
						brakeLoop = true;
					break;
				case "<=":
					if (driver.findElements(by).size() <= cantidad)
						brakeLoop = true;
					break;
				case "==":
					if (driver.findElements(by).size() == cantidad)
						brakeLoop = true;
					break;
				default:
					brakeLoop = true;
					break;
				}
			} catch (Exception e) {
			}
			sleepMiliseconds(100);
			if (brakeLoop)
				break;
		}
		driver.manage().timeouts().implicitlyWait(TIMEOUTS, TimeUnit.MILLISECONDS);
	}

	public static void dragAndDrop(WebDriver driver, By byDraggable, By byDroppable) {
		highlightElement(driver, byDraggable);
		WebElement elementDrag = driver.findElement(byDraggable);
		highlightElement(driver, byDroppable);
		WebElement elementDrop = driver.findElement(byDroppable);
		Actions dragAndDrop = new Actions(driver);
		dragAndDrop.dragAndDrop(elementDrag, elementDrop).perform();
	}

	public static void dragAndDrop(WebDriver driver, By byElement, int x, int y) {
		highlightElement(driver, byElement);
		WebElement elementDrag = driver.findElement(byElement);
		Actions dragAndDrop = new Actions(driver);
		dragAndDrop.dragAndDropBy(elementDrag, x, y).perform();
	}

	public static void sleepSeconds(int sleep) {
		sleepMiliseconds(1000L * sleep);
	}

	public static void sleepMiliseconds(long timeMiliSeconds) {
		try {
			Thread.sleep(timeMiliSeconds);
		} catch (Exception e) {
			LOGGER.error("Excepcion Sleep:", e);
		}
	}

	public static int byShared(WebDriver driver, By objClass1, By objClass2) {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		int retorno = 0;
		for (int second = 0; second <= 60; second++) {
			boolean flagBreak = false;
			try {
				driver.findElement(objClass1);
				if (driver.findElement(objClass1).isDisplayed()) {
					flagBreak = true;
					retorno = 1;
				}
			} catch (Exception e) {
			}
			try {
				driver.findElement(objClass2);
				if (driver.findElement(objClass2).isDisplayed()) {
					flagBreak = true;
					retorno = 2;
				}
			} catch (Exception e) {
			}
			if (flagBreak) {
				break;
			}
			sleepMiliseconds(100);
		}
		driver.manage().timeouts().implicitlyWait(TIMEOUTS, TimeUnit.MILLISECONDS);
		return retorno;
	}

	//// Base URL
	private static String baseURL;

	public static String getBaseUrl() {
		return baseURL;
	}

	public static void setBaseUrl(String base) {
		try {
			new URL(base);
			baseURL = base;
		} catch (Exception e) {
			baseURL = null;
		}
	}

	public static String updateUrlWithBaseUrlIfDefined(final String startingUrl) {
		String baseUrl = baseURL;
		if ((baseUrl != null) && (!StringUtils.isEmpty(baseUrl))) {
			return replaceHost(startingUrl, baseUrl);
		} else {
			return startingUrl;
		}
	}

	private static String replaceHost(final String starting, final String base) {
		String updatedUrl = starting;
		try {
			URL startingUrl = new URL(starting);
			URL baseUrl = new URL(base);

			String startingHostComponent = hostComponentFrom(startingUrl.getProtocol(), startingUrl.getHost(),
					startingUrl.getPort());
			String baseHostComponent = hostComponentFrom(baseUrl.getProtocol(), baseUrl.getHost(), baseUrl.getPort());
			updatedUrl = starting.replaceFirst(startingHostComponent, baseHostComponent);
		} catch (Exception e) {
			LOGGER.error("Failed to analyse default page URL: Starting URL: {}, Base URL: {}", starting, base);
			LOGGER.error("URL analysis failed with exception:", e);
		}
		return updatedUrl;
	}

	private static String hostComponentFrom(final String protocol, final String host, final int port) {
		StringBuilder hostComponent = new StringBuilder(protocol);
		hostComponent.append("://");
		hostComponent.append(host);
		if (port > 0) {
			hostComponent.append(":");
			hostComponent.append(port);
		}
		return hostComponent.toString();
	}

	public static void curretCompareURL(WebDriver driver, String urlExpected) {
		String currenturl = driver.getCurrentUrl();
		urlExpected = urlExpected.split("\\?")[0];
		currenturl = currenturl.split("\\?")[0];
		currenturl=replaceHost(currenturl, urlExpected);
		assertEquals(urlExpected, currenturl);
	}

	public static void switchWindowsTab(WebDriver driver, int indexTab) {
		driver.getWindowHandles();
		Set<String> currentHandlers = driver.getWindowHandles();
		String[] handle = new String[999];
		int i = 0;
		for (String pestana : currentHandlers) {
			handle[i] = pestana;
			i++;
		}
		handle = Arrays.copyOf(handle, i);
		if (indexTab > 99) {
			driver.switchTo().window(handle[handle.length - 1]);
		} else {
			driver.switchTo().window(handle[indexTab - 1]);
		}
		driver.findElement(By.xpath("//*"));
	}

	public static void closeCurrentWindowsTab(WebDriver driver) {
		driver.getWindowHandles();
		Set<String> currentHandlers = driver.getWindowHandles();
		if (currentHandlers.size() > 1) {
			By by = By.tagName("body");
			ejecutarScript(driver, "window.close();", by);
			switchWindowsTab(driver, 1);
		}
	}

	public static void resolucion(WebDriver driver, String x, String y) {

		int ancho = Integer.parseInt(x);
		int alto = Integer.parseInt(y);
		Dimension d = new Dimension(ancho, alto);
		driver.manage().window().setSize(d);

	}

	public static void borrarCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
	}
	
	public static String getSubString(WebDriver driver, By by, int strInit, int strEnd) {
		return getText(driver, by).substring(strInit,strEnd);
	}
}
