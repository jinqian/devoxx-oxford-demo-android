package fr.xebia.microsoftoxforddemo.ui;

import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;
import fr.xebia.microsoftoxforddemo.R;

public class BaseActivity extends AppCompatActivity {

    @Bind(R.id.tool_bar) Toolbar toolbar;

    ActionBar actionBar;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);

        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
    }
}
