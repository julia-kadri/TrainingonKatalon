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

'open browser and enter ispek URL'
CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

'login into the system'
CustomKeywords.'reusablefunctions.reusablefunctions.Login'(GlobalVariable.PelulusPTJ, findTestData('ispekstestdata').getValue(
        2, 7))

'Click on icon Tukar Peranan'
WebUI.click(findTestObject('Perolehan/TukarPeranan/IconTukarPeranan'))

'Click Radio Button Penyedia PTJ'
WebUI.click(findTestObject('Perolehan/TukarPeranan/input_TukarPeranan', [('value') : GlobalVariable.RBPelulusPTJ]))

'Click Ya to confirm change of role'
WebUI.click(findTestObject('Perolehan/TukarPeranan/button_Ya'))

WebUI.delay(20)

'Verify Peranan is now Pelulus PTJ'
WebUI.verifyTextPresent('Peranan : [Pelulus] Peringkat : [PTJ]', false)

'click on menu sisi to expand menu selection'
WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/001 Pelulus PT/Menu_Sisi'))

'delay'
WebUI.delay(3)

'select on sub-menu akaun belum bayar'
WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/001 Pelulus PT/Menu_Akaun Belum Bayar'))

'delay'
WebUI.delay(3)

'expand baucar bayaran sub-menu'
WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/001 Pelulus PT/Menu_Expand_Baucar_Bayaran'))

'delay'
WebUI.delay(3)

'select menu Integrasi dalaman'
WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/001 Pelulus PT/Menu_Integrasi_Dalaman'))

'delay'
WebUI.delay(3)

'enter baucar bayaran rekod id into the filter field'
WebUI.setText(findTestObject('Perolehan/007 Proses Baucar Bayaran/001 Pelulus PT/input_No_Rekod'), GlobalVariable.ArahanBayaranRekodID)

'delay'
WebUI.delay(3)

'double click on the filter result'
WebUI.doubleClick(findTestObject('Perolehan/007 Proses Baucar Bayaran/001 Pelulus PT/select_No_Rekod', [('text') : GlobalVariable.ArahanBayaranRekodID]))

'delay'
WebUI.delay(3)

'get the value of Nama Penerima'
String namapembekal = WebUI.getText(findTestObject('Perolehan/007 Proses Baucar Bayaran/002 Pelulus IK/pembekal_penerima - CEK', 
        [('text') : GlobalVariable.nama_pembekal_cek]))

WebUI.delay(3)

'verify that nama penerima is what is set when filling in dengan pemfaktoran = Ya'
WebUI.verifyMatch(namapembekal, GlobalVariable.nama_pembekal_cek, false)

'get text of amount from the screen'
String jumlahkeseluruhan = WebUI.getText(findTestObject('Perolehan/007 Proses Baucar Bayaran/001 Pelulus PT/jumlah_amaun'))

'delay'
WebUI.delay(15)

'verify that amount is a match'
WebUI.verifyMatch(jumlahkeseluruhan, GlobalVariable.jumlah_baucar_bayaran, false)

'click on button Lulus to approve the record'
WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/001 Pelulus PT/button_Lulus'))

'delay'
WebUI.delay(3)

'click Ya to confirm approve'
WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/001 Pelulus PT/button_Ya_Lulus'))

'delay'
WebUI.delay(3)

'Get text of No Baucar from the prompt'
String No_Baucar = WebUI.getText(findTestObject('Perolehan/007 Proses Baucar Bayaran/001 Pelulus PT/div_Rekod Berjaya Diluluskan'))

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

'wait for the element to be clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/007 Proses Baucar Bayaran/001 Pelulus PT/button_Ya_Cetak'), 300)

'declare object to find as an element'
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Perolehan/007 Proses Baucar Bayaran/001 Pelulus PT/button_Ya_Cetak'), 
    300)

'click on the element using javascript'
WebUI.executeJavaScript('arguments[0].click', Arrays.asList(element))

'click on Ya button to confirm cetak'
WebUI.click(findTestObject('Perolehan/007 Proses Baucar Bayaran/001 Pelulus PT/button_Ya_Cetak'))

'switch to second tab to get screenshot of baucar bayaran after select cetak = Ya'
WebUI.switchToWindowIndex(1)

'delay'
WebUI.delay(3)

'wait 180seconds  for the baucar bayaran page to load '
WebUI.waitForPageLoad(180)

'take screenshot of baucar bayaran'
WebUI.takeScreenshot()

'switch back the tab to main tab'
WebUI.switchToWindowIndex(0)

'delay'
WebUI.delay(3)

'close the browser'
WebUI.closeBrowser()

