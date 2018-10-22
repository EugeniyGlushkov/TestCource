package org.acs.domain.repository;


import org.acs.domain.model.Department;

import java.util.List;
//fork
public interface DepartmentRepository {
    Department save(Department department);

    boolean delete(int id);

    Department get(int id);

    List <Department> getAll();
}