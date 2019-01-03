package com.rev.Beans;

public class Credentials {

public Credentials(int iD, String email, String password) {
		super();
		ID = iD;
		Email = email;
		Password = password;
	}
private int ID;
private String Email;
private String Password;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Email == null) ? 0 : Email.hashCode());
	result = prime * result + ID;
	result = prime * result + ((Password == null) ? 0 : Password.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Credentials other = (Credentials) obj;
	if (Email == null) {
		if (other.Email != null)
			return false;
	} else if (!Email.equals(other.Email))
		return false;
	if (ID != other.ID)
		return false;
	if (Password == null) {
		if (other.Password != null)
			return false;
	} else if (!Password.equals(other.Password))
		return false;
	return true;
}
@Override
public String toString() {
	return "Credentials [ID=" + ID + ", Email=" + Email + ", Password=" + Password + "]";
}
}