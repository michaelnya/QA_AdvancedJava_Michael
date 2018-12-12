///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package qasupermarketcomponents.dbservices;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.UIManager;
//import qasupermarketcomponents.model.Product;
//
///**
// *
// * @author ArthurM
// */
//public class PersistenceManager {
//
//    private final static List<Product> products = new ArrayList<>();
//    private static Connection conn;
//
//    private static void connect() throws ClassNotFoundException, SQLException {
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        //must live in a configuration file
//        //String connectionUrl = "jdbc:sqlserver://E0443259\\SQLEXPRESS:1433;databaseName=Events;integratedSecurity=true;";
//        //conn = DriverManager.getConnection(connectionUrl);
//    }
//
//    public static void saveToDb(Product product) throws SQLException, ClassNotFoundException {
//        connect();
//        PreparedStatement ps = conn.prepareStatement("insert into product(productName,price)values(?,?)");
//        ps.setString(1, product.getProductName());
//        ps.setDouble(2, product.getPrice());
//        System.out.println("before");
//        ps.execute();
//        System.out.println("after");
//    }
//
//    public static void deleteFromDb(Product product) throws SQLException, ClassNotFoundException {
//        connect();
//        PreparedStatement ps = conn.prepareStatement("Delete from product(productName,price)values(?,?)");
//        ps.setString(1, product.getProductName());
//        ps.setDouble(2, product.getPrice());
//        ps.execute();
//    }
//    
//    public static List<Product> getProducts() {
//        try {
//            connect();
//            ResultSet rs = conn.prepareStatement("select id, name, rate, contactnumber from speaker").executeQuery();
//            while (rs.next()) {
//                products.add(new Product(rs.getString("name"), rs.getDouble("rate")));
//                System.out.println(products);
//            }
//        } catch (SQLException | ClassNotFoundException ex) {
//          Logger.getLogger(PersistenceManager.class.getName()).log(Level.SEVERE, null, ex);
//    }
//          return products;
//    }
//}