
package controller;

import controller.Customer;
import java.util.ArrayList;
import java.util.List;


public class CustomerDirectory {
    public static List<Customer> customerList;
    
    public CustomerDirectory(){
       customerList= new ArrayList<Customer>();
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
    
    public void addCustomer(Customer c){
        customerList.add(c);
    }
    
    public void sayhi(){
        System.out.println(customerList.get(0).getFirstName());
    }
}
