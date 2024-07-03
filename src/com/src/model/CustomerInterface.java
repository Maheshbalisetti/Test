package com.src.model;

import java.util.ArrayList;

public interface CustomerInterface {
	//public static Customer customer_array[] = new Customer[10];
	
	public static ArrayList<Customer> ca = new ArrayList<Customer>();

	public void createAccount();

	public void updateAccount();

	public void deleteAccount();

	public void depositMoney();

	public void sendMoney();

	public void checkBalance();

	public void displayCustomers();

}
