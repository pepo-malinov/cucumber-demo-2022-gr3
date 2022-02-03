package uni.fmi;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import uni.fmi.models.Role;
import uni.fmi.models.User;

public class TestSet {
	@Test
	public void testSetWithStrings() {
		final Set<String> testInstance = new HashSet<String>();
		String value1 = "value";
		testInstance.add(value1);
		String value2 = "value";
		testInstance.add(value2);
		String value3 = "value3";
		testInstance.add(value3);
		assertEquals(2, testInstance.size());
	}

	@Test
	public void testSetWithRoles() {
		final Set<Role> testInstance = new HashSet<Role>();
		Role value1 = new Role();
		value1.setRoleCode("ADMIN");
		testInstance.add(value1);
		Role value2 = new Role();
		value2.setRoleCode("ADMIN");
		testInstance.add(value2);
		Role value3 = new Role();
		value3.setRoleCode("USER");
		testInstance.add(value3);
		assertEquals(2, testInstance.size());
	}

	@Test
	public void testCreateUser() {
		final User user = new User("Ivan", "pass123");
		configureUser(user);
		// Pesho - 2
		// Ivan - 0
		System.out.println("[testCreateUser] - " + user.getUsername());
		assertEquals("Ivan", user.getUsername());
	}

	private void configureUser(final User userLocal) {
		// userLocal = new User("Pesho", "pass123");
		// userLocal.setUsername("Pesho");
		System.out.println("[configureUser] - " + userLocal.getUsername());
	}

	@Test
	public void testCreateUserName() {
		final String user = "Ivan";
		configureUserName(user);
		// Pesho - 2
		// Ivan - 0
		System.out.println("[testCreateUser] - " + user);
		assertEquals("Ivan", user);
	}

	private void configureUserName(String userLocal) {
		userLocal = "Pesho";
		System.out.println("[configureUser] - " + userLocal);
	}

}
