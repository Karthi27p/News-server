package com.tring.webservice;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tring.dto.HomeDto;
import com.tring.service.HomeService;

@Path("home")

public class HomeWebService {
	
	HomeService service = new HomeService();

	@GET
	@Path("test")
	public void test(){
		System.out.println("Hello world");
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("create")
	public void createHome(HomeDto dto) {
		
		System.out.println("createHome");

		service.create(dto);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("list")
	public List getHome() {
		
		return service.getList();
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("update")
	public void updateHome(HomeDto dto) {
		service.update(dto);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("delete")
	public void deleteHome(HomeDto dto) {
		service.delete(dto);
	}
	
}
