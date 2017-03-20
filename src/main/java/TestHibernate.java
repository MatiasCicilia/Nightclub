import model.User;
import org.hibernate.Session;
import util.HibernateUtil;


public class TestHibernate
{
    public static void main(String[] args)
    {
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
        System.out.println(user.getName());
        HibernateUtil.shutdown();
    }
}
