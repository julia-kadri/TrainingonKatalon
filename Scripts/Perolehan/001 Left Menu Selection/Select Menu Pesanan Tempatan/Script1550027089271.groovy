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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

'open browser'
WebUI.openBrowser('')

'input ispek URL'
WebUI.navigateToUrl(GlobalVariable.URL_Homepage)

'Input User Name'
WebUI.setText(findTestObject('Login/input_NoKadPengenalan'), findTestData('ispekstestdata').getValue(1, 4))

'Input Password'
WebUI.setEncryptedText(findTestObject('Login/input_Password'), findTestData('ispekstestdata').getValue(2, 4))

'Click on Log Masuk button'
WebUI.click(findTestObject('Login/input_ButtonLogMasuk'))

'Delay'
WebUI.delay(5)

if (WebUI.verifyTextPresent('Peranan : [Penyedia] Peringkat : [PTJ]', false)) {
    'Click on Menu Sisi to display Menu selections'
    WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/a_ExpandMenuonLeft'))

    'Delay'
    WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

    'Select Perolehan Sub-menu'
    WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_PanelTitlePerolehan'))

    'Delay'
    WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

    'Click on Menu sisi'
    WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_PesananTempatan'))

    'Pesanan Tempatan page loaded successfully'
    WebUI.delay(3)
} else {
    'Click on icon Tukar Peranan'
    WebUI.click(findTestObject('Perolehan/TukarPeranan/IconTukarPeranan'))

    'Click Radio Button Penyedia PTJ'
    WebUI.click(findTestObject('Perolehan/TukarPeranan/input_TukarPeranan', [('value') : '255']))

    'Click Ya to confirm change of role'
    WebUI.click(findTestObject('Perolehan/TukarPeranan/button_Ya'))

    WebUI.delay(20)

    'Verify Peranan is now Penyedia PTJ'
    WebUI.verifyTextPresent('Peranan : [Penyedia] Peringkat : [PTJ]', false)

    'Click on Menu Sisi to display Menu selections'
    WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/a_ExpandMenuonLeft'))

    'Delay'
    WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

    'Select Perolehan Sub-menu'
    WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_PanelTitlePerolehan'))

    'Delay'
    WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

    'Click on Menu sisi'
    WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_PesananTempatan'))

    'Pesanan Tempatan page loaded successfully'
    WebUI.delay(3)
}

