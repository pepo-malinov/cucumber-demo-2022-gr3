package uni.fmi.models;

import java.util.Set;

/**
 * 
 */
public class User {

	private String username;
	private String password;
	private String email;
	private Set<Role> roles;
	private Set<Post> posts;
	private Set<User> ownFriends;
	private Set<User> friends;
	private Set<Message> myMessages;
	private Set<Message> friendsMessages;

	/**
	 * Default constructor
	 */
	public User() {
		this(null, null, null);
	}

	public User(final String username, final String password) {
		this(username, password, null);
	}

	public User(final String username, final String password, final String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}

	/**
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 * @return
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param pass
	 * @return
	 */
	public void setPassword(String pass) {
		this.password = pass;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 * @return
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return
	 */
	public Set<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles
	 * @return
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	/**
	 * @return
	 */
	public Set<Post> getPosts() {
		return posts;
	}

	/**
	 * @param posts
	 * @return
	 */
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	/**
	 * @return
	 */
	public Set<User> getOwnFriens() {
		return ownFriends;
	}

	/**
	 * @return
	 */
	public Set<User> getFriends() {
		return friends;
	}

	/**
	 * @param friends
	 * @return
	 */
	public void setOwnFriends(Set<User> friends) {
		this.ownFriends = friends;
	}

	/**
	 * @param friends
	 * @return
	 */
	public void setFriends(Set<User> friends) {
		this.friends = friends;
	}

	/**
	 * @return
	 */
	public Set<Message> getFriendsMessages() {
		return friendsMessages;
	}

	/**
	 * @param frMessages
	 * @return
	 */
	public void setFriendsMessages(Set<Message> frMessages) {
		this.friendsMessages = frMessages;
	}

	/**
	 * @return
	 */
	public Set<Message> getMyMessages() {
		return myMessages;
	}

	/**
	 * @param messages
	 * @return
	 */
	public void setMyMessages(Set<Message> messages) {
		this.myMessages = messages;
	}

}