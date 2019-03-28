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

WebUI.callTestCase(findTestCase('Perolehan/001 Left Menu Selection/Select Menu Pesanan Tempatan'), [:], FailureHandling.STOP_ON_FAILURE)

for (def index : (1..9)) {
    WebUI.delay(3)

    WebUI.doubleClick(findTestObject('Object Repository/30JAN_Record_and_Play/div_19DAPT030100122'))

    WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/span_Batal'))

    WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/a_Ya'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/a_Ok'))

    WebUI.acceptAlert()
}

WebUI.acceptAlert()

WebUI.closeBrowser()

