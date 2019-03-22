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

'open chrome browser and input ispek URL'
CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

'login into the system'
CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 7), findTestData('ispekstestdata').getValue(
        2, 7))

'Click on icon Tukar Peranan'
WebUI.click(findTestObject('Perolehan/TukarPeranan/IconTukarPeranan'))

'Click Radio Button Penyedia PTJ'
WebUI.click(findTestObject('Perolehan/TukarPeranan/input_TukarPeranan', [('value') : '2474']))

'Click Ya to confirm change of role'
WebUI.click(findTestObject('Perolehan/TukarPeranan/button_Ya'))

WebUI.delay(25)

'Verify Peranan is now Pelulus BN'
WebUI.verifyTextPresent('Peranan : [Pelulus] Peringkat : [BN]', false)

'expand menu sisi'
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/a_ExpandMenuonLeft'))

'delay'
WebUI.delay(3)

'select menu Pengurusan Tunai'
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_PanelTitlePengurusanTunai'))

'delay'
WebUI.delay(3)

'select sub-menu post bayaran'
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_PostBayaran'))

'delay'
WebUI.delay(3)

'click on drop down no baucar'
WebUI.click(findTestObject('Perolehan/008 Post Bayaran/Drop_down_No_Baucar'))

'delay'
WebUI.delay(3)

'input no baucar that is saved in global variable'
WebUI.setText(findTestObject('Perolehan/008 Post Bayaran/input_No. Baucar_noBaucar'), GlobalVariable.Nombor_Baucar)

'delay'
WebUI.delay(3)

'click on the record after it has been filtered. only one record will be displayed based on no baucar entered'
WebUI.click(findTestObject('Perolehan/008 Post Bayaran/select_No_Baucar', [('text') : GlobalVariable.Nombor_Baucar]))

'delay'
WebUI.delay(3)

'click on button cari'
WebUI.click(findTestObject('Perolehan/008 Post Bayaran/button_Cari'))

'delay'
WebUI.delay(23)

'check on the checkbox which is located on the end of record '
WebUI.check(findTestObject('Perolehan/008 Post Bayaran/checkbox_proses'))

'click button proses to process the record'
WebUI.click(findTestObject('Perolehan/008 Post Bayaran/button_proses'))

'delay'
WebUI.delay(3)

'click on Ya to confirm process'
WebUI.click(findTestObject('Perolehan/008 Post Bayaran/button_Ya_Proses'))

'delay'
WebUI.delay(10)

'wait for 180seconds for the pop-up to display, before verify the posting is successful'
WebUI.waitForElementPresent(findTestObject('Perolehan/008 Post Bayaran/button_OK'), 500)

'verify that posting is successful'
WebUI.verifyTextPresent('Proses Posting Berjaya.', false)

'take screenshot'
WebUI.takeScreenshot()

'click on ok button to close the prompt'
WebUI.click(findTestObject('Perolehan/008 Post Bayaran/button_OK'))

'delay'
WebUI.delay(3)

'close browser'
WebUI.closeBrowser()

