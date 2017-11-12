import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;

import com.pojo.Student;

public class Main {
	public static void main(String args[])
	{
		Student student=new Student();
		student.setUsername("Ruchita");
		Session session=new Configuration()  
		         .configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}

}
