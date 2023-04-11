/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;
import pe.cibertec.ecommerce.ApiCustomer.service.CustomerService;

/**
 *
 * @author SUITE
 */
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/findAll")
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Customer findById(@PathVariable Long id) {
        return customerService.findById(id);
    }

    @GetMapping("/findByEmail/{email}")
    public Customer findByEmail(@PathVariable String email) {
        return customerService.findByEmail(email);
    }

    @GetMapping("/buscarPorTelf")
    public Customer buscarPorTelf(@RequestParam String phone) {
        return customerService.buscarPorTelf(phone);
    }

    @PostMapping("/add")
    public Customer add(@RequestBody Customer customer) {
        return customerService.add(customer);
    }

    @PutMapping("/update/{id}")
    public Customer update(@PathVariable Long id, @RequestBody Customer customer) {
        return customerService.update(id, customer);
    }
    
    @DeleteMapping("/delete/{id}")
    public void update(@PathVariable Long id) {
        customerService.delete(id);
    }
}
