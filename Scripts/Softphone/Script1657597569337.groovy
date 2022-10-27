import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.ConsoleCommandBuilder
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

ConsoleCommandBuilder.create("tskill IPOfficeSoftphone").execSync()

Windows.startApplicationWithTitle('C:\\Program Files (x86)\\Avaya\\Softphone\\IPOfficeSoftphone.exe', '')

//CustomKeywords.'WindowsImprovedKeywords.startApplicationWithTitle'('C:\\Program Files (x86)\\Avaya\\Softphone\\IPOfficeSoftphone.exe', 'Softphone Login')

Windows.click(findWindowsObject('Object Repository/softphone/ComboBox'))

Windows.click(findWindowsObject('Object Repository/softphone/Text'))

Windows.click(findWindowsObject('Object Repository/softphone/Edit'))

Windows.setText(findWindowsObject('Object Repository/softphone/Edit'), 'My Server')

Windows.click(findWindowsObject('Object Repository/softphone/Edit(1)'))

Windows.setText(findWindowsObject('Object Repository/softphone/Edit(1)'), 'My Username')

Windows.click(findWindowsObject('Object Repository/softphone/Edit(2)'))

Windows.setText(findWindowsObject('Object Repository/softphone/Edit(2)'), 'My Password')

Windows.click(findWindowsObject('Object Repository/softphone/RememberLogin_Label'))

Windows.click(findWindowsObject('Object Repository/softphone/LogInAutomatically_Label'))

Windows.click(findWindowsObject('Object Repository/softphone/MinimizeToSystemTray_Label'))

Windows.click(findWindowsObject('Object Repository/softphone/MinimizeToSystemTray_Label'))

Windows.click(findWindowsObject('Object Repository/softphone/LogInAutomatically_Label'))

Windows.click(findWindowsObject('Object Repository/softphone/RememberLogin_Label'))

Windows.click(findWindowsObject('Object Repository/softphone/Login_Button'))

Windows.delay(2)

//Windows.click(findWindowsObject('Object Repository/softphone/Cancel_Button'))

Windows.closeApplication()

ConsoleCommandBuilder.create("tskill IPOfficeSoftphone").execSync()
