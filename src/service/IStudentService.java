package service;

import entity.Student;

public interface IStudentService {
    void addStudent(Student student);
    void deleteStudentById(int id);
}
