package com.ws.jersey;

import com.ws.entity.Employee;
import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by thiennt on 5/22/14.
 */
@Path("/hbm")
public class EmployeeService {
    public static SessionFactory sessionFactory;

    @GET
    @Path("/get/{id}")
    public Response getEmployeeById(@PathParam(value = "id") int id) {
        String output ="";
        try{
            sessionFactory = new AnnotationConfiguration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
            Session session = sessionFactory.openSession();
            Query query = session.createQuery("From Employee E where E.empId= "+id);
            Employee employee = (Employee) query.list().get(0);
            output = employee.toString();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return Response.status(200).entity(output).build();
    }
    public static void main(String[] args) {
        String output = "";
        try{
           /* sessionFactory = new AnnotationConfiguration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();

            System.out.println("1");
            EmployeeService service = new EmployeeService();
            System.out.println("2");
            Integer empID1 = service.addEmployee("Tduare", "Zuesdt", 44);*/
            System.out.println("1111111111111");
            sessionFactory = new AnnotationConfiguration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
            System.out.println("zzzzzzzzzzzzzzzzzzz");
            Session session = sessionFactory.openSession();
            System.out.println("2222222222");
            Query query = session.createQuery("From Employee E where E.empId= "+2);
            System.out.println("3333333333333");
            Employee employee = (Employee) query.list().get(0);
            System.out.println("444444444444444");

            output = employee.toString();
        System.out.println(output);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @POST
    @Path("/add/{fName}/{lName}/{age}")
    public Integer addEmployee(@PathParam(value = "fName")String fName, @PathParam(value = "lName") String lName, @PathParam(value = "age")int age){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Integer employeeId = null;

        try{
            transaction = session.beginTransaction();
            Employee employee = new Employee();
            employee.setfName(fName);
            employee.setlName(lName);
            employee.setAge(age);
            employeeId = (Integer) session.save(employee);
            transaction.commit();
        }catch (HibernateException ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return employeeId;

    }
}
