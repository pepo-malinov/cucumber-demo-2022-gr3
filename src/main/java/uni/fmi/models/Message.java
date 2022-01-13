package uni.fmi.models;

/**
 * 
 */
public class Message {

	private String content;
	private User owner;
	private User friend;

	/**
	 * Default constructor
	 */
	public Message() {
	}

	/**
	 * @return
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 * @return
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return
	 */
	public User getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 * @return
	 */
	public void setOwner(User owner) {
		this.owner = owner;
	}

	/**
	 * @return
	 */
	public User getFriend() {
		return friend;
	}

	/**
	 * @param friend
	 * @return
	 */
	public void setFriend(User friend) {
		this.friend = friend;
	}

}