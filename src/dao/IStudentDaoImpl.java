package dao;

import entity.Student;

public class IStudentDaoImpl implements IStudentDao {
    @Override
    public void addStudent(Student student) {
        System.out.println("增加学生");
    }
}
