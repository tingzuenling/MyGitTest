package com.mydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mydemo.been.User;
import com.mydemo.contract.LoginContract;
import com.mydemo.presenter.LoginPresenterImpl;

public class MainActivity extends AppCompatActivity implements LoginContract.View{
      Button doLogin;
      EditText userName,passWord;
      TextView showResult;
      LoginContract.Presenter presenter;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        presenter=new LoginPresenterImpl(this);
    }

    private void initView() {
        doLogin= (Button) findViewById(R.id.doLogin);
        userName= (EditText) findViewById(R.id.user);
        passWord= (EditText) findViewById(R.id.passWord);
        showResult= (TextView) findViewById(R.id.result);

        doLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLogin();
                presenter.doLogin(user);
            }
        });
    }

    @Override
    public void onLogin() {
        user=new User(userName.getText().toString(),passWord.getText().toString());
        doLogin.setEnabled(false);
    }

    @Override
    public void onSuccess() {
        showResult.setText("Login Success");
        doLogin.setEnabled(true);
    }

    @Override
    public void onFailed() {
        showResult.setText("Login Failed");
        doLogin.setEnabled(true);
    }
}
