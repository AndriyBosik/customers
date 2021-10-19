package com.example.customers.controller;

import com.example.customers.entity.Shift;
import com.example.customers.model.Page;
import com.example.customers.model.Pageable;
import com.example.customers.service.abstraction.IPageableService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/shifts")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class ShiftController {

    private final IPageableService<Shift> shiftService;
    private final int itemsCount;

    public ShiftController(IPageableService<Shift> shiftService, @ConfigProperty(name = "items.count") int itemsCount) {
        this.shiftService = shiftService;
        this.itemsCount = itemsCount;
    }

    @GET
    public Page<Shift> getByPage(Pageable pageable) {
        pageable.setItemsCount(itemsCount);
        return shiftService.getAllByPageable(pageable);
    }
}
