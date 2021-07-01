/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.MSSQLConnection;
import entity.OrderPro;
import entity.OrderDetail;
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
public class OrderDetailModel implements ICommon<OrderDetail> {

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    @Override
    public ArrayList<OrderDetail> getAll() {
        String query = "SELECT [Id]\n"
                + "      ,[ProductName]\n"
                + "      ,[ProductQuantity]\n"
                + "      ,[ProductPrice]\n"
                + "      ,[ProductID]\n"
                + "      ,[OrderID]\n"
                + "  FROM [dbo].[OrderDetail]";
        ArrayList<OrderDetail> listOrderDetail = new ArrayList<>();
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {

                OrderDetail orderDetail = new OrderDetail(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getInt(5), rs.getInt(6));
                listOrderDetail.add(orderDetail);
            }
            return listOrderDetail;
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
    public OrderDetail getOne(int id) {
        String query = "SELECT * FROM [OrderDetail] WHERE Id = ?";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                OrderDetail orderDetail = new OrderDetail(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getInt(5), rs.getInt(6));
                return orderDetail;
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

    public ArrayList<OrderDetail> getOneByOrderId(int orderid) {
        String query = "select * from OrderDetail\n"
                + "where OrderID = ?";
        ArrayList<OrderDetail> listOrderDetail = new ArrayList<>();
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, orderid);
            rs = ps.executeQuery();
            while (rs.next()) {

                OrderDetail orderDetail = new OrderDetail(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getInt(5), rs.getInt(6));
                listOrderDetail.add(orderDetail);
            }
            return listOrderDetail;
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
    public boolean add(OrderDetail od) {
        int isCheck = 0;
        String query = "INSERT INTO [dbo].[OrderDetail]\n"
                + "           ([ProductName]\n"
                + "           ,[ProductQuantity]\n"
                + "           ,[ProductPrice]\n"
                + "           ,[ProductID]\n"
                + "           ,[OrderID])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setString(1, od.getProductName());
            ps.setInt(2, od.getProductQuantity());
            ps.setDouble(3, od.getProductPrice());
            ps.setInt(4, od.getProductID());
            ps.setInt(5, od.getOrderID());
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
    public boolean update(OrderDetail obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        String query = "DELETE FROM [dbo].[OrderDetail]\n"
                + "      WHERE Id = ?";
        int isCheck = 0;
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
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

    public void batchInsertRecordsIntoTable(ArrayList<OrderDetail> listOrderDetail) throws SQLException {

        String query = "INSERT INTO [dbo].[OrderDetail]\n"
                + "           ([ProductName]\n"
                + "           ,[ProductQuantity]\n"
                + "           ,[ProductPrice]\n"
                + "           ,[ProductID]\n"
                + "           ,[OrderID])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";

        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            connection.setAutoCommit(false);
            for (OrderDetail s : listOrderDetail) {
                ps.setString(1, s.getProductName());
                ps.setInt(2, s.getProductQuantity());
                ps.setDouble(3, s.getProductPrice());
                ps.setInt(4, s.getProductID());
                ps.setInt(5, s.getOrderID());
                ps.addBatch();
            }
            ps.executeBatch();

            connection.commit();

            System.out.println("Record is inserted into DBUSER table!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            connection.rollback();

        } finally {

            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePrepareStatement(ps);
            MSSQLConnection.closeConnection(connection);

        }

    }

}
