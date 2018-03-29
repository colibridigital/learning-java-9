package Product4;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.net.URL;
import java.util.List;

public class Main {
    private static SessionFactory factory;

    public static void main(String args[]) throws Exception {
        setUp();

        URL file_path = Main.class.getClassLoader().getResource("cars.json");
        JSONProcessor jsonProcessor = new JSONProcessor(file_path.getPath());
        List<Car> cars = jsonProcessor.parseFile();

        cars.stream().forEach(car -> addCar(car));
        System.exit(0);
    }

    private static void setUp() {
        factory = new Configuration()
            .addAnnotatedClass(Car.class)
            .configure() // configures settings from hibernate.cfg.xml
            .buildSessionFactory();
    }

    /* Method to CREATE an employee in the database */
    private static Integer addCar(Car car) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            employeeID = (Integer) session.save(car);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }
}
