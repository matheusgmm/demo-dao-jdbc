package application.model.dao;

import application.model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj);

    void update(Department obj);

    void deleteById(Integer id);

    Department findById(Integer id);

    List<Department> findAll();
}
