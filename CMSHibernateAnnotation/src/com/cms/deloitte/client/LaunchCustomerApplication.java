package com.cms.deloitte.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

public class LaunchCustomerApplication {

	public static void startCustomerApp() {
		
		while (true) {
			CustomerDAO customerDAO = new CustomerDAOImpl();
			System.out.println("#### Welcome to Customer App(HibernateAnnotation) ####");
			System.out.println("#### 1. Add Customer ####");
			System.out.println("#### 2. Update Customer ####");
			System.out.println("#### 3. Delete Customer ####");
			System.out.println("#### 4. Fetch single Customers ####");
			System.out.println("#### 5. Fetch all the Customers ####");
			System.out.println("#### 6. Fetch all the Customers by bill amount ####");
			System.out.println("#### 7. Fetch all the Customers by bill amount and address ####");
			System.out.println("#### 10. E X I T ####");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your choice (1-10)");
			int choice = scanner.nextInt();
			if (choice == 1) {
				Customer customer = new Customer();
				customer.acceptCustomerDetails();

				if (customerDAO.isCustomerExists(customer.getCustomerId())) {
					System.out.println(customer.getCustomerId() + " already exists");
				} else {
					customerDAO.addCustomer(customer);
					System.out.println(customer.getCustomerId() + " added successfully");
				}
			}
			if (choice == 2) {
				System.out.println("Please enter the new details: ");
				Customer customer = new Customer();
				customer.acceptCustomerDetails();

				if (customerDAO.isCustomerExists(customer.getCustomerId())) {
					customerDAO.updateCustomer(customer);
					System.out.println(customer.getCustomerName() + " updated successfully");
				} else {
					System.out.println(customer.getCustomerId() + " does not exists");
				}
			}
			if (choice == 3) {
				System.out.println("Please enter customer Id to delete");
				int customerId = scanner.nextInt();
				if (customerDAO.isCustomerExists(customerId)) {
					customerDAO.deleteCustomer(customerId);
					System.out.println(customerId + " deleted successfully");
				} else {
					System.out.println(customerId + " does not exists");
				}
			}
			if (choice == 4) {
				System.out.println("Please enter customer Id to search");
				int customerId = scanner.nextInt();
				if (customerDAO.isCustomerExists(customerId)) {
					Customer customer = customerDAO.findCustomer(customerId);
					System.out.println(customer);
				} else {
					System.out.println(customerId + " does not exists");
				}
			}
			if (choice == 5) {
				List<Customer> allCustomers = new ArrayList<Customer>();
				allCustomers = customerDAO.listCustomers();
				System.out.println("List of customers: ");
				System.out.println(allCustomers);
			}
			if (choice == 6) {
				System.out.println("Please enter bill amount to search");
				int billAmount = scanner.nextInt();
				List<String> allNames = customerDAO.filterCustomer(billAmount);
				System.out.println("customers with bill amount greater than "+billAmount);
				System.out.println(allNames);
			}
			if (choice == 7) {
				System.out.println("Please enter bill amount to search");
				int billAmount = scanner.nextInt();
				System.out.println("Please enter address to search");
				String customerAddress = scanner.next();
				List<Customer> allNames = customerDAO.filterCustomer(customerAddress,billAmount);
				System.out.println("customers with bill amount greater than "+billAmount+" and address= "+customerAddress);
				System.out.println(allNames);
			}
			if (choice == 10) {
				System.out.println("Thanks for using my Hibernate customer app");
				System.exit(0);
			} 
		}
	}
}
