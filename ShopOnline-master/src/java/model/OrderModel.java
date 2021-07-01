/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.MSSQLConnection;
import entity.Account;
import entity.OrderPro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utils.BCrypt;
import utils.ICommon;

/**
 *
 * @author Derick-T
 */
public class OrderModel implements ICommon<OrderPro> {

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    @Override
    public ArrayList<OrderPro> getAll() {
        String query = "SELECT [ID]\n"
                + "      ,[AccountID]\n"
                + "      ,[Date]\n"
                + "      ,[Total Price]\n"
                + "      ,[StatusOrder]\n"
                + "  FROM [dbo].[Order] order by ID DESC ";
        
        ArrayList<OrderPro> listOrder = new ArrayList<>();
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {

                OrderPro order = new OrderPro(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getInt(5));
                listOrder.add(order);
            }
            return listOrder;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePrepareStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return null;
    }

    public ArrayList<OrderPro> getAllByAccount(int accountid) {
        String query = "select * from [Order] where AccountID = ?";
        ArrayList<OrderPro> listOrder = new ArrayList<>();
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, accountid);
            rs = ps.executeQuery();
            while (rs.next()) {

                OrderPro order = new OrderPro(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getInt(5));
                listOrder.add(order);
            }
            return listOrder;
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
    public OrderPro getOne(int id) {
        String query = "SELECT * FROM [Order] WHERE ID = ?";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                OrderPro order = new OrderPro(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getInt(5));
                return order;
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

    @Override
    public boolean add(OrderPro order) {
        int isCheck = 0;
        String query = "INSERT INTO [dbo].[Order]\n"
                + "           ([AccountID]\n"
                + "           ,[Date]\n"
                + "           ,[Total Price])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?)";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, order.getAccountID());
            ps.setString(2, order.getDate());
            ps.setDouble(3, order.getTotalPrice());
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

    public int addOrder(OrderPro order) {
        int isCheck = 0;
        String query = "INSERT INTO [dbo].[Order]\n"
                + "           ([AccountID]\n"
                + "           ,[Date]\n"
                + "           ,[Total Price]\n"
                + "           ,[StatusOrder]\n)"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?"
                + "            ,?)";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getAccountID());
            ps.setString(2, order.getDate());
            ps.setDouble(3, order.getTotalPrice());
            ps.setInt(4, order.getStatus());
            isCheck = ps.executeUpdate();
            if (isCheck > 0) {
                rs = ps.getGeneratedKeys();
                rs.next();
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePrepareStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return isCheck;
    }

    @Override
    public boolean update(OrderPro order) {
        int isCheck = 0;
        String query = "UPDATE [dbo].[Order]\n"
                + "   SET [AccountID] = ?\n"
                + "      ,[Date] = ?\n"
                + "      ,[Total Price] = ?\n"
                + " WHERE ID = ?";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, order.getAccountID());
            ps.setString(2, order.getDate());
            ps.setDouble(3, order.getTotalPrice());
            ps.setInt(4, order.getId());
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

    public boolean updateStatus(int id) {
        int isCheck = 0;
        String query = "UPDATE [dbo].[Order]\n"
                + "   SET \n"
                + "      [StatusOrder] = 2\n"
                + " WHERE ID = ?";
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

    @Override
    public boolean delete(int id) {
        int isCheck = 0;
        String query = "DELETE FROM [dbo].[Order]\n"
                + "      WHERE ID = ?";
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

}
