package com;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testng_dp {
	
	 
    String xlFilePath = "D://TestData.xlsx";
    String sheetName = "Sheet1";
    ExcelApiTest eat = null;
    Logger log = Logger.getLogger(testng_dp.class);
    @Test(dataProvider = "userData")
    public void fillUserForm(String userName, String passWord,String value)
    {
    	log.info("************* Start Test ************");
    	log.info("getting username"+userName);
       System.out.println("UserName: "+ userName);
       log.info("getting paswordr"+passWord);
       System.out.println("PassWord: "+ passWord);
       log.info("getting value"+value);
       System.out.println("value"+ value);
       System.out.println("*********************");
       log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");
    }
     
     
    @DataProvider(name="userData")
    public Object[][] userFormData() throws Exception
    {
        Object[][] data = testData(xlFilePath, sheetName);
        return data;
    }
     
    public Object[][] testData(String xlFilePath, String sheetName) throws Exception
    {
        Object[][] excelData = null;
        eat = new ExcelApiTest(xlFilePath);
        int rows = eat.getRowCount(sheetName);
        int columns = eat.getColumnCount(sheetName);
                 
        excelData = new Object[rows-1][columns];
         
        for(int i=1; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                excelData[i-1][j] = eat.getCellData(sheetName, j, i);
            }
             
        }
        return excelData;
    }

}
