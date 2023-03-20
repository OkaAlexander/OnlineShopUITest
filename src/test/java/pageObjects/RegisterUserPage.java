package pageObjects;

import abstractPage.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RegisterUserPage extends AbstractPage {
    private final By btnSignUp1=By.cssSelector("a[href='/login']");
    private final By btnSignUp2=By.cssSelector("button[data-qa='signup-button']");
    private final By accountInfo=By.xpath("//b[normalize-space()='Enter Account Information']");
    private final By txtName=By.cssSelector("input[name='name']");
    private final By txtEmail=By.cssSelector("input[data-qa='signup-email']");
    private final By txtExistName=By.cssSelector("#name");
    private final By txtExistEmail=By.cssSelector("#email");
    private final By btn=By.cssSelector("button[data-qa='signup-button']");
    private final By radioGenderMale=By.cssSelector("#id_gender1");
    private final By radioGenderFemale=By.id("#id_gender2");
    private final By createPassword=By.cssSelector("input#password");
    private final By dropdownDay=By.cssSelector("#days");
    private final By title=By.cssSelector("#id_gender1");
    private final By cmbSelectNews=By.cssSelector("#newsletter");
    private final By password=By.cssSelector("#password");
    private final By cmbDay=By.cssSelector("#days");
    private final By cmbMonth=By.cssSelector("#months");
    private final By cmbYear=By.cssSelector("#years");
    private final By receivedSpecial=By.cssSelector("#optin");
    private final By txtFirstName=By.cssSelector("#first_name");
    private final By txtLastName=By.cssSelector("#last_name");
    private final By txtCompany=By.cssSelector("#company");
    private final By txtAddress1=By.cssSelector("#address1");
    private final By txtAddress2=By.cssSelector("#address2");
    private final By txtCountry=By.cssSelector("#country");
    private final By txtState=By.cssSelector("#state");
    private final By txtCity=By.cssSelector("#city");
    private final By txtZipcode=By.cssSelector("#zipcode");
    private final By txtPhoneNumber=By.cssSelector("#mobile_number");
    private final By clickCreateAccount=By.cssSelector("button[data-qa='create-account']");
    private final By accountCreated=By.cssSelector("h2[class='title text-center'] b");
    private final By btnContinue=By.cssSelector(".btn.btn-primary");
    private final By loginAsUser=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b");
    private final By loginHeading=By.cssSelector("div[class='login-form'] h2");
    private final By loginMail=By.cssSelector("input[data-qa='login-email']");
    private final By loginPassword=By.cssSelector("input[data-qa='login-password']");
    private final By loginSubmit=By.cssSelector("button[data-qa='login-button']");
    private final By deleteAccount=By.cssSelector("a[href='/delete_account']");
    private final By invalidUserNameOrPassword=By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
    private final By logOut=By.cssSelector("a[href='/logout']");
    private final By existMailError=By.cssSelector("body > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > form:nth-child(2) > p:nth-child(5)");
    private final By product=By.cssSelector("a[href='/products']");
    public RegisterUserPage(WebDriver driver){
        super(driver);
    }


    private void fillTextInput(By inputElement,String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputElement));
        driver.findElement(inputElement).clear();
        driver.findElement(inputElement).sendKeys(text);
    }
    public void setTxtName(String name){
        fillTextInput(txtName,name);
    }
    public void setTxtEmail(String email){
        fillTextInput(txtEmail,email);
    }
    public void clickSignUp1(){
        driver.findElement(btnSignUp1).click();
    }
    public void clickSignUp2(){
        driver.findElement(btnSignUp2).click();
    }
    public String getPageTitle(){
        return driver.getTitle();
    }
    public void radioGenderMale(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(radioGenderMale));
        driver.findElement(radioGenderMale).click();
    }
    public boolean isRadioGenderMaleSelected(){ return driver.findElement(radioGenderMale).isSelected();
    }
    public boolean getTxtExistName(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtExistName));
        return driver.findElement(txtExistName).getText().equals(txtExistName);
    }
    public boolean isAccountInfoVisible(){return driver.findElement(accountInfo).isDisplayed();
    }
    public void setPassword(String password){
        fillTextInput(createPassword,password);
    }

    public void setDay(int day){
        Select select=new Select(driver.findElement(cmbDay));
        select.selectByVisibleText(String.valueOf(day));
    }
    public void setCmbMonth(String month){
        Select select=new Select(driver.findElement(cmbMonth));
        select.selectByVisibleText(month);
    }

    public void setCmbYear(int year){
        Select select=new Select(driver.findElement(cmbYear));
        select.selectByVisibleText(String.valueOf(year));
    }
    public void setCmbSelectNews(){
        driver.findElement(cmbSelectNews).click();
    }
    public void setFirstName(String firstName){
        fillTextInput(txtFirstName,firstName);
    }
    public void setTxtLastName(String lastName){
        fillTextInput(txtLastName,lastName);
    }
    public void setTxtCompany(String company){
        fillTextInput(txtCompany,company);
    }
    public void setTxtAddress1(String address1){
        fillTextInput(txtAddress1,address1);
    }
    public void setTxtAddress2(String address2){
        fillTextInput(txtAddress2,address2);
    }
    public void setTxtCountry(String country){
        Select select=new Select(driver.findElement(txtCountry));
        select.selectByVisibleText(String.valueOf(country));
    }
   public void setTxtState(String state){
        fillTextInput(txtState,state);
   }

   public void setTxtCity(String city){
        fillTextInput(txtCity,city);
   }
   public void setTxtZipcode(int zipcode){
        fillTextInput(txtZipcode, String.valueOf(zipcode));
   }
   public void setTxtPhoneNumber(String phoneNumber){
        fillTextInput(txtPhoneNumber, String.valueOf(phoneNumber));
   }
   public void setClickCreateAccount(){
        driver.findElement(clickCreateAccount).click();
   }
    public   void clickRandomCheckbox(WebDriver driver, By locator) {
        List<WebElement> checkboxes = driver.findElements(locator);
        Random rand = new Random();
        int randomIndex = rand.nextInt(checkboxes.size());
        checkboxes.get(randomIndex).click();
        clickRandomCheckbox(driver, By.cssSelector("input[type='checkbox']"));
    }
    public boolean isAccountCreatedVisible(){
        return driver.findElement(accountCreated).isDisplayed();
    }
    public void clickContinue(){
        driver.findElement(btnContinue).click();
    }
    public boolean isLogin(){
       return driver.findElement(loginAsUser).isDisplayed();
    }
    public void btnDeleteAccount(){
         driver.findElement(deleteAccount).click();

    }
    public boolean isAccountDeleted(){
        return driver.findElement(deleteAccount).isDisplayed();
    }

}
