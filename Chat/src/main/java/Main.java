import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by mtarasenko on 17.12.16.
 */
public class Main {
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = (SessionFactory) Persistence.createEntityManagerFactory( "org.hibernate.tutorial.jpa" );
        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();


        entityManager.getTransaction().commit();


        entityManager.close();
        sessionFactory.close();
    }
}
