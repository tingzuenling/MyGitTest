package com.mydemo.model;
import com.mydemo.been.User;
import com.mydemo.contract.LoginContract;

/**
* Created by D1ngZenL1ng on 2017/03/01
*/

public class LoginModelImpl implements LoginContract.Model{

    @Override
    public boolean checkUser(User user) {
        if (user.getUserName().equals("tingzhunling")&&user.getPassWord().equals("1a2b3c4d5e")){
            return true;
        }else
            return false;

    }
}