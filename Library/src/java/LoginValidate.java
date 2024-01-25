/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NITHU
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;  
import org.apache.struts2.dispatcher.SessionMap;  
import org.apache.struts2.interceptor.SessionAware; 


public class LoginValidate {
    private int id;
    private String uname,password;  
SessionMap<String,String> sessionmap;  

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
  
 
  
public String execute() throws Exception{  
//    if(LoginDAO.validate(uname, password)){  
//        return "success";  
//    }  
//    else{  
//        return "error";  
//    }  


System.out.println("hi");
    boolean status = true;
        try {
            // Load the MySQL JDBC driver (this may be optional with modern JDBC drivers)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Use try-with-resources for automatic resource management
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
                   
                 PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE uname=? AND password=?")) {
                
                // Use setString for prepared statement parameters
                ps.setString(1, uname);
                ps.setString(2, password);

                // Execute the query
                try (ResultSet rs = ps.executeQuery()) {
                    status = rs.next();
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        if(status)
            return "success";
        
        else
            return "error";
        
}  
  
//public void setSession(Map map) {  
//    sessionmap=(SessionMap)map;  
//    sessionmap.put("login","true");  
//}  
//  
//public String logout(){  
//    sessionmap.invalidate();  
//    return "success";  
//}  
  
    
}
