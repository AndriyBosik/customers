package com.example.customers.controller;

import com.example.customers.entity.Slip;
import com.example.customers.model.Page;
import com.example.customers.model.Pageable;
import com.example.customers.service.abstraction.IPageableService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/slips")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class SlipController {

    private final IPageableService<Slip> slipService;
    private final int itemsCount;

    public SlipController(IPageableService<Slip> slipService, @ConfigProperty(name = "items.count") int itemsCount) {
        this.slipService = slipService;
        this.itemsCount = itemsCount;
    }

    @GET
    public Page<Slip> getByPage(Pageable pageable) {
        pageable.setItemsCount(itemsCount);
        return slipService.getAllByPageable(pageable);
    }
}
