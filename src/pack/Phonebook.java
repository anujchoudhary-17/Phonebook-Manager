package pack;

public class Phonebook 
{
	private long phoneNumber;
	private String name;
	private String email;
	private boolean savedInSim;
	
	
	
Phonebook()
{
	
}



Phonebook(long phoneNumber,String name,String email,boolean savedInSim)
{
	setPhoneNumber(phoneNumber);
	setName(name);
	setEmail(email);
	setSavedInSim(savedInSim);
}



//----------------------PHONE NUMBER--------------------

public long getPhoneNumber() {
	return phoneNumber;
}



public void setPhoneNumber(long phoneNumber) {
	
	if((String.valueOf(phoneNumber).length()==10) && !(String.valueOf(phoneNumber).matches("\\d")) && !(String.valueOf(phoneNumber)==null))
	this.phoneNumber = phoneNumber;
	else
	{
		throw new IllegalArgumentException("Please Enter 10 digit phone number or Enter digits only");
	}
	
	
}


//-------------------------NAME---------------------------

public String getName() {
	return name;
}


public void setName(String name) {
	if(!(name==null))
	this.name = name;
	else
	{
		throw new IllegalArgumentException("Please enter Name !!!");
		
	}
}


//------------------------EMAIL---------------------------
public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
	
}




//----------------------SAVED IN SIM-----------------------
public boolean isSavedInSim() {
	return savedInSim;
}


public void setSavedInSim(boolean savedInSim) {
	this.savedInSim = savedInSim;
}	
	
	
	
	public String toString()
	{
		return "Name : "+name+" Phone Number : "+phoneNumber+" Email : "+email+" Saved in : "+savedInSim;
	}
	
	
	
	
}
