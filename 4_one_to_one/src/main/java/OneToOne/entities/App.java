package OneToOne.entities;

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

        Phone phone = new Phone();
        phone.setValue("+380998877666");
//        entityManager.getTransaction().commit();

        User user1 = new User();

        user1.setName("Max");
        user1.setSurname("ivanov");
        user1.setPhone(phone);


        phone.setUser(user1);

        entityManager.persist(phone);
        entityManager.persist(user1);

        entityManager.getTransaction().commit();
    
        entityManager.close();
        sessionFactory.close();
    }
}
