package org.tech.controller;

import java.util.List;

import org.tech.entity.NewMobile;
import org.tech.service.MobileService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/NewMobile")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MobileResource {
	
	@Inject
	private MobileService service;
	
	@POST
	@Transactional
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public NewMobile create(NewMobile mobile) {
        return service.saveData(mobile);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<NewMobile> getAll() {
        return service.getMobileList();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public NewMobile getById(@PathParam("id") Long id) {
        return service.getMobileById(id);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public NewMobile update(@PathParam("id") Long id, NewMobile mobile) {
    	
        return service.updateMobile(id, mobile);
    }

    @DELETE
    @Transactional
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
    	service.deleteTask(id);
    }
    
    
    

}
