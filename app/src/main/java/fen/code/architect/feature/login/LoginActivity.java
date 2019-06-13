package fen.code.architect.feature.login;

import android.os.Bundle;
import fen.code.architect.R;
import fen.code.architect.base.BaseActivity;
import fen.code.architect.feature.login.presenter.LoginPresenter;

public class LoginActivity extends BaseActivity {

    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        presenter = new LoginPresenter();

        /* Call sendData function */
        presenter.sendData();
    }
}
