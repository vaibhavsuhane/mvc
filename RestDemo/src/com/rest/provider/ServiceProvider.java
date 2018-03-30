package com.rest.provider;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.rest.model.Employee;

@Path("/provider")
public class ServiceProvider {
    @Path("/show/{msg}")
    @GET
	public String getMassage(@PathParam("msg") String msg) {
		return "Hello Vaibhav How are you?"+msg;
	}
    // Query Param 
    @Path(value="/qparam")
    @GET
    public String getQueryParam(@QueryParam("sid") int id,@QueryParam("sname") String name,@QueryParam("sper") double per) {
    	name=name+"suhane";
    	id+=200;
    	
    	
		return "Student:"+" ID :"+id+"\n NAME: "+name+"\n Percentage: "+per;
	}
    
    //matrix Param
    @Path("/mParam")
    @GET
    public String getMatrixParam(@MatrixParam("sid") int id,@MatrixParam("sname") String name,@MatrixParam("sper") double per ) {
    	
    	return "Student:"+" ID :"+id+"\n NAME: "+name+"\n Percentage: "+per;
	}
    
    // Header Param
    @Path("/HParam")
    @POST
    public String getHeaderParam(@HeaderParam("sid") int id,@HeaderParam("sname") String name) {
    	
		return "ID:"+id+"\nNAME:"+name;
	}

// josn to object
    @Path("/get/emp")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmp(Employee emp) {
    	emp.setEmpId(emp.getEmpId()+100);
    	emp.setEmpName(emp.getEmpName()+" "+"Suhane");
    	emp.setEmpSalary(emp.getEmpSalary()+10000.50);
		return emp;
	}




}
