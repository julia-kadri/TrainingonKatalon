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


RunConfiguration.setExecutionSettingFile('C:\\Users\\CONSUL~1\\AppData\\Local\\Temp\\Katalon\\20190319_142419\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://analytics.katalon.com/team/11445/project/14359\')\n\nWebUI.setText(findTestObject(\'Katalon_Analytics/input_Log In_username\'), \'julia_kadri@yahoo.com\')\n\nWebUI.setEncryptedText(findTestObject(\'Katalon_Analytics/input_Log In_password\'), \'QZnHAMqfV2b6gs9nEggHmQ==\')\n\nWebUI.click(findTestObject(\'Katalon_Analytics/button_Log In\'))\n\nWebUI.click(findTestObject(\'Katalon_Analytics/a_12\'))\n\nWebUI.click(findTestObject(\'Katalon_Analytics/button_Terimaan_btn btn-link\'))\n\nWebUI.setText(findTestObject(\'Katalon_Analytics/input_This Execution will be deleted permanently.Please type the Execution ID () to confirm._form-control\'), \n    \'1\')\n\nWebUI.click(findTestObject(\'Katalon_Analytics/button_Delete\'))\n\nWebUI.closeBrowser()\n\nWebUI.openBrowser(\'\')\n\n', FailureHandling.STOP_ON_FAILURE, true)

