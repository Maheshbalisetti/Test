package com.src.service;
import java.util.*;

import com.src.model.Customer;
import com.src.model.CustomerInterface;

public class CustomerService implements CustomerInterface {

	Scanner sc = new Scanner(System.in);
	int account_number_format = 223300;

	@Override
	public void createAccount() {
		System.out.println("-----CREATING ACCOUNT-----\n");
		System.out.println("FULL NAME :\n");
		String name = sc.next();
		System.out.println("ADDRESS :\n");
		String address = sc.next();
		System.out.println("PHONE NUMBER : \n");
		long phone = sc.nextLong();
		System.out.println("ENTER AMOUNT TO DEPOSIT : \n");
		int amount = sc.nextInt();

		Customer cs = new Customer(account_number_format, name, amount, address, phone);

		//customer_array[Customer.getCustomer_count()] = cs;;
		
		ca.add(cs);

		System.out.println("ACCOUNT CREATED SUCCESFULLY");
		System.out.println("YOUR ACCOUNT NUMBER IS : " + account_number_format);

		account_number_format++;
		Customer.incrementCount();
		// return;

	}

	@Override
	public void updateAccount() {
		System.out.println("ENTER ACCOUNT NUMBER : \n");
		int an = sc.nextInt();
		boolean flag = false;
		for (Customer i : ca) {
			if (i.account_number == an) {
				System.out.println("ENTER UPDATED FULL NAME :\n");
				i.setCustomer_name(sc.next());
				System.out.println("ENETR UPDATED ADDRESS :\n");
				i.setAddress(sc.next());
				System.out.println("ENTER UPDATEDPHONE NUMBER : \n");
				i.setPhone_number(sc.nextLong());

				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("UPDATED SUCCESFULL");
		} else {
			System.out.println("INVALID INPUT");
		}
	}

	@Override
	public void deleteAccount() {
		System.out.println("ENTER ACCOUNT NUMBER");
		int id = sc.nextInt();
		boolean f = false;
		for (Customer i : ca) {
			if (i.account_number == id) {
				f = true;
//				for (int j = i; j < Customer.getCustomer_count() - 1; j++) {
//					customer_array[j] = customer_array[j + 1];
//				}
				//customer_array[Customer.getCustomer_count() - 1] = null;
				ca.remove(i);
				Customer.decrementCount();
				break;
			}

		}
		if (f) {
			System.out.println("DELETED SUCCESFULLY\n");
		} else {
			System.out.println("DELETED UNSUCCESFULL\n");
		}

	}

	@Override
	public void depositMoney() {
		System.out.println("ENTER ACCOUNT NUMBER : \n");
		int an = sc.nextInt();
		boolean flag = false;
		for (Customer i : ca) {
			if (i.account_number == an) {
				System.out.println("ENTER AMOUNT:");
				float bal = sc.nextFloat();

				i.setBalance(bal + i.getBalance());

				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("DEPOSITED SUCCESFULLY");
		} else {
			System.out.println("INVALID INPUT");
		}
	}

	@Override
	public void sendMoney() {
		System.out.println("ENTER ACCOUNT NUMBER : \n");
		int an = sc.nextInt();
		for (Customer i : ca) {
			if (i != null) {
				if (i.account_number == an) {
					System.out.println("ENTER AMOUNT:");
					float bal = sc.nextFloat();

					if (i.getBalance() < bal) {
						System.out.println("INSUFFICEINT FUNDS");
						break;
					} else {
						System.out.println("ENTER RECIPIENTS ACCOUNT NUMBER : \n");
						int rac = sc.nextInt();
						for (Customer j : ca) {
							if (j != null) {
								if (j.account_number == rac) {
									i.setBalance(i.getBalance() - bal);
									j.setBalance(j.getBalance() + bal);

									System.out.println("TRANSACTION SUCCESFULL");
									break;
								}
							}
						}
					}

				}
			}
		}

	}

	@Override
	public void checkBalance() {
		System.out.println("ENTER ACCOUNT NUMBER : \n");
		int an = sc.nextInt();
		for (Customer i : ca) {
			if (i.account_number == an) {
				i.display();
				break;
			}
		}
	}

	@Override
	public void displayCustomers() {

		for (Customer x : ca) {
			if (x != null) {
				x.display();
			}
		}

	}

}
