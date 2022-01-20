package uni.fmi.login;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.login.model.LoginScreenModel;

public class LoginSteps {

	private LoginScreenModel loginModel;

	@Given("^Потребителя отваря екрана за вход в системата$")
	public void openLoginScree() throws Throwable {
		loginModel = new LoginScreenModel();
	}

	@When("^Въведе валидно потребителско име$")
	public void addUsername() throws Throwable {
		loginModel.setUsername("Иван");
	}

	@When("^въведе валидна потребителска парола$")
	public void addPassword() throws Throwable {
		loginModel.setPassword("123!pass");
	}

	@When("^натисне бутона за вход в системата$")
	public void clickLoginButton() throws Throwable {
		loginModel.clickLoginButton();
	}

	@Then("^Вижда съобщение за успех\\.$")
	public void checkMessage() throws Throwable {
		assertEquals("Успешно влизане!", loginModel.getMessage());
	}

	@Then("^Вижда съобщение за липсващи данни\\.$")
	public void checkForMissingDataMessage() throws Throwable {
		assertEquals("Въведете име и парола!", loginModel.getMessage());
	}

	@When("^Въведе невалидно потребителско име$")
	public void addWrongUsername() throws Throwable {
		loginModel.setUsername("Wrong user name");
	}

	@Then("^Вижда съобщение грешни данни\\.$")
	public void checkForWrongDataMessage() throws Throwable {
		assertEquals("Грешни данни!", loginModel.getMessage());
	}

}
