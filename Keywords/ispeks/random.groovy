package ispeks
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


class random {
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
	 * create a random keyword to be used in the test cases
	 */

	@Keyword

	def randomEngagementNameGenerator() {

		Date today = new Date()

		String todaysDate = today.format('MMddyy-hhmm')

		String RandomValueName = 'auto_gen' + todaysDate
	}


	@Keyword

	def randomString(int length) {

		String chars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789'

		Random rand = new Random();

		StringBuilder sb = new StringBuilder();

		for (int i=0; i<length; i++) {

			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}

		return sb.toString();
	}
	/**
	 * login function to be used when login into the system
	 * 
	 */
	@Keyword

	def loginfunction (String Username, String Password) {
		'Input username'
		WebUI.setText(findTestObject('Login/input_NoKadPengenalan'), Username)
		'Input password'
		WebUI.setEncryptedText(findTestObject('Login/input_Password'), Password)
		'Click Login button'
		WebUI.click(findTestObject('Login/input_ButtonLogMasuk'))
	}

	/**
	 * tukar peranan function to be used when changing the role to Penyedia
	 *
	 */
	@Keyword

	def perananPenyediaPTJ () {
		'Click icon Tukar JAB/PTJ/PERANAN/PERINGKAT'
		WebUI.click(findTestObject('RecordandPlay/img_TukarPeranan'))
		'Change to Penyedia PTJ'
		WebUI.click(findTestObject('Object Repository/RecordandPlay/input_Penyedia_PTJ'))
		'Confirm change of role'
		WebUI.click(findTestObject('RecordandPlay/a_YaTukarPeranan'))
		'Delay'
		WebUI.delay(30)
		'Verify that the role is changed successfully'
		WebUI.verifyTextPresent('Peranan : [Penyedia] Peringkat : [PTJ]', false, FailureHandling.STOP_ON_FAILURE)
	}

	/**
	 * tukar peranan function to be used when changing the role to Penyemak
	 *
	 */
	@Keyword

	def perananPenyemakPTJ () {
		'Click icon Tukar JAB/PTJ/PERANAN/PERINGKAT'
		WebUI.click(findTestObject('RecordandPlay/img_TukarPeranan'))
		'Change to Penyemak PTJ'
		WebUI.click(findTestObject('Object Repository/RecordandPlay/input_Penyemak_PTJ'))
		'Confirm change of role'
		WebUI.click(findTestObject('RecordandPlay/a_YaTukarPeranan'))
		'Delay'
		WebUI.delay(30)
		'Verify that the role is changed successfully'
		WebUI.verifyTextPresent('Peranan : [Penyemak] Peringkat : [PTJ]', false, FailureHandling.STOP_ON_FAILURE)
	}
}