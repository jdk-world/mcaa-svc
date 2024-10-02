package com.mcaa;

public class User {
    private Long id;
    private String name;
    private String password;
    private MSME msme; // Assuming a relationship with MSME

    // Constructors
    public User(Long id, String username, String password, MSME msme) {
        this.id = id;
        this.name = username;
        this.password = password;
        this.msme = msme;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
