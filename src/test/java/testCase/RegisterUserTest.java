package testCase;

import baseClass.BaseClass;
import com.github.javafaker.Faker;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import utilities.RegisterUserDto;

import java.security.Key;
import java.time.Month;
import java.util.Arrays;

public class RegisterUserTest extends BaseClass {
    private static RegisterUserDto registerUserDto;
    private static Faker faker;

    @BeforeAll
    public static void setUpRegisterUserData(){
        registerUserDto=new RegisterUserDto();
        faker=new Faker();
        registerUserDto.setName(faker.name().firstName()+" "+faker.name().lastName());
        registerUserDto.setEmailAddress(faker.internet().emailAddress());
        registerUserDto.setFirstName(faker.name().firstName());
        registerUserDto.setLastName(faker.name().lastName());
        registerUserDto.setCompanyName(faker.company().name());
        registerUserDto.setAddressOne(faker.address().fullAddress());
        registerUserDto.setAddressTwo(faker.address().secondaryAddress());
        registerUserDto.setState(faker.country().capital());
        registerUserDto.setCity(faker.address().cityName());
        registerUserDto.setZipCode(faker.address().zipCode());


    }
    @Test
    @DisplayName("verify valid register user")
    public void TC_001RegisterUserData(){
        assertEquals(registerUserPage.getPageTitle(),"Automation Exercise","Page not opened");
        registerUserPage.getPageTitle();
        registerUserPage.clickSignUp1();
        registerUserPage.setTxtName(registerUserDto.getName());
        registerUserPage.setTxtEmail(registerUserDto.getEmailAddress());
        registerUserPage.clickSignUp2();
        assertTrue(registerUserPage.isAccountInfoVisible(),"account information not visible");
        registerUserPage.radioGenderMale();
        assertTrue(registerUserPage.isRadioGenderMaleSelected(),"Male radio button not checked");
        registerUserPage.setPassword("!@Password12345");
        registerUserPage.setDay(registerUserDto.getDay());
        registerUserPage.setCmbMonth(registerUserDto.getMonth());
        registerUserPage.setCmbYear(registerUserDto.getYear());
        registerUserPage.setCmbSelectNews();
        registerUserPage.setFirstName(registerUserDto.getFirstName());
        registerUserPage.setTxtLastName(registerUserDto.getLastName());
        registerUserPage.setTxtCompany(registerUserDto.getCompanyName());
        registerUserPage.setTxtAddress1(registerUserDto.getAddressOne());
        registerUserPage.setTxtAddress2(registerUserDto.getAddressTwo());
        registerUserPage.setTxtCountry(registerUserDto.getCountry());
        registerUserPage.setTxtState(registerUserDto.getState());
        registerUserPage.setTxtCity(registerUserDto.getCity());
        registerUserPage.setTxtZipcode(registerUserDto.getZipCode());
        registerUserPage.setTxtPhoneNumber("0553215783");
        registerUserPage.setClickCreateAccount();
        assertTrue(registerUserPage.isAccountCreatedVisible(),"Account not created");
        registerUserPage.clickContinue();
        //assertTrue(registerUserPage.isLogin(),"user not login");



    }
}
