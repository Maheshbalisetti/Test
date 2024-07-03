package com.src.model;

public class Customer {
	public int account_number;
	private String customer_name;
	private float balance;
	private String address;
	private long phone_number;
	private static int customer_count = 0;

	public Customer(int account_number, String customer_name, float balance, String address, long phone_number) {
		this.account_number = account_number;
		this.customer_name = customer_name;
		this.balance = balance;
		this.address = address;
		this.phone_number = phone_number;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public float getBalance() {
		return balance;
	}

	public String getAddress() {
		return address;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public static int getCustomer_count() {
		return customer_count;
	}

	public static void incrementCount() {
		customer_count++;
	}

	public static void decrementCount() {
		customer_count--;
	}

	public void display() {
		System.out.println(
				"ACCOUNT NUMBER :" + account_number + " || NAME :" + customer_name + "|| ACCOUNT BALANCE :" + balance);
	}
}
