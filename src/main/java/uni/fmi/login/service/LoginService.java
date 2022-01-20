package uni.fmi.login.service;

import java.util.Collections;
import java.util.List;

import uni.fmi.models.User;

public class LoginService {

	private static List<User> usersDb = Collections.singletonList(new User("Иван", "123!pass"));

	public static String login(final String username, final String password) {

		if (null == password || null == username) {
			return "Въведете име и парола!";
		}

		final boolean isUserExists = usersDb.stream()
				.anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password));

		// u.getUsername().equals(username) && u.getPassword().equals(password)
		// username!= null && username.equals(u.getUsername()) && password!= null &&
		// password.equals(u.getPassword())

		// "TTT".equals(u.getUsername()

		return isUserExists ? "Успешно влизане!" : "Грешни данни!";
	}

}
