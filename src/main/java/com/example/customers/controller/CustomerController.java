package com.example.customers.controller;

import com.example.customers.entity.Customer;
import com.example.customers.model.Page;
import com.example.customers.model.Pageable;
import com.example.customers.service.abstraction.IPageableService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/customers")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class CustomerController {

    private final IPageableService<Customer> customerService;
    private final int itemsCount;

    public CustomerController(IPageableService<Customer> customerService, @ConfigProperty(name = "items.count") int itemsCount) {
        this.customerService = customerService;
        this.itemsCount = itemsCount;
    }

    @GET
    public Page<Customer> getByPage(Pageable pageable) {
        pageable.setItemsCount(itemsCount);
        return customerService.getAllByPageable(pageable);
    }
}
