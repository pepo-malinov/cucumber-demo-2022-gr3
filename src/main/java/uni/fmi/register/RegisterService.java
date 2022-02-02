package uni.fmi.register;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import uni.fmi.models.User;

public class RegisterService {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);
	private static List<User> usersDB = new ArrayList<>();

	public static String register(String username, String firstPassword, String secondPassword, String email) {

		intDb();
		
		if (null == firstPassword || firstPassword.isBlank()) {
			return "Въведете парола!";
		}

		if (!firstPassword.equals(secondPassword)) {
			return "Въведете еднакви пароли!";
		}

		if (username == null || username.isBlank()) {
			return "Въведете име!";
		}

		if (username.length() < 4) {
			return "Потребителското име трябва да е мин. четери синвола!";
		}
		if (!validate(email)) {
			return "Въведете валид email!";
		}
		boolean isUsernameExists = usersDB.stream().anyMatch(u -> u.getUsername().equals(username));
		if (isUsernameExists) {
			return "Потребителското име е заето!";
		}

		final User newUser = new User(username, firstPassword, email);
		usersDB.add(newUser);
		return "Успешна регистрация!";
	}

	private static void intDb() {
		usersDB.clear();
		usersDB.add(new User("Пешо", "Пешо123", "pesho@abv.bg"));
	}

	private static boolean validate(String emailStr) {
		final Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}
}
