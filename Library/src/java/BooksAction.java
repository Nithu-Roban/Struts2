
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
public class BooksAction extends ActionSupport {
     private static SessionFactory factory1;
    private List<Books> bookList = new ArrayList<>();

    public String execute() throws Exception {
        if (factory1 == null) {
            factory1 = new Configuration().configure().buildSessionFactory();
        }

        try {
            
            Session session = factory1.openSession(); 
            bookList = session.createQuery("from Books").list();
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }

        return SUCCESS;
    }

    public List<Books> getBookList() {
        return bookList;
    }
}
    

