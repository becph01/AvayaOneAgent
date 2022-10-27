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
import com.kms.katalon.core.testobject.WindowsTestObject
import com.kms.katalon.core.util.ConsoleCommandBuilder
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.entity.repository.WindowsElementEntity.LocatorStrategy

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

ConsoleCommandBuilder.create("tskill OneXAgentUI").execSync()

//Windows.startApplicationWithTitle('C:\\Program Files (x86)\\Avaya\\Avaya one-X Agent\\OneXAgentUI.exe', 'Avaya one-X Agent')

CustomKeywords.'WindowsImprovedKeywords.startApplicationWithTitle'('C:\\Program Files (x86)\\Avaya\\Avaya one-X Agent\\OneXAgentUI.exe', 'Avaya one-X Agent')

Windows.click(findWindowsObject('Object Repository/onex/OK_Button'))

Windows.delay(2)

CustomKeywords.'WindowsImprovedKeywords.switchToWindowTitle'('Avaya one-X Agent')

Windows.click(findWindowsObject('Object Repository/onex/Username_TextBox'))

Windows.setText(findWindowsObject('Object Repository/onex/Username_TextBox'), 'hello')

Windows.clickElementOffset(findWindowsObject('Object Repository/onex/Image(1)'), 10, 10)

Windows.clickElementOffset(findWindowsObject('Object Repository/onex/Image(2)'), 10, 10)

Windows.clickElementOffset(findWindowsObject('Object Repository/onex/Image(3)'), 10, 10)

Windows.clickElementOffset(findWindowsObject('Object Repository/onex/Image(4)'), 10, 10)

Windows.clickElementOffset(findWindowsObject('Object Repository/onex/Image(5)'), 10, 10)

Windows.clickElementOffset(findWindowsObject('Object Repository/onex/ComboBox'), 10, 10)

Windows.clickElementOffset(findWindowsObject('Object Repository/onex/ListItem'), 10, 10)

Windows.clickElementOffset(findWindowsObject('Object Repository/onex/ComboBox(1)'), 10, 10)

Windows.clickElementOffset(findWindowsObject('Object Repository/onex/ListItem(1)'), 10, 10)

Windows.clickElementOffset(findWindowsObject('Object Repository/onex/Image(6)'), 10, 10)

ConsoleCommandBuilder.create("tskill OneXAgentUI").execSync()



