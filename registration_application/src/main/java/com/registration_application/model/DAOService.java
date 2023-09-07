package com.registration_application.model;
//Abstraction
public interface DAOService {
	public void connectDB();
    public boolean verifyLogin(String username,String password);
    public void saveRegistration(String first_name, String last_name, String street, String address,String city,String state,String email,String phone);
    public void deleteRegistration(String first_name);
    public void updateRegistration(String first_name);
    public boolean existsByEmail(String email);
    public boolean existsByMobile(String mobile);
}
