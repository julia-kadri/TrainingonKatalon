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

CustomKeywords.'reusablefunctions.reusablefunctions.PerananPelulusBN'()

WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/a_ExpandMenuonLeft'))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_PanelTitlePengurusanTunai'))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_PostBayaran'))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/008 Post Bayaran/Drop_down_No_Baucar'))

WebUI.delay(3)

WebUI.setText(findTestObject('Perolehan/008 Post Bayaran/input_No. Baucar_noBaucar'), GlobalVariable.Nombor_Baucar)

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/008 Post Bayaran/select_No_Baucar', [('text') : GlobalVariable.Nombor_Baucar]))

WebUI.click(findTestObject('Perolehan/008 Post Bayaran/button_Cari'))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/008 Post Bayaran/search_result', [('text') : GlobalVariable.Nombor_Baucar]))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/008 Post Bayaran/button_kembali'))

WebUI.click(findTestObject('Perolehan/008 Post Bayaran/checkbox_proses'))

WebUI.click(findTestObject('Perolehan/008 Post Bayaran/button_proses'))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/008 Post Bayaran/button_Ya_Proses'))

WebUI.delay(10)

WebUI.verifyTextPresent('Proses Posting Berjaya.', false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Perolehan/008 Post Bayaran/button_OK'))

WebUI.delay(3)

WebUI.closeBrowser()

