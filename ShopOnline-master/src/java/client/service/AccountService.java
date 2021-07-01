package client.service;

import entity.Account;
import java.util.ArrayList;
import model.AccountModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DerickT
 */
public class AccountService {

    AccountModel accountModel = new AccountModel();

    /**
     * process login services
     * @param email
     * @param password
     * @return 
     */
    public Account processLogin(String email, String password) {
        return accountModel.login(email, password);
    }
    /**
     * Get all AccountDetail in Database
     * @return list object AccountDetail
     */
    public ArrayList<Account> getAll() {
        return accountModel.getAll();
    }
    public boolean add(Account account){
        return accountModel.add(account);
    }
    public boolean isCheckDuplicateEmail(String Email){
        return accountModel.isCheckDuplicateEmail(Email);
    }
    /**
     * Get one AccountDetail by Id
     * @param id
     * @return one object AccountDetail
     */
    public Account getOne(int id) {
        return accountModel.getOne(id);
    }
    /**
     * Get one AccountDetail in Database
     *
     * @param email
     * @return one object Account
     */
    public Account getOneByEmail(String email){
        return accountModel.getOneByEmail(email);
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
        return accountModel.updatePassword(email, newPassword);
    }
    /**
     * Update Active code
     *
     * @param email
     * @param activeCode
     * @return true if update Account success, false if update Account fail
     */
    public boolean activeCode(String email, String activeCode) {
        return accountModel.activeCode(email, activeCode);
    }
}
