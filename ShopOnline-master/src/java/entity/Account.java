/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author DerickT
 */
public class Account {

    private int id;
    private String email;
    private String password;
    private int accountDetailId;
    private int roleID;
    private int status;
    private String createDate;
    private String activeCode;

    public Account(String email, String password, int accountDetailId, int roleID, int status, String activeCode) {
        this.email = email;
        this.password = password;
        this.accountDetailId = accountDetailId;
        this.roleID = roleID;
        this.status = status;
        this.activeCode = activeCode;
    }
    

    
    
    public Account(String email, String password, int accountDetailId, int roleID, int status) {
        this.email = email;
        this.password = password;
        this.accountDetailId = accountDetailId;
        this.roleID = roleID;
        this.status = status;
    }

    public Account(int id, String email, String password, int accountDetailId, int roleID, int status, String createDate, String activeCode) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.accountDetailId = accountDetailId;
        this.roleID = roleID;
        this.status = status;
        this.createDate = createDate;
        this.activeCode = activeCode;
    }

    

    
    
    
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAccountDetailId() {
        return accountDetailId;
    }

    public int getRoleID() {
        return roleID;
    }

    public int getStatus() {
        return status;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountDetailId(int accountDetailId) {
        this.accountDetailId = accountDetailId;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "id " + id + ", email=" + email + ", password=" + password + ", accountDetailId=" + accountDetailId + ", roleID=" + roleID + ", status=" + status + ", createDate=" + createDate + ", activeCode=" + activeCode + '}';
    }
    

}
