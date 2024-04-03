package application;

import application.model.dao.DaoFactory;
import application.model.dao.SellerDao;
import application.model.entities.Department;
import application.model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }
}
