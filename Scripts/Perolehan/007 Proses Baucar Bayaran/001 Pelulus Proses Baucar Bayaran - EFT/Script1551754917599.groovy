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

'open browser and enter ispek url'
CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

'login into the application'
CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 2), findTestData('ispekstestdata').getValue(
        2, 2))

'change peranan to pelulus PTJ'
CustomKeywords.'reusablefunctions.reusablefunctions.PerananPelulusPTJ'()

'click on menu sisi to expand the menu on the left'
WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/Menu_Sisi'))

'delay'
WebUI.delay(3)

'select menu akaun belum bayar'
WebUI.click(findTestObject('Object Repository/Perolehan/007 Proses Baucar Bayaran/Menu_Akaun Belum Bayar'))

'delay'
WebUI.delay(3)

'expand baucar bayaran menu selection'
WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/Menu_Expand_Baucar_Bayaran'))

'delay'
WebUI.delay(3)

'select sub-menu integrasi dalaman'
WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/Menu_Integrasi_Dalaman'))

'delay'
WebUI.delay(3)

'enter arahan bayaran rekod id into filter field for rekod no '
WebUI.setText(findTestObject('Perolehan/007 Proses Baucar Bayaran/input_No_Rekod'), GlobalVariable.ArahanBayaranRekodID)

'delay'
WebUI.delay(3)

'double click on the record after filter, there is only one record'
WebUI.doubleClick(findTestObject('Perolehan/007 Proses Baucar Bayaran/select_No_Rekod', [('text') : GlobalVariable.ArahanBayaranRekodID]))

'delay'
WebUI.delay(3)

'get text of amount from the screen'
String jumlahkeseluruhan = WebUI.getText(findTestObject('Perolehan/007 Proses Baucar Bayaran/jumlah_amaun'))

'delay'
WebUI.delay(15)

'verify that amount is a match'
WebUI.verifyMatch(jumlahkeseluruhan, '4.90', false)

'click on button lulus to approve the record'
WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/button_Lulus'))

'delay'
WebUI.delay(3)

'click on Ya to confirm approve of the record'
WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/button_Ya_Lulus'))

'delay'
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

'delay'
WebUI.delay(3)

'click Ya to print the baucar'
WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/button_Ya_Cetak'))

'switch to next tab to display the baucar printed'
WebUI.switchToWindowIndex(1)

'delay'
WebUI.delay(3)

'wait 180seconds  for the baucar bayaran page to load '
WebUI.waitForPageLoad(180)

'take screenshot of baucar bayaran successfully printed and displayed'
WebUI.takeScreenshot()

'switch back to main tab'
WebUI.switchToWindowIndex(0)

'delay'
WebUI.delay(3)

'close the browser'
WebUI.closeBrowser()

