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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.sklep.bmsystem.pl/index.php?route=common/home')

WebUI.click(findTestObject('Object Repository/Page_Sklep Demo/span_Moje Konto_caret'))

WebUI.click(findTestObject('Object Repository/Page_Sklep Demo/a_Logowanie'))

WebUI.setText(findTestObject('Object Repository/Page_Logowanie/input_Adres E-Mail_email'), 'darekb@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Logowanie/input_Haso_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_Logowanie/input_Odzyskaj haso_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_Moje Konto/a_Desktops'))

WebUI.click(findTestObject('Object Repository/Page_Moje Konto/a_Mac (1)'))

WebUI.click(findTestObject('Object Repository/Page_/img_Poka_img-responsive'))

WebUI.click(findTestObject('Object Repository/Page_/button_Dodaj do Koszyka'))

WebUI.click(findTestObject('Object Repository/Page_/img_Podsumowanie_img-responsive'))

WebUI.click(findTestObject('Object Repository/Page_Sklep Demo/span_2 Produkt - 200.00'))

WebUI.click(findTestObject('Object Repository/Page_Sklep Demo/strong_Podsumowanie'))

WebUI.click(findTestObject('Object Repository/Page_Podsumowanie/input_WojewdztwoRegion_button-payment-address'))

WebUI.click(findTestObject('Object Repository/Page_Podsumowanie/input_WojewdztwoRegion_button-shipping-address'))

WebUI.setText(findTestObject('Object Repository/Page_Podsumowanie/textarea_Dodaj Komentarz do Zamwienia_comment'), 'testowy komentarz')

WebUI.click(findTestObject('Object Repository/Page_Podsumowanie/input_Dodaj Komentarz do Zamwienia_button-s_5f2c4e'))

WebUI.click(findTestObject('Object Repository/Page_Podsumowanie/input_Terms  Conditions_agree'))

WebUI.click(findTestObject('Object Repository/Page_Podsumowanie/input_Terms  Conditions_button-payment-method'))

WebUI.click(findTestObject('Object Repository/Page_Podsumowanie/input_205.00_button-confirm'))

WebUI.click(findTestObject('Object Repository/Page_Zamwienie zostao zoone/a_Kontynuuj'))

WebUI.closeBrowser()

