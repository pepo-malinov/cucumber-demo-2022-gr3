package uni.fmi.models;

import java.util.Set;

/**
 * 
 */
public class Post {

	private String title;
	private String content;
	private User owner;
	private Set<Comment> comments;

	/**
	 * Default constructor
	 */
	public Post() {
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
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 * @return
	 */
	public void setTitle(String title) {
		this.title = title;
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
	public Set<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments
	 * @return
	 */
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

}