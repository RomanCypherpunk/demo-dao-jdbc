package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) 
    {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("Teste N° 1: Seller findById:");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\nTeste N° 2: Seller findByDepartment:");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\nTeste N° 3: Seller findByAll:");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }
    }
}
