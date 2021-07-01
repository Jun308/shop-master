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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sonnt
 */
public class DummyDAO {

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public ArrayList<Product> pagging(int PageIndex, int PageSize) {
        try {
            String sql = "select ID,Name,Category_Id,Price,Description,Quantity,Status,Image_Link,Note from (\n"
                    + "    select ROW_NUMBER() over (order by ID asc) as rn, *\n"
                    + "    from Products\n"
                    + ") as x\n"
                    + "where rn between "
                    + "(?-1)*? + 1 "
                    + "and ? * ?";

            ArrayList<Product> table = new ArrayList<>();
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, PageIndex);
            ps.setInt(2, PageSize);
            ps.setInt(3, PageIndex);
            ps.setInt(4, PageSize);
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
        } catch (SQLException ex) {
            Logger.getLogger(DummyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int getRowCount() {
        try {
            String sql = "SELECT COUNT(*) as Total FROM Products";
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("Total");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DummyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
