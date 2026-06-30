package applicatiom;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.List;


public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== Test 1: Seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== Test 2: Seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("\n=== Test 3: Seller findAll ===");
        list = sellerDao.findAll();

        for (Seller s : list) {
            System.out.println(s);
        }
    }
}
