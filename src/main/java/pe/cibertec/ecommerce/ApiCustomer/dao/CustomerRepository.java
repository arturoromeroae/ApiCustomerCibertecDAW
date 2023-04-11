/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;

/**
 *
 * @author SUITE
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{
    Customer findByEmail(String email);
    
    //@Query ("select c from customer where c.phone=?1 and c.email=?2")
    //Customer buscarPorTelf(String phone, Strin phone);
    
    @Query ("select c from Customer c where c.phone=?1")
    Customer buscarPorTelf(String phone);
}
