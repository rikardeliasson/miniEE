package com.cybercom;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



    @Path("/testingagain")
    public class Thirdtest {

        @GET
        @Produces(MediaType.TEXT_PLAIN)
        public Response test() {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("jcg-JPA");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            TestEntity employee = new TestEntity();
            employee.setColumn1(5);
            em.persist(employee);
            em.getTransaction().commit();

            /*
            TestEntity database_column = new TestEntity();
            database_column.setColumn1(7);
            database_column.persist(employee);
            database_column.getTransaction().commit();
            if(database_column.getColumn1() == 7) {
                return Response.ok("I have set a column in a database using JPA").build();
            }
            */

            return Response.ok("I failed to set a database column and we should use spring").build();
        }


    }

