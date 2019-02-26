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

CustomKeywords.'reusablefunctions.reusablefunctions.PerananPelulusPTJ'()

WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/Menu_Sisi'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Perolehan/007 Proses Baucar Bayaran/Menu_Akaun Belum Bayar'))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/Menu_Expand_Baucar_Bayaran'))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/Menu_Integrasi_Dalaman'))

WebUI.delay(3)

WebUI.setText(findTestObject('Perolehan/007 Proses Baucar Bayaran/input_No_Rekod'), GlobalVariable.ArahanBayaranRekodID)

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Perolehan/007 Proses Baucar Bayaran/select_No_Rekod', [('text') : GlobalVariable.ArahanBayaranRekodID]))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/button_Lulus'))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/button_Ya_Lulus'))

WebUI.delay(3)

'Get text of No Baucar from the prompt'
String No_Baucar = WebUI.getText(findTestObject('Perolehan/007 Proses Baucar Bayaran/div_Rekod Berjaya Diluluskan'))

'print the text'
println(No_Baucar)

'take only the baucar ID which is from index 40 until 52'
String Baucar_id = No_Baucar[(39..51)]

'print baucar id'
println(Baucar_id)

'set global variable value of Nombor_Baucar with variable Baucar_id'
GlobalVariable.Nombor_Baucar = Baucar_id

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/button_Ya_Cetak'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.waitForPageLoad(180)

WebUI.takeScreenshot()

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.closeBrowser()

