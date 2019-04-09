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
CustomKeywords.'reusablefunctions.reusablefunctions.Login'(GlobalVariable.PengesahBN, findTestData('ispekstestdata').getValue(
        2, 6))

'Click on icon Tukar Peranan'
WebUI.click(findTestObject('Perolehan/TukarPeranan/IconTukarPeranan'))

'Click Radio Button Penyedia PTJ'
WebUI.click(findTestObject('Perolehan/TukarPeranan/input_TukarPeranan', [('value') : GlobalVariable.RBPengesahBN]))

'Click Ya to confirm change of role'
WebUI.click(findTestObject('Perolehan/TukarPeranan/button_Ya'))

WebUI.delay(20)

'Verify Peranan is now Penyemak BN'
WebUI.verifyTextPresent('Peranan : [Pengesah] Peringkat : [BN]', false)

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
WebUI.setText(findTestObject('Perolehan/003 Pengesah/input_No_Rekod'), GlobalVariable.PesananTempatanRekodID)

'Select first row from the list of Senarai Tugas'
WebUI.doubleClick(findTestObject('Perolehan/003 Pengesah/Senarai_Tugas_Item_No_1', [('text') : GlobalVariable.PesananTempatanRekodID]))

'delay'
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

'delay'
WebUI.delay(3)

'get jumlah pesanan tempatan value '
String jumlah = WebUI.getText(findTestObject('Perolehan/003 Pengesah/label_Jumlah_pesanan_tempatan'))

'print jumlah'
println(jumlah)

'verify that jumlah pesanan tempatan is same as the record created by penyedia'
WebUI.verifyMatch(jumlah, GlobalVariable.TotalAmaunPT, false)

'Click on Sah button to sah'
WebUI.click(findTestObject('Perolehan/003 Pengesah/button_sah'))

'delay'
WebUI.delay(3)

'click on Ya to confirm sah'
WebUI.click(findTestObject('Perolehan/003 Pengesah/Button_ya_sahkan'))

'Delay'
WebUI.delay(5)

'wait for the element to become clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/003 Pengesah/button_OK_berjaya_disah'), 60)

'wait for the element to be clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'), 
    300)

'declare object to find as an element'
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Perolehan/003 Pengesah/button_OK_berjaya_disah'), 
    300)

'click on the element using javascript'
WebUI.executeJavaScript('arguments[0].click', Arrays.asList(element))

'Delay'
WebUI.delay(5)

'click on OK to close the prompt after Sah is complete'
WebUI.click(findTestObject('Perolehan/003 Pengesah/button_OK_berjaya_disah'))

'close browser'
WebUI.closeBrowser()

