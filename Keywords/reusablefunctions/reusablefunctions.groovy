package reusablefunctions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class reusablefunctions {
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}

	/**
	 * Keyword for Tukar Peranan to Penyemak PTJ
	 */
	@Keyword
	def PerananPenyemakPTJ () {

		'Click on icon Tukar Peranan'
		WebUI.click(findTestObject('Perolehan/TukarPeranan/IconTukarPeranan'))

		'Click Radio Button Penyemak PTJ'
		WebUI.click(findTestObject('Object Repository/Perolehan/TukarPeranan/input_TukarPenyemakPTJ'))

		'Click Ya to confirm change of role'
		WebUI.click(findTestObject('Perolehan/TukarPeranan/button_Ya'))

		WebUI.delay(20)

		'Verify Peranan is now Penyemak PTJ'
		WebUI.verifyTextPresent('Peranan : [Penyemak] Peringkat : [PTJ]', false)
	}

	/**
	 * Keyword for Tukar Peranan to Penyedia PTJ
	 */
	@Keyword
	def PerananPenyediaPTJ () {

		'Click on icon Tukar Peranan'
		WebUI.click(findTestObject('Perolehan/TukarPeranan/IconTukarPeranan'))

		'Click Radio Button Penyedia PTJ'
		WebUI.click(findTestObject('Object Repository/Perolehan/TukarPeranan/input_TukarPenyediaPTJ'))

		'Click Ya to confirm change of role'
		WebUI.click(findTestObject('Perolehan/TukarPeranan/button_Ya'))

		WebUI.delay(20)

		'Verify Peranan is now Penyedia PTJ'
		WebUI.verifyTextPresent('Peranan : [Penyedia] Peringkat : [PTJ]', false)
	}

	/**
	 * Keyword for Tukar Peranan to Pengesah BN
	 */
	@Keyword
	def PerananPengesahBN () {

		'Click on icon Tukar Peranan'
		WebUI.click(findTestObject('Perolehan/TukarPeranan/IconTukarPeranan'))

		'Click Radio Button Pengesah BN'
		WebUI.click(findTestObject('Object Repository/Perolehan/TukarPeranan/input_TukarPengesahBN'))

		'Click Ya to confirm change of role'
		WebUI.click(findTestObject('Perolehan/TukarPeranan/button_Ya'))

		WebUI.delay(20)

		'Verify Peranan is now Pengesah BN'
		WebUI.verifyTextPresent('Peranan : [Pengesah] Peringkat : [BN]', false)
	}
	/**
	 * Keyword for Tukar Peranan to Pelulus PTJ
	 */
	@Keyword
	def PerananPelulusPTJ () {

		'Click on icon Tukar Peranan'
		WebUI.click(findTestObject('Perolehan/TukarPeranan/IconTukarPeranan'))

		'Click Radio Button Pelulus PTJ'
		WebUI.click(findTestObject('Object Repository/Perolehan/TukarPeranan/input_TukarPelulusPTJ'))

		'Click Ya to confirm change of role'
		WebUI.click(findTestObject('Perolehan/TukarPeranan/button_Ya'))

		WebUI.delay(20)

		'Verify Peranan is now Pelulus PTJ'
		WebUI.verifyTextPresent('Peranan : [Pelulus] Peringkat : [PTJ]', false)
	}
	/**
	 * Keyword for Tukar Peranan to Pelulus BN
	 */
	@Keyword
	def PerananPelulusBN () {

		'Click on icon Tukar Peranan'
		WebUI.click(findTestObject('Perolehan/TukarPeranan/IconTukarPeranan'))

		'Click Radio Button Pelulus BN'
		WebUI.click(findTestObject('Object Repository/Perolehan/TukarPeranan/input_TukarPelulusBN'))

		'Click Ya to confirm change of role'
		WebUI.click(findTestObject('Perolehan/TukarPeranan/button_Ya'))

		WebUI.delay(20)

		'Verify Peranan is now Pelulus BN'
		WebUI.verifyTextPresent('Peranan : [Pelulus] Peringkat : [BN]', false)
	}
	/**
	 * Keyword for Login function
	 */
	@Keyword
	def Login (String Username, String Password) {

		'Input username'
		WebUI.setText(findTestObject('Login/input_NoKadPengenalan'), Username)

		'Input Password'
		WebUI.setEncryptedText(findTestObject('Login/input_Password'), Password)
		'Click on button Log Masuk'
		WebUI.click(findTestObject('Login/input_ButtonLogMasuk'))
		'Delay'
		WebUI.delay(10)
	}
	/**
	 * Keyword for open browser and navigate to url
	 */
	@Keyword
	def openbrowser() {
		'Open browser and input homepage URL '
		WebUI.openBrowser('https://175.143.52.101:7011/1SPEKSv2/')
	}
}