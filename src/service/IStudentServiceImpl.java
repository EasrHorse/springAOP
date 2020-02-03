package service;

import dao.IStudentDao;
import dao.IStudentDaoImpl;
import entity.Student;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class IStudentServiceImpl implements IStudentService {
    IStudentDao studentDao=new IStudentDaoImpl();

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }


@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
    @Override
    public void addStudent(Student student) {

        studentDao.addStudent(student);

    }
    @Transactional(readOnly = false,propagation = Propagation.REQUIRED)
    @Override
    public void deleteStudentById(int id) {
        System.out.println("模拟删除");
    }
}
