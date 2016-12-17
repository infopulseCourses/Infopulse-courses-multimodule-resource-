import entity.User;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = (SessionFactory) Persistence.createEntityManagerFactory( "org.hibernate.tutorial.jpa" );
        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        
        User u1 = new User();
        u1.setFirstName("John");
        u1.setLastName("Show");
        
        User u2 = new User();
        u2.setFirstName("Daenerys");
        u2.setLastName("Targaryen");
        
        entityManager.persist(u1);
        entityManager.persist(u2);
        entityManager.getTransaction().commit();

        entityManager.close();
        sessionFactory.close();
    }
}
