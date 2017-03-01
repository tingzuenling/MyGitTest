package com.mydemo.contract;

import com.mydemo.been.User;

/**
 * Created by D1ngZenL1ng on 2017/3/1.
 */

public class LoginContract {
public interface View{
    void onLogin();
    void onSuccess();
    void onFailed();
}

public interface Presenter{
    void doLogin(User user);
}

public interface Model{
      boolean  checkUser(User user);
}


}