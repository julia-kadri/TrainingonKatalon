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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://175.143.52.101:7011/1SPEKSv2/')

WebUI.setText(findTestObject('Object Repository/RecordandPlay/input_LOG Masuk_textbox-text v'), '790214108888')

WebUI.setEncryptedText(findTestObject('RecordandPlay/input_LOG Masuk_textbox-text v_1'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/RecordandPlay/input_LOG Masuk_button large b'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/RecordandPlay/a_Housekeeping_layout-button-r'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/RecordandPlay/div_Akaun Belum Terima'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/RecordandPlay/a_Tanpa Bil'))

WebUI.delay(10)

CustomKeywords.'ispeks.random.perananPenyediaPTJ'()

/**
WebUI.click(findTestObject('RecordandPlay/img_TukarPeranan'))

WebUI.verifyTextPresent('Tukar Jabatan, PTJ, Peringkat & Peranan', false)

WebUI.click(findTestObject('RecordandPlay/input_Penyedia_PTJ'))

WebUI.click(findTestObject('RecordandPlay/a_YaTukarPeranan'))

WebUI.verifyTextPresent('Peranan : [Penyedia] Peringkat : [PTJ]', false, FailureHandling.STOP_ON_FAILURE)
*/
WebUI.delay(5)

WebUI.verifyTextPresent('JABATAN KERJA RAYA [021000]', false)

WebUI.click(findTestObject('Object Repository/RecordandPlay/div_Peranan  Penyedia Peringka'))

WebUI.verifyTextPresent('Peranan : [Penyedia] Peringkat : [PTJ]', false)

WebUI.click(findTestObject('Object Repository/RecordandPlay/a_Housekeeping_layout-button-r'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/RecordandPlay/div_Akaun Belum Terima'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/RecordandPlay/a_Tanpa Bil'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/RecordandPlay/span_REKOD BARU'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/RecordandPlay/a_OkSimpan'))

WebUI.click(findTestObject('Object Repository/RecordandPlay/a__dropdownJenisterimaan'))

WebUI.click(findTestObject('Object Repository/RecordandPlay/div_TERIMAAN BAYARAN PELBAGAI'))

int RN = ((Math.random() * 10000 //This gives a random number between 0 and 10000
    ) as int)

//WebUI.setText(findTestObject('Login/input_NoKadPengenalan'), 'KONTRAK' + RN)
WebUI.setText(findTestObject('RecordandPlay/input__nodaftarsyarikat'), '123123999')

WebUI.setText(findTestObject('RecordandPlay/input__namapembayar'), 'julia kadri')

WebUI.setText(findTestObject('RecordandPlay/input__alamat'), 'sepang')

WebUI.setText(findTestObject('RecordandPlay/input__poskod'), '43000')

WebUI.click(findTestObject('RecordandPlay/Drop_down_negeri'))

WebUI.click(findTestObject('RecordandPlay/Select_Negeri_Selangor'))

WebUI.click(findTestObject('RecordandPlay/Drop_down_Daerah'))

WebUI.click(findTestObject('RecordandPlay/Select_Daerah_Sepang'))

WebUI.setText(findTestObject('RecordandPlay/input__perihal'), 'this is a test for Terimaan')

WebUI.getText(findTestObject('Object Repository/RecordandPlay/span_29012019'))

WebUI.click(findTestObject('RecordandPlay/a__tambahmaklumatterperinci'))

WebUI.click(findTestObject('RecordandPlay/a_Cara_Bayaran'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/RecordandPlay/div_TUNAI'))

WebUI.setText(findTestObject('RecordandPlay/input_amaun'), '20')

WebUI.click(findTestObject('Object Repository/RecordandPlay/span_Kemaskini'))

WebUI.click(findTestObject('Object Repository/RecordandPlay/span_tambahmaklumatterperinci'))

WebUI.click(findTestObject('Object Repository/RecordandPlay/a__dropdownKodAkaun'))

WebUI.setText(findTestObject('Object Repository/RecordandPlay/input_Perihal_perihal'), 'akaun amanah jabatan kerja raya')

WebUI.click(findTestObject('Object Repository/RecordandPlay/div_AKAUN AMANAH JABATAN KERJA'))

WebUI.setText(findTestObject('Object Repository/RecordandPlay/input__amaunmaklumatterperinci'), '20')

WebUI.click(findTestObject('Object Repository/RecordandPlay/span_simpanmaklumatterperinci'))

WebUI.click(findTestObject('Object Repository/RecordandPlay/span_Simpan'))

WebUI.click(findTestObject('Object Repository/RecordandPlay/a_YaSimpan'))

WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/RecordandPlay/a_OkSimpan'))

WebUI.click(findTestObject('Object Repository/RecordandPlay/span_Sah Simpan'))

WebUI.click(findTestObject('Object Repository/RecordandPlay/a_YaSahSimpan'))

WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/RecordandPlay/a_OkSahSimpan'))

WebUI.click(findTestObject('Object Repository/RecordandPlay/a_Cetak'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.closeBrowser()

