package com.yann.webrestfull.controller;

import com.yann.webrestfull.dao.DepartmentDao;
import com.yann.webrestfull.dao.EmployeeDao;
import com.yann.webrestfull.entities.Department;
import com.yann.webrestfull.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    //    查询所有员工
    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "emp/add";
    }

    @PostMapping("/emp")
//    Spring MVC 自动封装
    public String addEmp(Employee employee) {
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toModifyEmp(@PathVariable("id") Integer id, Model model) {

        Employee employee = employeeDao.getEmp(id);
        model.addAttribute("emp",employee);

        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
//        修改添加二合一页面
        return "emp/add";
    }

    @PutMapping("/emp")
    public String modifyEmp(Employee employee){
        employeeDao.save(employee);
        return  "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){

        return  "redirect:/emps";
    }

}
