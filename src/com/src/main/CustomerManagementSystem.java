package com.src.main;
import java.util.*;

import com.src.model.CustomerInterface;
import com.src.service.CustomerService;

public class CustomerManagementSystem {

	public static void main(String[] args) {

		CustomerInterface ci = new CustomerService();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		boolean flag = true;

		do {
			System.out.println("CHOOSE FROM THE FOLLOWING OPTIONS :\r\n" + "			1. CREATE ACCOUNT\r\n"
					+ "			2. UPDATE ACCOUNT\r\n" + "			3. DELETE ACCOUNT\r\n"
					+ "			4. DEPOSIT MONEY\r\n" + "			5. SEND MONEY\r\n"
					+ "			6. CHECK BALANCE\r\n" + "			7. DISPLAY CUSTOMERS\r\n" + "			9. EXIT\r\n"
					+ "");

			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				ci.createAccount();
				break;
			}
			case 2: {
				ci.updateAccount();
				break;
			}
			case 3: {
				ci.deleteAccount();
				break;
			}
			case 4: {
				ci.depositMoney();
				break;
			}
			case 5: {
				ci.sendMoney();
				break;
			}
			case 6: {
				ci.checkBalance();
				break;
			}
			case 7: {
				ci.displayCustomers();
				break;
			}
			case 9: {
				flag = false;
				break;
			}
			default: {
				System.out.println("INVALID INPUT");
			}
			}
		} while (flag);

	}

}
