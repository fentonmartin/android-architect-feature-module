package fen.code.architect.feature.register;

import android.os.Bundle;
import fen.code.architect.R;
import fen.code.architect.base.BaseActivity;
import fen.code.architect.feature.login.presenter.LoginPresenter;
import fen.code.architect.feature.register.presenter.RegisterPresenter;

public class RegisterActivity extends BaseActivity {

    RegisterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        presenter = new RegisterPresenter();

        /* Call sendData function */
        presenter.sendData();
    }
}
