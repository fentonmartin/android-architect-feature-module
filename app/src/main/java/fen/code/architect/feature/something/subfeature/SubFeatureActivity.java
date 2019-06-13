package fen.code.architect.feature.something.subfeature;

import android.os.Bundle;
import fen.code.architect.R;
import fen.code.architect.base.BaseActivity;
import fen.code.architect.feature.something.subfeature.presenter.MainPresenter;

public class SubFeatureActivity extends BaseActivity {

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter();

        /* Call loadData */
        loadData();
    }

    private void loadData(){
        /* Call loadMain function */
        presenter.loadMain();
        /* Call loadMainData function */
        presenter.loadMainData();
    }
}
