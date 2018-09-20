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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), demo_usr)

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), demo_pwd)

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

if (is_valid == 'true') {
    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/button_Book Appointment (1)'), 0)

    WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Visit Date (Required)_vi'), '19/09/2018')

    WebUI.setText(findTestObject('Page_CURA Healthcare Service/textarea_Comment_comment'), 'cc laule')

    WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

    WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Go to Homepage'))

    WebUI.closeBrowser()
} else if (is_valid == 'false') {
    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/p_Login failed Please ensure t'), 0)

    WebUI.closeBrowser()
}

