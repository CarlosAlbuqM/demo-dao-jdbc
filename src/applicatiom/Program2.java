package applicatiom;

import dao.DaoFactory;
import dao.DepartmentDao;
import entities.Department;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: Department Insert ===");

        Department newDepartment = new Department(null, "Movies");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());
    }
}
