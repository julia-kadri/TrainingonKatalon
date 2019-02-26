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

'Open browser'
CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

'Login into the system'
CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 2), findTestData('ispekstestdata').getValue(
        2, 2))

'Change Peranan to Pengesah BN'
CustomKeywords.'reusablefunctions.reusablefunctions.PerananPengesahBN'()

'Select Pesanan Tempatan - Jumlah untuk disahkan from Dashboard'
WebUI.doubleClick(findTestObject('Perolehan/003 Pengesah/Dashboard_To_Sah'))

WebUI.delay(3)

WebUI.setText(findTestObject('Perolehan/003 Pengesah/input_No_Rekod'), GlobalVariable.PesananTempatanRekodID)

'Select first row from the list of Senarai Tugas'
WebUI.doubleClick(findTestObject('Perolehan/003 Pengesah/Senarai_Tugas_Item_No_1', [('text') : GlobalVariable.PesananTempatanRekodID]))

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

'get jumlah pesanan tempatan value '
String jumlah = WebUI.getText(findTestObject('Perolehan/003 Pengesah/label_Jumlah_pesanan_tempatan'))

'print jumlah'
println(jumlah)

'verify that jumlah pesanan tempatan is same as the record created by penyedia'
WebUI.verifyMatch(jumlah, '6.25', false)

'Click on Sah button to sah'
WebUI.click(findTestObject('Perolehan/003 Pengesah/button_sah'))

'click on Ya to confirm sah'
WebUI.click(findTestObject('Perolehan/003 Pengesah/Button_ya_sahkan'))

'Delay'
WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Perolehan/003 Pengesah/button_OK_berjaya_disah'), 60)

'click on OK to close the prompt after Sah is complete'
WebUI.click(findTestObject('Perolehan/003 Pengesah/button_OK_berjaya_disah'))

WebUI.closeBrowser()

