
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NITHU
 */
public class Books {
    
    private int bid;
    private String bname;
    private String aname;
    private int count;
    
    List<Books> bk = new ArrayList<Books>();
       
    
//    <------------------setter methods-------------------------->

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
// <---------------------getter methods--------------------------->

    public int getBid() {
        return bid;
    }

    public String getBname() {
        return bname;
    }

    public String getAname() {
        return aname;
    }

    public int getCount() {
        return count;
    }
    
    
     private static SessionFactory factory1; 
    
    public String execute() throws Exception{
        
//    <-----------------    Hibernate connection and adding values to db ---------->


        int i=0;
         try {
           if (factory1 == null) {
               factory1 = new Configuration().configure().buildSessionFactory();
           }
           Session session = factory1.openSession();
           Transaction tx = null;

           try {
               tx = session.beginTransaction();

            
                i = (Integer)session.save(this);
               tx.commit();

               System.out.println("Successfully inserted");
               session.close();
           } catch (Exception e) {
               
               System.out.println(e);
           } 
           
       } catch (Throwable ex) {
           System.err.println("Failed to create sessionFactory object." + ex);
           throw new ExceptionInInitializerError(ex);
       } 
        return "success";
    }
    
    public String display() throws Exception{
         
           if (factory1 == null) {
               factory1 = new Configuration().configure().buildSessionFactory();
           }
           Session session = factory1.openSession();
           
           
       
        try {
         bk = session.createQuery("from Books").list();
         
      } catch(Exception e) {
         e.printStackTrace();
      }
      
       
   
        return "success";
    }
}
