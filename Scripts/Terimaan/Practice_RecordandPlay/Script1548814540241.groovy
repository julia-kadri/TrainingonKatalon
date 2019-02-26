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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://175.143.52.101:7011/1SPEKSv2/')

WebUI.setText(findTestObject('30JAN_Record_and_Play/input_field_username'), '790214108888')

WebUI.setEncryptedText(findTestObject('30JAN_Record_and_Play/input_field_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('30JAN_Record_and_Play/input_LOG Masuk_button'))

WebUI.click(findTestObject('30JAN_Record_and_Play/a_LeftMenuSisi'))

WebUI.delay(5)

WebUI.click(findTestObject('30JAN_Record_and_Play/div_Akaun Belum Terima'))

WebUI.delay(5)

WebUI.click(findTestObject('30JAN_Record_and_Play/a_Tanpa Bil'))

WebUI.delay(20)

WebUI.click(findTestObject('30JAN_Record_and_Play/span_REKOD BARU_button'))

WebUI.delay(10)

WebUI.click(findTestObject('30JAN_Record_and_Play/a_OkDatabase'))

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/a__JenisTerimaan'))

WebUI.clearText('30JAN_Record_and_Play/input_()_kadar_faedah', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('30JAN_Record_and_Play/input_()_kadar_faedah'), '0')

/**
 * WebUI.setText(findTestObject('30JAN_Record_and_Play/input_()_kadar_faedah'), String.valueOf('5000'))
 */
WebUI.sendKeys(findTestObject('30JAN_Record_and_Play/input_()_kadar_faedah'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('30JAN_Record_and_Play/input_()_kadar_faedah'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('30JAN_Record_and_Play/input_()_kadar_faedah'), '5.000')

WebUI.sendKeys(findTestObject('30JAN_Record_and_Play/input_()_kadar_caj_lewat'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('30JAN_Record_and_Play/input_()_kadar_caj_lewat'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('30JAN_Record_and_Play/input_()_kadar_caj_lewat'), '1.000')

