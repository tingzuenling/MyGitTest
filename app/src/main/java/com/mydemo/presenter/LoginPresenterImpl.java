package com.mydemo.presenter;

import com.mydemo.been.User;
import com.mydemo.contract.LoginContract;
import com.mydemo.model.LoginModelImpl;

/**
 * Created by D1ngZenL1ng on 2017/03/01
 */

public class LoginPresenterImpl implements LoginContract.Presenter {
    private LoginContract.View ILoginView;
    private LoginContract.Model ILoginModel;

    public LoginPresenterImpl() {
        ILoginModel = new LoginModelImpl();
    }

    public LoginPresenterImpl(LoginContract.View ILoginView) {
        this.ILoginView = ILoginView;
        ILoginModel = new LoginModelImpl();
    }


    @Override
    public void doLogin(User user) {
        if ( ILoginModel.checkUser(user))
        {
            ILoginView.onSuccess();
        }else
            ILoginView.onFailed();

    }
}