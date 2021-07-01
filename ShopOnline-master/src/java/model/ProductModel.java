/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.MSSQLConnection;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.ICommon;

/**
 *
 * @author Derick-T
 */
public class ProductModel implements ICommon<Product> {

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    @Override
    public ArrayList<Product> getAll() {
        String query = "SELECT * FROM Products";
        ArrayList<Product> table = new ArrayList<>();
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {

                Product product = new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9));
                table.add(product);
            }
            return table;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePrepareStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return null;
    }

    @Override
    public Product getOne(int id) {
        String query = "SELECT * FROM Products WHERE id = ?";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Product product = new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9));
                return product;
            }

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePrepareStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return null;
    }

    public ArrayList<Product> getProductByIdAndName(int categoryid, String name) {
        String query = "select * from Products p\n"
                + "where p.Category_Id =? AND p.Name like ?";
        ArrayList<Product> table = new ArrayList<>();
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, categoryid);
            ps.setString(2, "%" + name + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9));
                table.add(product);
            }
            return table;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePrepareStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return null;
    }

    @Override
    public boolean add(Product pro) {
        int isCheck = 0;
        String query = "INSERT INTO [dbo].[Products]\n"
                + "           ([Name]\n"
                + "           ,[Category_Id]\n"
                + "           ,[Price]\n"
                + "           ,[Description]\n"
                + "           ,[Quantity]\n"
                + "           ,[Status]\n"
                + "           ,[Image_Link]\n"
                + "           ,[Note])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setString(1, pro.getName());
            ps.setInt(2, pro.getCategory_Id());
            ps.setDouble(3, pro.getPrice());
            ps.setString(4, pro.getDescription());
            ps.setInt(5, pro.getQuantity());
            ps.setInt(6, pro.getStatus());
            ps.setString(7, pro.getImage_Link());
            ps.setString(8, pro.getNote());
            isCheck = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePrepareStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return isCheck > 0;
    }

    @Override
    public boolean update(Product pro) {
        int isCheck = 0;
        String query = "UPDATE [dbo].[Products]\n"
                + "   SET [Name] = ?\n"
                + "      ,[Price] = ?\n"
                + "      ,[Description] = ?\n"
                + "      ,[Quantity] = ?\n"
                + "      ,[Status] = ?\n"
                + "      ,[Note] = ?\n"
                + " WHERE id = ?";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setString(1, pro.getName());
            ps.setDouble(2, pro.getPrice());
            ps.setString(3, pro.getDescription());
            ps.setInt(4, pro.getQuantity());
            ps.setInt(5, pro.getStatus());
            ps.setString(6, pro.getNote());
            ps.setInt(7, pro.getId());
            isCheck = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePrepareStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return isCheck > 0;
    }
 
    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Product> getAllProductByCategory(int categoryid) {
        String query = "SELECT * FROM Products\n"
                + "WHERE Category_Id = ?";
        ArrayList<Product> table = new ArrayList<>();
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, categoryid);
            rs = ps.executeQuery();
            while (rs.next()) {

                Product product = new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9));
                table.add(product);
            }
            return table;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePrepareStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return null;
    }

}
