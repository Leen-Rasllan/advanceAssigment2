package labMagento;

import java.util.Random;

import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class prameters {

	static String creatbouttunXpath ="//div[@class='panel header']//a[normalize-space()='Create an Account']";
	static String firstXpath ="//input[@id='firstname']";
	static String lastXpath ="//input[@id='lastname']";
	static String mailXpath ="//input[@id='email_address']";
	static String paswordlXpath ="//input[@id='password']"; 
	static String confpaswordlXpath ="//input[@id='password-confirmation'] "; 
    static String doneXpath ="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]";
	static String signInXpath ="//div[@class='panel header']//a[contains(text(),'Sign In')]";    
	static String emailXpath ="//input[@id='email']"; 
	static String pasXpath ="//fieldset[@class='fieldset login']//input[@id='pass']";
	static String logOutPage ="https://magento.softwaretestingboard.com/customer/account/logout/";
	 static String doneBouttunXpath ="//fieldset[@class='fieldset login']//button[@id='send2']";
	
	static String url = "https://magento.softwaretestingboard.com/";
	static String signInUrl="https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/";

	static SoftAssert Check = new SoftAssert();

	static String[] fnames = { "kamil", "kaady","Saraa", "sadeen","saamy","sanaa","sleem"};
	static Random first = new Random(); 
	

	 static int randomFirstIndex = first.nextInt(fnames.length);
	 static String randomFirstName = fnames[randomFirstIndex];
 
	static String[] lnames = { "ahmed", "mohammed","badeea", "wadeea","jamil","Abosnaa","sleem"};
	static Random last = new Random();
	
	static int randomLastIndex = last.nextInt(lnames.length);
	static String randomLastName = lnames[randomLastIndex];
	
	
	
	static Random random = new Random();
	static int randomNumber = random.nextInt(30000); // Generate a random number // Generate a random number

	static String email_address = randomLastName + randomFirstName + randomNumber + "@gmail.com";
	static String paswordnum =  "Asd@dsa123123";
	
	
	
	





	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}