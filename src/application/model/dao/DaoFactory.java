package application.model.dao;

import application.model.dao.impl.SellerDaoJDBC;
import db.DB;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
