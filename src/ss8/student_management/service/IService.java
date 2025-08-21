package ss8.student_management.service;

import ss8.student_management.entity.Student;

import java.util.List;

public interface IService <T> {
    List<T> findAll();
    T findById(int id);
    boolean add(T t);
    boolean delete(int id);
    void update(T t);
}
