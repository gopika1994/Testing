package Testpkgfb;

import org.testng.annotations.Test;

import Basepkgfb.Baseclass;
import Pagepkgfb.Fbpage;

public class Fbtest extends Baseclass {
	
@Test
public void verifyLoginWithValidCred ()
{
	Fbpage p1=new Fbpage(driver);
	
	// reading the data from execl file by the specified path
	
	String xl="D:\\data.Xlsx";
	
	String Sheet="Sheet1";
	
	int rowCount =Excelutil.getRowCount(xl ,Sheet);
	
	for(int i=1;i<=rowCount; i++)
	{
		String Username=Excelutil.getCellValue(xl, Sheet,i,0);
		System.out.println("username---" + Username);
		String pwd=Excelutil.getCellValue(xl, sheet,i,1);
		System.out.println("password---"+ pwd);
		
		
		
		//passing username and password as parameters
		
		// submitting data by clicking on login button
		
		p1.setvalues(Username, pwd);
		p1.login();
	}
	
	
}
}
