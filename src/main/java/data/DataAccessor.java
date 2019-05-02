/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mkhansen
 */
public class DataAccessor implements DataAcessorInterface {

//    public static void main(String[] args) {
//
////        System.out.println(getCupCakePrice("Jordbær"));
////        System.out.println(getAllCupCakes().toString());
////        System.out.println(getUser("John").toString());
////        createUser("John", "1234", "Teeest@testmail.dk", 1000);
////
////        System.out.println("Start");
////        getAllCupCakes();
////        String Jordbær = "Jordbær";
////        CompleteCupCake j = getCupCake(Jordbær);
////        System.out.println("CupCake found: " + j.getName());
//        System.out.println(getAllCupCakes().toString());
//    }

//    public static ArrayList<CompleteCupCake> getAllCupCakes() {
//        ArrayList<CompleteCupCake> list = new ArrayList<>();
//
//        try {
//            DBConnector c = new DBConnector();
//
//            String query = "SELECT * FROM CupCakes_list;";
//
//            Connection connection = c.getConnection();
//            Statement stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                String name = rs.getString("c_name");
//                double price = rs.getDouble("c_price");
//
//                list.add(new CompleteCupCake(name, price));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }

    @Override
    public ArrayList<Material> getAllMaterials() {
          ArrayList<Material> list = new ArrayList<>();

        try {
            DBConnector c = new DBConnector();

            String query = "SELECT * FROM Materials;";

            Connection connection = c.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("MaterialName");
                String desc = rs.getString("Help_Description");
                String material = rs.getString("Material");
                String type = rs.getString("Type");
                int matNum = rs.getInt("Vare_nummer");
                int length = rs.getInt("Length");
                int height = rs.getInt("Height");
                int width = rs.getInt("Width");
                int priceM = rs.getInt("PriceM");
                int priceM2 = rs.getInt("PriceM2");

                list.add(new Material(name, desc, material, type, matNum, length, height, width, priceM, priceM2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
        
    
    // @author Christian Ambjørn Kehr
    @Override
    public ArrayList<Material> GetListSpecificMaterials(String type) {
        ArrayList<Material> Mats = new ArrayList<>();

        try {
            DBConnector c = new DBConnector();

            String query = "SELECT * FROM Materials WHERE Type ='" + type + "';";

            Connection connection = c.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("MaterialName");
                String desc = rs.getString("Help_Description");
                String material = rs.getString("Material");
                int matNum = rs.getInt("Vare_nummer");
                int length = rs.getInt("Length");
                int height = rs.getInt("Height");
                int width = rs.getInt("Width");
                int priceM = rs.getInt("PriceM");
                int priceM2 = rs.getInt("PriceM2");
                
                 Mats.add(new Material(name, desc, material, type, matNum, length, height, width, priceM, priceM2));
            }
            return Mats;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Mats;
    }

    /**
     *
     * @param name
     * @return
     */
    
      //  @author MkHansen og Christian Ambjørn Kehr
    @Override
    public Material getMaterial(String name) {
        Material Mat = null;

        try {
            DBConnector c = new DBConnector();

            String query = "SELECT * FROM Materials WHERE MaterialName ='" + name + "';";

            Connection connection = c.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String desc = rs.getString("Help_Description");
                String material = rs.getString("Material");
                String type = rs.getString("Type");
                int matNum = rs.getInt("Vare_nummer");
                int length = rs.getInt("Length");
                int height = rs.getInt("Height");
                int width = rs.getInt("Width");
                int priceM = rs.getInt("PriceM");
                int priceM2 = rs.getInt("PriceM2");
                
                
                Mat = new Material(name, desc, material, type, matNum, length, height, width, priceM, priceM2);
            }
            return Mat;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Mat;
    }

    @Override
    public Offer getOffer(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Carport getCarport(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Roof getRoof(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomer(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
