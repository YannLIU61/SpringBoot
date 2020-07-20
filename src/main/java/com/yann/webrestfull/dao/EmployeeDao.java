package com.yann.webrestfull.dao;

import com.yann.webrestfull.entities.Department;
import com.yann.webrestfull.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>();

        employees.put(1001, new Employee(1001, "E-AA", "aa@163.com", 1, new Department(101, "D-AA"), new Date()));
        employees.put(1002, new Employee(1002, "E-BB", "bb@163.com", 0, new Department(101, "D-AA"), new Date()));
        employees.put(1003, new Employee(1003, "E-CC", "cc@163.com", 1, new Department(102, "D-BB"), new Date()));
        employees.put(1004, new Employee(1004, "E-DD", "dd@163.com", 0, new Department(103, "D-CC"), new Date()));
    }

    private static Integer initId = 1005;

    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        employee.setDept(departmentDao.getDepartment(employee.getDept().getId()));
        employees.put(employee.getId(), employee);
    }

    public Employee getEmp(Integer id) {
        return employees.get(id);
    }

    public void delete(Integer id){
        employees.remove(id);
    }

    public Collection<Employee> getAll() {
        return employees.values();
    }
}
