package com.loginAndRegisterExampleProgram;

public interface UserDAODetails {

	public void insert(user u);

	public boolean findUser(String username, String password);

}
