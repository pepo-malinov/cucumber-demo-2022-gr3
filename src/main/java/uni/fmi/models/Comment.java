package uni.fmi.models;

import java.util.Set;

/**
 * 
 */
public class Comment {

	private String content;
	private Post post;
	private Set<Comment> children;
	private Comment parrent;

	/**
	 * Default constructor
	 */
	public Comment() {
	}

	/**
	 * @return
	 */
	public Comment getParent() {
		return parrent;
	}

	/**
	 * @param parent
	 * @return
	 */
	public void setParent(Comment parent) {
		this.parrent = parent;
	}

	/**
	 * @return
	 */
	public Set<Comment> getChildren() {
		return children;
	}

	/**
	 * @param children
	 * @return
	 */
	public void setChildren(Set<Comment> children) {
		this.children = children;
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
	public Post getPost() {
		return post;
	}

	/**
	 * @param post
	 * @return
	 */
	public void setPost(Post post) {
		this.post = post;
	}

}