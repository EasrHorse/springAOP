package main;


import dao.IStudentDaoImpl;
import entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IStudentService;


public class TestAOP {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring-config.xml");

        IStudentService service = (IStudentService)context.getBean("studentService");
         service.addStudent(null);
         service.deleteStudentById(0);
    }
}
