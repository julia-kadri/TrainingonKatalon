import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\CONSUL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Perolehan\\009 Penyedia Cetak Baucar Bayaran\\001 Penyedia Cetak Baucar Bayaran\\20190322_170000\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

'Open browser and get to ispek URL'
not_run: CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

'Login into the application'
not_run: CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 4), findTestData(
        'ispekstestdata').getValue(2, 4))

'Click on icon Tukar Peranan'
not_run: WebUI.click(findTestObject('Perolehan/TukarPeranan/IconTukarPeranan'))

'Click Radio Button Penyedia PTJ'
not_run: WebUI.click(findTestObject('Perolehan/TukarPeranan/input_TukarPeranan', [('value') : '255']))

'Click Ya to confirm change of role'
not_run: WebUI.click(findTestObject('Perolehan/TukarPeranan/button_Ya'))

not_run: WebUI.delay(20)

'Verify Peranan is now Penyedia PTJ'
not_run: WebUI.verifyTextPresent('Peranan : [Penyedia] Peringkat : [PTJ]', false)

'Expand menu sisi'
not_run: WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/a_ExpandMenuonLeft'))

'Delay'
not_run: WebUI.delay(3)

'click on menu akaun belum bayar'
not_run: WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/Menu_Akaun Belum Bayar'))

'delay'
not_run: WebUI.delay(3)

'click on menu carian akaun belum bayar to retrieve the baucar id that is previously processed'
not_run: WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_Carian_Akaun_Belum_Bayar'))

'delay'
not_run: WebUI.delay(3)

'click on drop down jenis carian'
not_run: WebUI.click(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/Drop_down_Jenis_Carian'))

'select carian by nombor baucar'
not_run: WebUI.click(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/Select_No_Baucar'))

'input no baucar that is a global variable baucar id'
not_run: WebUI.setText(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/Input_No_Baucar'), GlobalVariable.Nombor_Baucar)

'click on button cari to search for the record'
not_run: WebUI.click(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/button_Cari'))

'delay'
WebUI.delay(3)

'click on button cetak to print the baucar again'
WebUI.click(findTestObject('Perolehan/009 Penyedia Cetak Baucar Bayaran/button_Cetak'))

'delay'
WebUI.delay(20)

WebUI.switchToWindowIndex(1)

'wait for the page to load the document which will take some times'
WebUI.waitForPageLoad(180, FailureHandling.STOP_ON_FAILURE)

'take the screen shot of the document loaded'
WebUI.takeScreenshot()

'switch to window tab index 1 to get the baucar displayed'
WebUI.switchToWindowIndex(0)

'delay'
WebUI.delay(3)

'close browser'
WebUI.closeBrowser()

''', 'Test Cases/Perolehan/009 Penyedia Cetak Baucar Bayaran/001 Penyedia Cetak Baucar Bayaran', new TestCaseBinding('Test Cases/Perolehan/009 Penyedia Cetak Baucar Bayaran/001 Penyedia Cetak Baucar Bayaran',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
