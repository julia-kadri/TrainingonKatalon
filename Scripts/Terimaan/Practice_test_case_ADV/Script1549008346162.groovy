import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.lang.String as String
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('https://175.143.52.101:7011/1SPEKSv2/')

//list = WebUI.getAllLinksOnCurrentPage(false, [])
//WebUI.println(list)
def contractvalue = CustomKeywords.'ispeks.random.randomEngagementNameGenerator'()

CustomKeywords.'ispeks.random.randomString'(5)

int RN = ((Math.random() * 10000 //This gives a random number between 0 and 10000
    ) as int)

WebUI.setText(findTestObject('Login/input_NoKadPengenalan'), 'KONTRAK' + RN)

/**def username = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(10)
 */
/**
WebUI.setText(findTestObject('Login/input_NoKadPengenalan'), CustomKeywords.'ispeks.random.randomString'(5) )
*/
/**WebUI.closeBrowser() */

