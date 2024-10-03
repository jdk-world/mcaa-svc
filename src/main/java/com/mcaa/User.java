package com.mcaa;

public class User {
	private Long id;
	private String name;
	private String password;
	private String email; // New field for email
	private String phone; // New field for phone
	private String organization; // New field for organization
	private String role; // New field for user role
	private String profilePictureUrl; // New field for profile picture URL
	private MSME msme; // Assuming a relationship with MSME

	// Constructors
	public User(Long id, String name, String password, String email, String phone, String organization, String role,
			String profilePictureUrl, MSME msme) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.organization = organization;
		this.role = role;
		this.profilePictureUrl = profilePictureUrl;
		this.msme = msme;
	}

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProfilePictureUrl() {
		return profilePictureUrl;
	}

	public void setProfilePictureUrl(String profilePictureUrl) {
		this.profilePictureUrl = profilePictureUrl;
	}

	public MSME getMsme() {
		return msme;
	}

	public void setMsme(MSME msme) {
		this.msme = msme;
	}

	class MSME {
		private Long id;
		private String name;
		private String sector;
		private String location;
		private String contactNumber;

		// Constructors
		public MSME(Long id, String name, String sector, String location, String contactNumber) {
			this.id = id;
			this.name = name;
			this.sector = sector;
			this.location = location;
			this.contactNumber = contactNumber;
		}

		// Getters and Setters
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSector() {
			return sector;
		}

		public void setSector(String sector) {
			this.sector = sector;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
	}

}
