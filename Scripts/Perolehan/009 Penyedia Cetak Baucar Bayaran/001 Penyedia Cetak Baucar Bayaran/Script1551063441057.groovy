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

'Open browser and get to ispek URL'
CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

'Login into the application'
CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 2), findTestData('ispekstestdata').getValue(
        2, 2))

'Change peranan to Penyedia PTJ'
CustomKeywords.'reusablefunctions.reusablefunctions.PerananPenyediaPTJ'()

'Expand menu sisi'
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/a_ExpandMenuonLeft'))

'Delay'
WebUI.delay(3)

'click on menu akaun belum bayar'
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/Menu_Akaun Belum Bayar'))

'delay'
WebUI.delay(3)

'click on menu carian akaun belum bayar to retrieve the baucar id that is previously processed'
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_Carian_Akaun_Belum_Bayar'))

'delay'
WebUI.delay(3)

'click on drop down jenis carian'
WebUI.click(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/Drop_down_Jenis_Carian'))

'select carian by nombor baucar'
WebUI.click(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/Select_No_Baucar'))

'input no baucar that is a global variable baucar id'
WebUI.setText(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/Input_No_Baucar'), GlobalVariable.Nombor_Baucar)

'click on button cari to search for the record'
WebUI.click(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/button_Cari'))

'delay'
WebUI.delay(15)

'click on button cetak to print the baucar again'
WebUI.click(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/button_Cetak'))

'delay'
WebUI.delay(3)

'wait for the page to load the document which will take some times'
WebUI.waitForPageLoad(180)

'take the screen shot of the document loaded'
WebUI.takeScreenshot()

'switch to window tab index 1 to get the baucar displayed'
WebUI.switchToWindowIndex(0)

'delay'
WebUI.delay(3)

'close browser'
WebUI.closeBrowser()

