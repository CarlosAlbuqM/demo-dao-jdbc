package applicatiom;

import dao.DaoFactory;
import dao.DepartmentDao;
import entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: Department Insert ===");
        Department newDepartment = new Department(null, "Movies");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());


        System.out.println("=== Test 2: Department deleteById ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete Complete!");


        System.out.println("=== Test 3: Department Update ===");
        newDepartment = departmentDao.findById(9);
        newDepartment.setName("Music");
        departmentDao.update(newDepartment);
        System.out.println("Update Complete!");

        System.out.println(" Test 4: Department findAll ===");
        List<Department> departments = departmentDao.findAll();
        for (Department department : departments) {
            System.out.println(department);
        }
    }
}
