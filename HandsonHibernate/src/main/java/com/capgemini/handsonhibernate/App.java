package com.capgemini.handsonhibernate;

import com.capgemini.handsonhibernate.dao.CustomersDao;
import com.capgemini.handsonhibernate.entity.Addresses;
import com.capgemini.handsonhibernate.entity.Customers;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Customers Customers = new Customers("John");
        Customers Customers1 = new Customers("Bruce");
        
        Addresses addresses = new Addresses("12,MainStreet,Houston");
        Addresses addresses1 = new Addresses("3002,Mt.Doctor,Gotham,NY");
        
        CustomersDao CustomersDao = new CustomersDao();
        Customers.setAddresses(addresses);
        Customers1.setAddresses(addresses1);
        
        CustomersDao.saveCustomers(Customers);
        CustomersDao.saveCustomers(Customers1);
    }
}
