package uni.fmi.register;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import uni.fmi.HomeScreenModel;

public class RegisterSteps {

	private final HomeScreenModel registerScreenModel;

	public RegisterSteps(final HomeScreenModel registerScreenModel) {
		this.registerScreenModel = registerScreenModel;
	}

	@Given("^Потребителя отваря екрана за регистрация на нов потребител$")
	public void openRegisterScreen() throws Throwable {
		//registerScreenModel =new HomeScreenModel();
	}

	/*
	 * @When("^Въведе потребителско име: \"([^\"]*)\"$") public void
	 * addUsername(final String username) throws Throwable {
	 * registerScreenModel.setUsername(username); }
	 */

	@When("^Въведе парола: \"([^\"]*)\"$")
	public void addFirstPassword(final String password) throws Throwable {
		registerScreenModel.setFirstPassword(password);
	}

	@When("^Въведе втора парола: \"([^\"]*)\"$")
	public void addSecondPassword(final String password) throws Throwable {
		registerScreenModel.setSecondPassword(password);
	}

	@When("^Въведе електронна поща: \"([^\"]*)\"$")
	public void addEmail(final String email) throws Throwable {
		registerScreenModel.setEmail(email);
	}

	@When("^Натисне бутона за регистрация$")
	public void clickRegisterButton() throws Throwable {
		registerScreenModel.clickRegisterButton();
	}

	/*
	 * @Then("^Вижда съобщение: \"([^\"]*)\"$") public void checkMessage(final
	 * String expectedMessage) throws Throwable { assertEquals(expectedMessage,
	 * registerScreenModel.getMessage()); }
	 */
}
