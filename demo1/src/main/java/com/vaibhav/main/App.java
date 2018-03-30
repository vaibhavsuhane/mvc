package com.vaibhav.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaibhav.model.Employee;
import com.vaibhav.service.IEmpService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vaibhav/config/spring.xml");
        IEmpService empServ=(IEmpService) ctx.getBean("empServiceImpl");
        
        
       // empServ.empSave(emp);
       // System.out.println(emp);
       /* empServ.deleteEmp(101);
       System.out.println("succusessfully delected");*/
        System.out.println("===============================");
      Employee emp=  empServ.getEmpById(102);
      System.out.println(emp);  
      System.out.println("----------------------------");
      List<Employee> list=  empServ.getAllEmp();
        System.out.println(list);
        System.out.println("--------------------------------");

        
        emp.setEmpName("Basant");
        emp.setEmpSalry(45000);
        empServ.updateEmp(emp);
        System.out.println(emp);
        
    }
}
