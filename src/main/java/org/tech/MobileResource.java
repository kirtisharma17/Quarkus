//package org.tech;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import jakarta.ws.rs.Consumes;
//import jakarta.ws.rs.DELETE;
//import jakarta.ws.rs.GET;
//import jakarta.ws.rs.POST;
//import jakarta.ws.rs.PUT;
//import jakarta.ws.rs.Path;
//import jakarta.ws.rs.PathParam;
//import jakarta.ws.rs.Produces;
//import jakarta.ws.rs.QueryParam;
//import jakarta.ws.rs.core.MediaType;
//import jakarta.ws.rs.core.Response;
//
//@Path("/mobile")
//public class MobileResource {
//	
//	List<String> mobileList= new ArrayList<>();
//	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public Response getMobileList(){
//		return Response.ok(mobileList).build();
//	}
//	
//	@POST
//	@Consumes(MediaType.TEXT_PLAIN)
//	@Produces(MediaType.TEXT_PLAIN)
//	public Response addNewMobile(String mobileName) {
//		mobileList.add(mobileName);
//		return Response.ok(mobileName).build();
//	}
//	
//	@PUT
//	@Path("/{oldmobilename}")
//	@Consumes(MediaType.TEXT_PLAIN)
//	@Produces(MediaType.TEXT_PLAIN)
//	public Response updateMobile(@PathParam("oldmobilename") String oldmobilename, 
//			@QueryParam("newmobilename")String newmobilename) {
//		mobileList=  mobileList.stream().map(mobile->{
//			if(mobile.equals(oldmobilename))
//				return newmobilename;
//			else
//				return mobile;
//		}).collect(Collectors.toList());
//    
//		return Response.ok(mobileList).build();
//		
//	}
//	@DELETE
//	@Path("{mobileToDelete}")
//	@Produces(MediaType.TEXT_PLAIN)
//	public Response deleteMobile(@PathParam("mobileToDelete")String mobileName) {
//		boolean isRemoved= mobileList.remove(mobileName);
//		if(isRemoved) {
//			return Response.ok(mobileList).build();
//		}
//		else
//			return Response.status(Response.Status.BAD_REQUEST).build();
//		
//	}
//}
