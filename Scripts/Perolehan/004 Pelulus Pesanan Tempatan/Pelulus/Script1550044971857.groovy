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

'Change role to Pelulus PTJ'
CustomKeywords.'reusablefunctions.reusablefunctions.PerananPelulusPTJ'()

'Select Pesanan Tempatan - Jumlah untuk diluluskan'
WebUI.doubleClick(findTestObject('Perolehan/004 Pelulus/Dashboard_To_Lulus'))

'Delay'
WebUI.delay(3)

WebUI.setText(findTestObject('Perolehan/004 Pelulus/input_No_Rekod'), GlobalVariable.PesananTempatanRekodID)

'Double click on item no 1 from senarai tugas'
WebUI.doubleClick(findTestObject('Perolehan/004 Pelulus/Senarai_Tugas_Item_No_1', [('text') : GlobalVariable.PesananTempatanRekodID]))

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

WebUI.delay(20)

'get jumlah pesanan tempatan value '
String jumlah = WebUI.getText(findTestObject('Perolehan/003 Pengesah/label_Jumlah_pesanan_tempatan'))

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

WebUI.delay(3)

'click on OK to close the prompt after lulus is complete'
WebUI.click(findTestObject('Perolehan/004 Pelulus/button_OK_Berjaya_lulus'))

WebUI.closeBrowser()

