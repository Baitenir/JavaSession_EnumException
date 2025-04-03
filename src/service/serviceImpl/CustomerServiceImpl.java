package service.serviceImpl;

import exception.MyException;
import models.Customer;
import service.CustomerService;

import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public String register(long agencyId) {
        Customer customer = new Customer();
        try{
            System.out.println("Write your name:");
            customer.setName(new Scanner(System.in).nextLine());
            System.out.println("Write phone number: ");
            String userPhoneNumber = new Scanner(System.in).nextLine();
            if (!userPhoneNumber.matches("\\+996\\d{9}")){
                throw new MyException("Phone number must have '+996' and 9 symbols!");
            } else {
                customer.setPhoneNumber(userPhoneNumber);
            }
            System.out.println("Write email: ");
            String userEmail = new Scanner(System.in).nextLine();
            if (!userPhoneNumber.contains("@")){
                throw new MyException("Gmail don't have a '@' ");
            } else {
                customer.setEmail(userEmail);
            }
            System.out.println("Write password:");
            customer.setPassword(new Scanner(System.in).nextLine());
            System.out.println("Write your gender ('MALE or FEMALE'): ");
            String userGender = new Scanner(System.in).nextLine();
            if (userGender.equalsIgnoreCase("MALE")){
                customer.setGender(true);
            } else if (userGender.equalsIgnoreCase("FEMALE")){
                customer.setGender(false);
            } else {
                throw new MyException("Gender must be only 'Male' or 'Female'!");
            }
        } catch (MyException e){
            return "error" +e.getMessage();
        }



        return "";
    }

    @Override
    public String login() {
        return "";
    }
}
