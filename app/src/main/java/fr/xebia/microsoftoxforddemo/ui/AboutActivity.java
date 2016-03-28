package fr.xebia.microsoftoxforddemo.ui;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

import fr.xebia.microsoftoxforddemo.R;

public class AboutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        actionBar.setTitle(R.string.title_activity_about);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
