import model.User;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;
import util.HibernateUtil;

/**
 * Created by matia on 18-Mar-17.
 */
public class UserTest {
    @Test
    public void testNewUser() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        // Add new User object
        User emp = new User();
        emp.setUserID(1);
        emp.setEmail("demo-user@mail.com");
        emp.setName("demo");
        emp.setPassword("user");
        session.save(emp);
        session.getTransaction().commit();
        User user = session.get(User.class, 1);
        HibernateUtil.shutdown();
        Assert.assertEquals(emp.getName(), user.getName());
    }
}
