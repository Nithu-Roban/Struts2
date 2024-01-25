
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
public class userRegister {

//    creation of session factory
    



//declaration of variables
    private int id;
    private String uname;
    private String password;
//    
//
//getter and setter methods
     public int getId() {
         return id;
     }

     public String getUname() {
         return uname;
     }

     public String getPassword() {
         return password;
     }

     public void setId(int id) {
         this.id = id;
     }


     public void setUname(String uname) {
         this.uname = uname;
     }

     public void setPassword(String password) {
         this.password = password;
     }

   
        
        
//     strts2 execute method       
//    public String execute() throws Exception {
//         
//
//        try{
//              factory1 = new Configuration().configure().buildSessionFactory();
//              
//        }
//        catch (Throwable ex) {
//            System.err.println("Failed to create sessionFactory object." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//        Session session = factory1.openSession();
//        Transaction tx = null;
//
//        try {
//            tx = session.beginTransaction();
//
//            userRegister d = new userRegister();
//            d.setUname(uname);
//            d.setPassword(password);
//            session.save(d);
//
//            System.out.println("Successfully inserted");
//            tx.commit();
//            factory1.close();
//        }
//        catch(Exception e)
//        {
//        System.out.println(e);
//        }
////        throw new UnsupportedOperationException("Not supported yet.");
//        return "success";
//    }
     
     
     
            private static SessionFactory factory1; 
        public String execute() throws Exception {
    
    
        
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
    
                //users.registerUser(this);
                return "success";
}

}
    

