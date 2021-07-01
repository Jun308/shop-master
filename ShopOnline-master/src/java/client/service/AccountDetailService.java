/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.service;

import entity.AccountDetail;
import java.util.ArrayList;
import model.AccountDetailModel;

/**
 *
 * @author Derick-T
 */
public class AccountDetailService {

    AccountDetailModel accountDetailModel = new AccountDetailModel();
    /**
     * Insert one AccountDetail to Database and return Id
     * @param accountDetail
     * @return Id AccountDetail inserted
     */
    public int addAccountDetail(AccountDetail accountDetail) {
        return accountDetailModel.addAccountDetail(accountDetail);
    }
    /**
     * Get all AccountDetail in Database
     * @return list object AccountDetail
     */
    public ArrayList<AccountDetail> getAll() {
        return accountDetailModel.getAll();
    }

    /**
     * Get one AccountDetail by Id
     * @param id
     * @return one object AccountDetail
     */
    public AccountDetail getOne(int id) {
        return accountDetailModel.getOne(id);
    }
    /**
     * Update info one AccountDetail in Database
     *
     * @param accountDetail
     * @return true if update AccountDetail success false if update
     * AccountDetail fail
     */
    public boolean update(AccountDetail accountDetail) {
        return accountDetailModel.update(accountDetail);
    }
}
