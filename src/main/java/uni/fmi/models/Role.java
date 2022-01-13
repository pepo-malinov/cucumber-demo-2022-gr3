package uni.fmi.models;

import java.util.Set;

/**
 * 
 */
public class Role {

	private String roleCode;
	private Set<User> users;

	/**
	 * Default constructor
	 */
	public Role() {
	}

	/**
	 * @return
	 */
	public String getRoleCode() {
		return roleCode;
	}

	/**
	 * @param code
	 * @return
	 */
	public void setRoleCode(String code) {
		this.roleCode = code;
	}

	/**
	 * @return
	 */
	public Set<User> getUsers() {
		return users;
	}

	/**
	 * @param users
	 * @return
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roleCode == null) ? 0 : roleCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Role other = (Role) obj;
		if (roleCode == null) {
			if (other.roleCode != null) {
				return false;
			}
		} else if (!roleCode.equals(other.roleCode)) {
			return false;
		}
		return true;
	}

}