import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qasecure.denvergov.org/oamfed/idp/samlv20?SAMLRequest=nVLLbsIwEPyVyHcS4vC0CFIKqorU0ghoD70ZewOWEjt4ndD+fUOggh5aVZV8sNazO7MzniAvclqypHJ7vYJDBei89yLXyM4vMamsZoajQqZ5AcicYOvk6ZFRv8tKa5wRJideggjWKaNnRmNVgF2DrZWAl9VjTPbOlciCQAiJ57JrePzLvaPN0RemCDSvS74DXxrizRuA0vw08dp%2F4Aiisg0CdA12Z2rf2F1geJGBDJQsg5PomnaJd2+sgHarmGQ8RyDeYh6T9XI2pMNebxuNo+1o3M36PQij0aAX9cNsIDkdyAaIKUdUNVxbEStYaHRcu5jQbjjuhLQ5G0pZNGLRwO9HwzfipRc%2F7pSWSu9+N297BiF72GzSTvq83rQDaiXBLhv0v3x7BYutZw0DmU7aEFkr397m+rsy%2FhUmmf5NwiS4JbrQluy0xWKemlyJDy%2FJc3OcWeCu2czZCtqQCu5+1hL6YVtRspO1UAYFV3kipQVEEkwvvN%2F%2F7%2FQT&RelayState=https%3A%2F%2Fccdservicetest.service-now.com%2Fnavpage.do')

WebUI.setText(findTestObject('SNOW Service Now - Login (Test Env)/Page_Login - CCD/input_username'), 'bZOOwfITmwCPEFBbgERKaBUFvT7fZSIgsuP0zKT7jG4=')

WebUI.setText(findTestObject('SNOW Service Now - Login (Test Env)/Page_Login - CCD/input_password'), 'klAo0LRrMKfafHknwWkW7Q==')

WebUI.click(findTestObject('SNOW Service Now - Login (Test Env)/Page_Login - CCD/input_formButton'))

WebUI.closeBrowser()

