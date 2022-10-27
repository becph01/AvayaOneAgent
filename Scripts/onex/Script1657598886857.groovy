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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Windows.startApplicationWithTitle('C:\\Program Files (x86)\\Avaya\\Avaya one-X Agent\\OneXAgentUI.exe', 'Avaya one-X Agent')

Windows.click(findWindowsObject('Object Repository/onex/OK_Button'))

Windows.click(findWindowsObject('Object Repository/onex/Username_TextBox'))

Windows.setText(findWindowsObject('Object Repository/onex/Username_TextBox'), 'System.Windows.Automation.TextPattern')

Windows.click(findWindowsObject('Object Repository/onex/Image(1)'))

Windows.click(findWindowsObject('Object Repository/onex/Image(2)'))

Windows.click(findWindowsObject('Object Repository/onex/Text'))

Windows.click(findWindowsObject('Object Repository/onex/Text(1)'))

Windows.click(findWindowsObject('Object Repository/onex/Custom'))

Windows.click(findWindowsObject('Object Repository/onex/Custom'))

Windows.click(findWindowsObject('Object Repository/onex/MenuItem'))

Windows.click(findWindowsObject('Object Repository/onex/Image(3)'))

Windows.click(findWindowsObject('Object Repository/onex/Image(4)'))

Windows.closeApplication()

