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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_Homepage)

'Login into the system'
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

WebUI.delay(5)

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

'input no record based on global variable value captured during sah simpan'
WebUI.setText(findTestObject('Perolehan/004 Pelulus/input_No_Rekod'), GlobalVariable.PesananTempatanRekodID)

'Double click on item no 1 from senarai tugas'
WebUI.doubleClick(findTestObject('Perolehan/004 Pelulus/Senarai_Tugas_Item_No_1', [('text') : GlobalVariable.PesananTempatanRekodID]))

'Delay'
WebUI.delay(3)

'Get todays year and date'
mydate = new Date()

'Get todays date with format dd/MM/yyyy'
String formattedDate = mydate.format('dd/MM/yyyy')

'Get year with format yyyy'
String formattedYear = mydate.format('yyyy')

'print date in format dd/mm/yy'
println(formattedDate)

'print year in format yyyy'
println(formattedYear)

'Get Tahun Kewangan from screen'
String TahunKewangan = WebUI.getText(findTestObject('Perolehan/003 Pengesah/Label_tahun_kewangan'))

'verify tahun kewangan matches current year'
WebUI.verifyMatch(TahunKewangan, formattedYear, false)

'Get value of tarikh semasa'
String TarikhSemasa = WebUI.getText(findTestObject('Perolehan/003 Pengesah/Label_Tarikh_semasa'))

'verify tarikh semasa matches system date'
WebUI.verifyMatch(TarikhSemasa, formattedDate, false)

'Delay'
WebUI.delay(20)

'get jumlah pesanan tempatan value '
String jumlah = WebUI.getText(findTestObject('Perolehan/003 Pengesah/label_Jumlah_pesanan_tempatan'))

'Delay'
WebUI.delay(3)

'print jumlah'
println(jumlah)

'verify jumlah is matched with the one created by Penyedia which is 6.25'
WebUI.verifyMatch(jumlah, GlobalVariable.TotalAmaunPT, false)

'Click on Lulus button to approve'
WebUI.click(findTestObject('Perolehan/004 Pelulus/button_Lulus'))

'click on Ya to confirm approve'
WebUI.click(findTestObject('Perolehan/004 Pelulus/button_ya_luluskan'))

'Delay'
WebUI.delay(8)

'wait for the element to become clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/004 Pelulus/button_OK_Berjaya_lulus'), 180)

'Get text of Rekod ID from the alert popup'
String RekodBerjayaLulus = WebUI.getText(findTestObject('Perolehan/004 Pelulus/RekodBerjayaLulus'))

'print the value'
println(RekodBerjayaLulus)

'create new variable to only take rekod id from the get text value'
String PTDokumenID = RekodBerjayaLulus[(46..58)]

'print the value'
println(PTDokumenID)

'set global variable value of RekodID with variable RekodNo'
GlobalVariable.PesananTempatanDokumenID = PTDokumenID

'Delay'
WebUI.delay(3)

'wait for the element to be clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'), 
    300)

'declare object to find as an element'
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Perolehan/004 Pelulus/button_OK_Berjaya_lulus'), 300)

'click on the element using javascript'
WebUI.executeJavaScript('arguments[0].click', Arrays.asList(element))

'click on OK to close the prompt after lulus is complete'
WebUI.click(findTestObject('Perolehan/004 Pelulus/button_OK_Berjaya_lulus'))

'close browser'
WebUI.closeBrowser()

