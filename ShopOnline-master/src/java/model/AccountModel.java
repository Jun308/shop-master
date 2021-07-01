/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.MSSQLConnection;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.ICommon;
import utils.BCrypt;

/**
 *
 * @author DerickT
 */
public class AccountModel implements ICommon<Account> {

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    /**
     * Get all AccountDetail in Database
     *
     * @return list object AccountDetail
     */
    @Override
    public ArrayList<Account> getAll() {
        String query = "SELECT * FROM Account";
        ArrayList<Account> table = new ArrayList<>();
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String email = rs.getString(2);
                String password = rs.getString(3);
                int accountDetailId = rs.getInt(4);
                int roleID = rs.getInt(5);
                int status = rs.getInt(6);
                String createDate = rs.getString(7);
                String activeCode = rs.getString(8);
                table.add(new Account(id, email, password, accountDetailId, roleID, status, createDate, activeCode));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePrepareStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return table;
    }

    /**
     * Get all AccountDetail in Database
     *
     * @param account
     * @return boolean
     *
     */
    @Override
    public boolean add(Account account) {
        int isCheck = 0;
        String query = "INSERT INTO Account(Email, Password, Account_Detail_Id, Role_ID, Status,Active_code) VALUES(?, ?, ?, ?, ?, ?)";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setString(1, account.getEmail());
            ps.setString(2, BCrypt.hashpw(account.getPassword(), BCrypt.gensalt()));
            ps.setInt(3, account.getAccountDetailId());
            ps.setInt(4, account.getRoleID());
            ps.setInt(5, account.getStatus());
            ps.setString(6, account.getActiveCode());
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

    /**
     * Get all AccountDetail in Database
     *
     * @param Email
     * @return boolean
     *
     */
    public boolean isCheckDuplicateEmail(String Email) {
        String query = "SELECT * FROM Account WHERE Email =?";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setString(1, Email);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePrepareStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return false;
    }

    /**
     * Get one AccountDetail by Id
     *
     * @param email
     * @param password
     * @return one object Account
     */
    public Account login(String email, String password) {
        String query = "SELECT * FROM Account WHERE Email = ?";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                Account acc = new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8)
                );
                if (BCrypt.checkpw(password, acc.getPassword())) {
                    return acc;
                }
            }
            return null;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePrepareStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return null;
    }

    /**
     * Get all AccountDetail in Database
     *
     * @param id
     * @return one object Account
     */
    @Override
    public Account getOne(int id) {
        String query = "SELECT * FROM Account WHERE Id = ?";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Account acc = new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8)
                );
                return acc;
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
    public boolean update(Account obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get one AccountDetail in Database
     *
     * @param email
     * @return one object Account
     */
    public Account getOneByEmail(String email) {
        String query = "SELECT * FROM Account WHERE Email = ?";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                Account acc = new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8)
                );
                return acc;
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

    /**
     * Update info one AccountDetail in Database
     *
     * @param email
     * @param newPassword
     * @return true if update AccountDetail success false if update
     * AccountDetail fail
     */
    public boolean updatePassword(String email, String newPassword) {
        int isCheck = 0;
        String query = "UPDATE Account\n"
                + "SET Password = ?\n"
                + "WHERE Email = ?";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setString(1, BCrypt.hashpw(newPassword, BCrypt.gensalt()));
            ps.setString(2, email);
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

    /**
     * Update Active code
     *
     * @param email
     * @param activeCode
     * @return true if update Account success, false if update Account fail
     */
    public boolean activeCode(String email, String activeCode) {
        int isCheck = 0;
        String query = "UPDATE Account SET Status = 1 WHERE Email = ? AND Active_Code = ?";
        try {
            connection = MSSQLConnection.getConection();
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, activeCode);
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
