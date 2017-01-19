package com.innercirclesoftware.londair.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.innercirclesoftware.londair.LondAir;
import com.innercirclesoftware.londair.R;
import com.innercirclesoftware.londair.injection.components.ApplicationComponent;
import com.innercirclesoftware.londair.main.MainView;

import butterknife.BindView;
import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity implements Layoutable, MainView {

    @Nullable
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        setToolbar();
    }

    protected void setToolbar() {
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) onSetActionBar(actionBar);
        }
    }

    @SuppressWarnings("UnusedParameters")
    protected void onSetActionBar(@NonNull ActionBar actionBar) {

    }

    protected ApplicationComponent getComponent() {
        return getApp().getApplicationComponent();
    }

    protected LondAir getApp() {
        return (LondAir) getApplication();
    }
}
