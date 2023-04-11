/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;

/**
 *
 * @author SUITE
 *
 */
public interface CustomerService {
    public List<Customer> findAll();
    public Customer findById(Long id);
    public Customer findByEmail(String email);
    public Customer buscarPorTelf(String phone);
    public Customer add(Customer customer);
    public Customer update(Long id, Customer customer);
    public void delete(Long id);
}
