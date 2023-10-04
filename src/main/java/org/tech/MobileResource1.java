package org.tech;

import java.net.URI;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
import jakarta.ws.rs.core.Response;

@Path("/mobiles")
public class MobileResource1 {
	

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllMobile(){
		List<Mobile> mobileList = Mobile.listAll();
		return Response.ok(mobileList).build();
	}
	
	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response saveMobile(Mobile mobile) {
		Mobile.persist(mobile);
		if(mobile.isPersistent())
			return Response.created(URI.create("/mobile/"+mobile.id)).build();
		else
			return Response.status(Response.Status.BAD_REQUEST).build();

  }
	
	@PUT
	@Transactional
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateMobile(@PathParam("id") int id, Mobile updateMobile) { 
	
		Optional<Mobile> optionalMobile= Mobile.findByIdOptional(id);
	  if(optionalMobile.isPresent()) {
		  Mobile mobile = optionalMobile.get();
		  
		  if(Objects.nonNull(updateMobile.getName()))
			  mobile.setName(updateMobile.getName());
		  
		  if(Objects.nonNull(updateMobile.getBrand()))
			  mobile.setBrand(null);
		  
		  if(Objects.nonNull(updateMobile.getRam()))
			  mobile.setRam(updateMobile.getRam());
		  
		  if(Objects.nonNull(updateMobile.getExternalStorage()))
			  mobile.setExternalStorage(updateMobile.getExternalStorage());
		  
		  mobile.persist();
		  
		  if(mobile.isPersistent()) 
			 return Response.created(URI.create("/mobile/"+id)).build();
		    else
			 return Response.status(Response.Status.BAD_REQUEST).build();
			  
		  
	  }
	  else
		  return Response.status(Response.Status.BAD_REQUEST).build();
	}
	  
	  
	
	
	@DELETE
	@Transactional
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteMobile(@PathParam("id") Long id) {
		boolean isDeleted =  Mobile.deleteById(id);
		if(isDeleted) {
			return Response.noContent().build();
		}
		else {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		
	}
	
	
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMobileById(@PathParam("id")Long id) {
		Mobile mobile = Mobile.findById(id);
		return Response.ok(mobile).build();
	}
	
//	@GET
//	@Path("{id}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response getMobileById(@PathParam("id")Long id) {
//		Optional<Mobile> optionalMobile = mobileList.stream()
//				                  .filter(mobile->mobile.getId()== id)
//				                  .findFirst();
//		
//		if(optionalMobile.isPresent()) {
//			
//			return Response.ok(optionalMobile.get()).build();
//		}
//		else {
//			return Response.status(Response.Status.BAD_REQUEST).build();
//		}
//	}
	
				            

}
