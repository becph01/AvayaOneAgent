import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.regex.Matcher
import java.util.regex.Pattern

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.WindowsTestObject
import com.kms.katalon.core.testobject.WindowsTestObject.LocatorStrategy
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import io.appium.java_client.windows.WindowsElement

import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.RemoteWebElement

Windows.startApplicationWithTitle('putty', 'PuTTY Configuration')

Windows.click(findWindowsObject('Object Repository/Putty/ComboBox'))

Windows.switchToDesktop()

import java.util.regex.Matcher
import java.util.regex.Pattern
import com.kms.katalon.core.testobject.WindowsTestObject

def clickDropdownItem(String pattern) {
	def dummyTestObject = new WindowsTestObject('');
	dummyTestObject.setLocator('ListItem');
	dummyTestObject.setLocatorStrategy(LocatorStrategy.TAG_NAME);
	def items = Windows.findElements(findWindowsObject('Object Repository/Putty/All_ListItem'));
	for (def itemI : items) {
		println itemI.text
		Pattern patternObject = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		Matcher matcher = patternObject.matcher(itemI.text);
		if (matcher.find()) {
			itemI.click();
			return;
		}
	}
}

WebUI.openBrowser("google.com")

//WebUI.click(null)


println Windows.getText(findWindowsObject('Object Repository/Putty/ListItem'))
Windows.click(findWindowsObject('Object Repository/Putty/ListItem'))
Windows.switchToApplication()

Windows.click(findWindowsObject('Object Repository/Putty/ComboBox'))

Windows.switchToDesktop();
clickDropdownItem('SUP');
Windows.switchToApplication();

Windows.click(findWindowsObject('Object Repository/Putty/ComboBox'))

Windows.switchToDesktop()
Windows.click(findWindowsObject('Object Repository/Putty/ListItem(1)'))
Windows.switchToApplication()

Windows.click(findWindowsObject('Object Repository/Putty/ComboBox'))

Windows.switchToDesktop()
Windows.click(findWindowsObject('Object Repository/Putty/ListItem(2)'))
Windows.switchToApplication()

Windows.click(findWindowsObject('Object Repository/Putty/Button'))

