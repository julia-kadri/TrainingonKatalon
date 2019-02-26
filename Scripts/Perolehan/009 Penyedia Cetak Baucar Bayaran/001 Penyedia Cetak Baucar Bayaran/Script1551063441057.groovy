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

CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 2), findTestData('ispekstestdata').getValue(
        2, 2))

CustomKeywords.'reusablefunctions.reusablefunctions.PerananPenyediaPTJ'()

WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/a_ExpandMenuonLeft'))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/Menu_Akaun Belum Bayar'))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_Carian_Akaun_Belum_Bayar'))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/Drop_down_Jenis_Carian'))

WebUI.click(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/Select_No_Baucar'))

WebUI.setText(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/Input_No_Baucar'), GlobalVariable.Nombor_Baucar)

WebUI.click(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/button_Cari'))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/button_Cetak'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.waitForPageLoad(180)

WebUI.takeScreenshot()

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.closeBrowser()

