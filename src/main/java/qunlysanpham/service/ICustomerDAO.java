package qunlysanpham.service;

import qunlysanpham.model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerDAO {

    public int findIndexById(int id);

    public  void add(Customer customer) throws SQLException;

    public Customer findById(int id);

    public List<Customer> findAll();

    List<Customer> findByName(String name);

    public boolean delete(int id) throws SQLException;

    public boolean update(Customer customer)throws SQLException;
}

