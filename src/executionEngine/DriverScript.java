package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.ActionKeywords;
import utility.ExcelUtils;

public class DriverScript {

	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		
		
		String sPath = "//Selenium-ToolsQA//src//dataEngine//DataEngine.xlsx";
		ActionKeywords ActionKeywords = new ActionKeywords();
		
		//Pass the PathName so the util class can read the file
		ExcelUtils excelUtilObj = new ExcelUtils();
		excelUtilObj.setExcelFile(sPath, "Test Steps");
		
		for(int i=1;i<=9;i++){
			String ActionKeywordString = excelUtilObj.getCellData(i, 3);
			
			//Comparing the value of Excel cell with all the project keywords
			if(ActionKeywordString.equals("openBrowser")){
	                    //This will execute if the excel cell value is 'openBrowser'
				//Action Keyword is called here to perform action
				ActionKeywords.openBrowser();}
			else if(ActionKeywordString.equals("navigate")){
				ActionKeywords.navigate();}
			else if(ActionKeywordString.equals("click_MyAccount")){
				ActionKeywords.click_MyAccount();}
			else if(ActionKeywordString.equals("input_Username")){
				ActionKeywords.input_Username();}
			else if(ActionKeywordString.equals("input_Password")){
				ActionKeywords.input_Password();}
			else if(ActionKeywordString.equals("click_Login")){
				ActionKeywords.click_Login();}
			else if(ActionKeywordString.equals("waitFor")){
				ActionKeywords.waitFor();}
			else if(ActionKeywordString.equals("click_Logout")){
				ActionKeywords.click_Logout();}
			else if(ActionKeywordString.equals("closeBrowser")){
				ActionKeywords.closeBrowser();}
			
		}
		


	}

}
