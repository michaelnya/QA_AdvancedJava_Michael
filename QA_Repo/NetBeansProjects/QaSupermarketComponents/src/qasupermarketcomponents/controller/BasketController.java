/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qasupermarketcomponents.controller;
//
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import qasupermarketcomponents.dbservices.PersistenceManager;
import qasupermarketcomponents.Data.SupermarketDataHarness;
import qasupermarketcomponents.model.Product;

/**
 *
 * @author ArthurM
 */
public class BasketController {

    public static void add (Product product){
        {
            SupermarketDataHarness.add(product);
        } 
    }

    public static String getAllProducts() {
        return SupermarketDataHarness.add();
    }
    
    
    
}
//    
//    public static void save(Product product){
//        try {
//            PersistenceManager.saveToDb(product);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(BasketController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//        public static void delete(Product product){
//        try {
//            PersistenceManager.deleteFromDb(product);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//            //report and log the exception
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(BasketController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//        public static String getAllProducts() {
//        return PersistenceManager.getProducts().toString();
//    }